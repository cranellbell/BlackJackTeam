package frame;

import java.lang.reflect.Constructor;

import javax.swing.JFrame;

import constant.Constants;
import constant.Panels;
import panels.A_Panel;
import panels.frontPage.view.FrontPage;
import user.PersonalData;

public class Frame extends JFrame implements Constants{
	
	public Frame() {
		//첫 페이지는 프론트 페이지, 개인정보는 null 
		this.openPanel(Panels.PANEL_FRONTPAGE, null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//전체 창화면
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
	}
	
	public void openPanel(Panels openingPanel, PersonalData loginUserInfo){
		//현제 패널 지우기
		this.getContentPane().removeAll();
		//새로운 패널 생성 및 에드
		Class cls;
		A_Panel prototype = null;
		try {
			//클래스 생성
			cls = Class.forName(openingPanel.getClsName());
			//생성자 생성
			Constructor constructor = cls.getConstructor(Frame.class);
			//인스턴스 생성
			prototype = (A_Panel) constructor.newInstance(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//실행된 패널의 이름으로 프레임 설정
		this.setTitle(openingPanel.getPanelName());
		//생성된 패널 인스턴스 애드
		this.getContentPane().add(prototype);
		this.revalidate();
		this.repaint();
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame();
	}
}
