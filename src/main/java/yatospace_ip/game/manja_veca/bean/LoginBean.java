package yatospace_ip.game.manja_veca.bean;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

/**
 * Bean for login use case. 
 * @author MV
 * @version 1.0
 */
public class LoginBean implements Serializable{
	private static final long serialVersionUID = 8480179766967090320L;
	private String username; 
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		if(username==null) username = ""; 
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password==null) password = ""; 
		this.password = password;
	}
	
	public void login(String username, String password) {
		if(username==null) username = ""; 
		if(password==null) password = ""; 
		this.username = username; 
		this.password = password; 
	}
	
	public void login(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password"); 
		login(username, password);
	}
	
	public void logout() {
		this.username = null; 
	}
	
	public boolean logon() {
		return username!=null; 
	} 
}
