package com.revature.collin.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.collin.dao.DataAccessObject;
import com.revature.collin.models.Employee;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    private static boolean loginSuccess;
    private static boolean manager;
	
    
	/**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    //out.print("<h2>This is my main servlet</h2>");
	//RequestDispatcher dispatcher = request.getRequestDispatcher("/FS");
	//dispatcher.forward(request, response);
	//dispatcher.include(request, response);
	//dispatcher.sendRedirect("http://www.google.com");
	//String Employee_ID = request.getParameter("inputEID");
	//String Employee_Pass = request.getParameter("inputPass");
    //response.setContentType("text/html");
	//PrintWriter out = response.getWriter();
	//out.print("<h2>This is my main servlet</h2>");
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Employee empl = new Employee();
		DataAccessObject dao = new DataAccessObject();
		empl.setEmployeeID(request.getParameter("inputEID"));
		empl.setEmployeePass(request.getParameter("inputPass"));
		dao.checkLogin(empl);
		if(loginSuccess == true) {
			session.setAttribute("user", empl);
			if(manager == true) {
				RequestDispatcher dispatcher=getServletContext().getRequestDispatcher( "/WEB-INF/manager-welcome/index.jsp" );
				dispatcher.forward( request, response );
			} else {
				RequestDispatcher dispatcher=getServletContext().getRequestDispatcher( "/WEB-INF/employee-welcome/index.jsp" );
				dispatcher.forward( request, response );
			}
		}else {
			RequestDispatcher dispatcher=getServletContext().getRequestDispatcher( "/WEB-INF/login-invalid/index.jsp" );
			dispatcher.forward( request, response );
		}
	}
	
    public static boolean isLoginSuccess() {
		return loginSuccess;
	}
	public static void setLoginSuccess(boolean loginSuccess) {
		FirstServlet.loginSuccess = loginSuccess;
	}
	
	
	public static boolean isManager() {
		return manager;
	}
	public static void setManager(boolean manager) {
		FirstServlet.manager = manager;
	}

}
