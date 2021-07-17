package yatospace_ip.game.manja_veca.bean;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

/**
 * Navigation bean. 
 * @author MV
 * @version 1.0
 */
public class NavigationBean implements Serializable{
	private static final long serialVersionUID = -4694898248847193193L;
	
	private String navigation = "";

	public String getNavigation() {
		return navigation;
	}

	public String poolNavigation() {
		try {
			return navigation;
		}finally {
			navigation = ""; 
		}
	}
	
	public void resetNavigation() {
		navigation = ""; 
	}
	
	public void setNavigation(String navigation) {
		if(navigation==null) navigation = ""; 
		this.navigation = navigation;
	}
	
	public boolean hasNavigation() {
		return navigation.trim().length()!=0; 
	}
	
	public void setLoginDestination(HttpServletRequest request) {
		navigation = request.getContextPath()+"/LoginServlet"; 
	}
	
	public void setGameDestination(HttpServletRequest request) {
		navigation = request.getContextPath()+"/GameServlet"; 
	}
}
