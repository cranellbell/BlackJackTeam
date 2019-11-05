package panels.frontPage.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import constant.Constants;
import constant.Panels;
import frame.Frame;
import panels.A_Panel;
import user.PersonalData;

public class FrontPage extends A_Panel implements Constants{
	//로그인 버튼의 위치
	public static final int LOGINBUTTON_X = 10;
	public static final int LOGINBUTTON_Y = 10;
	//로그인 유저 개인정보 저장
	private PersonalData loginUserInfo;
	//로그인 버튼
	private JButton loginButton;
	
	public FrontPage(Frame frame) {
		//자신을 가진 프레임을 알고 있음
		super(frame);
		this.setBackground(Color.LIGHT_GRAY);
		//로그인 버튼 생성 및 위치
		loginButton = new JButton("로그인");
		loginButton.setSize(BUTTON_X_SIZE, BUTTON_Y_SIZE);
		loginButton.setLocation(LOGINBUTTON_X, LOGINBUTTON_Y);
		//로그인 버튼 액션 리스너 추가
		loginButton.addActionListener(new LoginButtonActionListener());
		//패널에 로그인 버튼 추가
		this.add(loginButton);
		
	}
	//로그인 버튼 액션 리스너
	class LoginButtonActionListener implements ActionListener{
		//로그인 버튼 이벤트 처리
		@Override
		public void actionPerformed(ActionEvent e) {
			//로그인시 로비 입장
			getOwnerFrame().openPanel(Panels.PANEL_ROBBY, loginUserInfo);
		}
	}
}
