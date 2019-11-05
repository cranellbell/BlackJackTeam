package constant;

public enum Panels {
	//패널의 경로, 이름
	PANEL_FRONTPAGE("panels.frontPage.view.FrontPage", "FrontPage"), 
	PANEL_BLACKJACK("panels.game.blackJack.view.BlackJack", "BlackJack"), 
	PANEL_ROBBY("panels.robby.view.Robby", "Robby");
	
	String clsName;
	String panelName;
	
	private Panels(String p_clsName, String p_panelName) {
		clsName = p_clsName;
		panelName = p_panelName;
	}
	
	public String getClsName() {
		return clsName;
	}
	
	public String getPanelName() {
		return panelName;
	}
}
