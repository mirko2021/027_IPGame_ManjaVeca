package yatospace_ip.game.manja_veca.util;

import javax.servlet.http.HttpSession;

import yatospace_ip.game.manja_veca.bean.BootstrapBean;
import yatospace_ip.game.manja_veca.bean.GameBean;
import yatospace_ip.game.manja_veca.bean.LoginBean;
import yatospace_ip.game.manja_veca.bean.NavigationBean;

/**
 * Generate beans. 
 * @author MV
 * @version 1.0
 */
public final class BeanGenerator {
	private BeanGenerator() { }
	
	public static final String BOOTSTRAP_BEAN   = "bootstrapBean"; 
	public static final String NAVIGATION_BEAN  = "navigationBean"; 
	public static final String LOGIN_BEAN       = "loginBean"; 
	public static final String GAME_BEAN        = "gameBean"; 
	
	public static LoginBean loginBean(HttpSession session) {
		LoginBean loginBean = (LoginBean) session.getAttribute(LOGIN_BEAN); 
		if(loginBean==null) {
			loginBean = new LoginBean(); 
			session.setAttribute(LOGIN_BEAN, loginBean);
		}
		return loginBean;
	}
	
	public static GameBean gameBean(HttpSession session) {
		GameBean gameBean = (GameBean) session.getAttribute(GAME_BEAN); 
		if(gameBean==null) {
			gameBean = new GameBean(); 
			session.setAttribute(GAME_BEAN, gameBean); 
		}
		return gameBean; 
	}
	
	public static NavigationBean navigationBean(HttpSession session) {
		NavigationBean navigationBean = (NavigationBean) session.getAttribute(NAVIGATION_BEAN); 
		if(navigationBean==null) {
			navigationBean = new NavigationBean(); 
			session.setAttribute(NAVIGATION_BEAN, navigationBean);
		}
		return navigationBean; 
	}
	
	public static BootstrapBean bootstrapBean(HttpSession session) {
		BootstrapBean bootstrapBean = (BootstrapBean) session.getAttribute(BOOTSTRAP_BEAN); 
		if(bootstrapBean==null) {
			bootstrapBean = new BootstrapBean(); 
			session.setAttribute(BOOTSTRAP_BEAN, bootstrapBean);
		}
		return bootstrapBean; 
	}
}
