package panels.robby.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import constant.Constants;
import constant.Panels;
import frame.Frame;
import panels.A_Panel;
import user.PersonalData;

public class Robby extends A_Panel implements Constants{
	//게임시작 버튼의 위치
	public static final int GAMESTARTBUTTON_X = 10;
	public static final int GAMESTARTBUTTON_Y = 10;
	//로그인한 유저의 개인정보
	private PersonalData loginUserInfo;
	//게임 시작 버튼
	private JButton gameStartButton;
	
	public Robby(Frame frame) {
		//자신을 가진 프레임 알고 있음
		super(frame);
		this.setBackground(Color.LIGHT_GRAY);
		//블랙잭 시작버튼생성 및 위치
		gameStartButton = new JButton("블랙잭 시작");
		gameStartButton.setSize(BUTTON_X_SIZE, BUTTON_Y_SIZE);
		gameStartButton.setLocation(GAMESTARTBUTTON_X, GAMESTARTBUTTON_Y);
		//블랙잭 시작 버튼에 액션 리스너 추가
		gameStartButton.addActionListener(new gameStartButtonActionListener());
		this.add(gameStartButton);
	}
	
	//블랙잭 시작 버튼 액션 리스너
	class gameStartButtonActionListener implements ActionListener{
		//블랙잭 시작 버튼 이벤트 처리
		@Override
		public void actionPerformed(ActionEvent e) {
			//블랙잭 시작 버튼이 눌리면 블랙잭 시작
			getOwnerFrame().openPanel(Panels.PANEL_BLACKJACK, loginUserInfo);
		}
	}
}
