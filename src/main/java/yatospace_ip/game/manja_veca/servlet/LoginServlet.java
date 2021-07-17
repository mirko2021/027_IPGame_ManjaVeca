package yatospace_ip.game.manja_veca.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import yatospace_ip.game.manja_veca.bean.LoginBean;
import yatospace_ip.game.manja_veca.bean.NavigationBean;
import yatospace_ip.game.manja_veca.util.BeanGenerator;

/**
 * Login servlet. 
 * @author MV
 * @version 1.0
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		LoginBean login = BeanGenerator.loginBean(request.getSession()); 
		if(login.logon()) {response.sendRedirect(request.getContextPath()+"/GameServlet"); return; }
		NavigationBean navigation = BeanGenerator.navigationBean(request.getSession()); 
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/header/login_executive.jsp"); 
		dispatcher.include(request, response);
		dispatcher = request.getRequestDispatcher("/WEB-INF/page/login.jsp"); 
		dispatcher.include(request, response);
		dispatcher = request.getRequestDispatcher("/WEB-INF/footer/login_navigation.jsp"); 
		dispatcher.include(request, response); 
		if(navigation.hasNavigation()) response.sendRedirect(navigation.poolNavigation()); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
