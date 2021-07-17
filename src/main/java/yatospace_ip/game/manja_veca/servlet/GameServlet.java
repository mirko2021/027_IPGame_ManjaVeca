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
 * Game servlte. 
 * @author MV
 * @version 1.0
 */
@WebServlet("/GameServlet")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GameServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		LoginBean login = BeanGenerator.loginBean(request.getSession()); 
		if(!login.logon()) {response.sendRedirect(request.getContextPath()+"/LoginServlet"); return; }
		NavigationBean navigation = BeanGenerator.navigationBean(request.getSession()); 
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/header/logout_executive.jsp");
		dispatcher.include(request, response); 
		dispatcher = request.getRequestDispatcher("/WEB-INF/page/logout.jsp");
		dispatcher.include(request, response); 
		dispatcher = request.getRequestDispatcher("/WEB-INF/footer/logout_navigation.jsp");
		dispatcher.include(request, response);
		if(navigation.hasNavigation()) response.sendRedirect(navigation.poolNavigation()); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
