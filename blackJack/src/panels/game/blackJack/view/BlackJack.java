package panels.game.blackJack.view;

import java.awt.Color;

import constant.Constants;
import frame.Frame;
import panels.A_Panel;
import user.PersonalData;

public class BlackJack extends A_Panel implements Constants{
	//입장한 유저의 개인정보
	private PersonalData loginUserInfo;
	
	public BlackJack(Frame frame) {
		//자신을 가진 프레임을 알고있음
		super(frame);
		this.setBackground(Color.BLACK);
	}
}
