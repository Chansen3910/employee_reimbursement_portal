package com.revature.collin.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.collin.dao.DataAccessObject;
import com.revature.collin.models.Employee;

/**
 * Servlet implementation class RequestFetcher
 */
public class RequestFetcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestFetcher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the session and cast the user object into employee empl.
		Employee empl = (Employee)request.getSession().getAttribute("user");
		DataAccessObject dao = new DataAccessObject();
		ArrayList requestList = dao.employeeRequests(empl);
		for(int i = 0; i > requestList.size(); i++) {
			System.out.println("Printing from requestfetcher servvlet requestlist(" + i + ") = " + requestList.get(i));
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
