package panels;
import javax.swing.JPanel;

import frame.Frame;

public abstract class A_Panel extends JPanel {
	//패널을 가지고 있는 프레임을 저장
	private Frame ownerFrame;
	
	public A_Panel(Frame frame) {
		this.ownerFrame = frame;
	}
	
	public Frame getOwnerFrame() {
		return ownerFrame;
	}
}
