package yatospace_ip.game.manja_veca.bean;

/**
 * Зрно које означава теме и шаблоне за страницу. 
 * @author MV
 * @version 1.0
 */
public class BootstrapBean {
	public static final String NO_THEME = ""; 
	public static final String BOOTSRAP_LUX = "LUX"; 
	
	private String theme = "";

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		if(theme==null) theme = "";
		this.theme = theme;
	}
	
	public boolean isBootstrapLuxTemplate() {
		return theme.contentEquals(BOOTSRAP_LUX); 
	}
	
	public boolean isNoThemeTemplate() {
		return theme.contentEquals(NO_THEME); 
	}
	
	public void setBootstrapLuxTemplate() {
		this.theme = BOOTSRAP_LUX; 
	}
	
	public void setNoThemeTemplate() {
		this.theme = NO_THEME; 
	}
}
