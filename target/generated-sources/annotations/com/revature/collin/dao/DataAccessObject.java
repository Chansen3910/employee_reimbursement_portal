package com.revature.collin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.revature.collin.models.Employee;
import com.revature.collin.servlets.FirstServlet;



public class DataAccessObject {
	
	//CONNECTION COMPONENTS
	//CONNECTION OBJECTS
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet resultSet = null;
	//CONNECTION CREDENTIALS
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String user = "Burbank";
	private String password = "crhcrh";
	private String query;

	
	
	
	//CHECK THE LOGIN CREDENTIALS AND GENERATE THE APPROPRIATE PAGE.
	public void checkLogin(Employee empl) {
		this.getConnection();
		try {
			stmt = conn.createStatement();
			query = "SELECT EMP_ID, PASS FROM EMP_ACCOUNTS WHERE EMP_ID = '" + empl.getEmployeeID() + "'";
			resultSet = stmt.executeQuery(query);
			while(resultSet.next()) {
				if(resultSet.getString(2).equals(empl.getEmployeePass())) {
					//build employee model.
					buildModel(empl);
					FirstServlet.setLoginSuccess(true);
				} else {
					FirstServlet.setLoginSuccess(false);
				}
			}
			
		} catch(SQLException e) {
			FirstServlet.setLoginSuccess(false);
			e.printStackTrace();
		}
		this.closeConnection();
	}
	//BUILD THE EMPLOYEE MODEL FROM VALID LOGIN CREDENTIALS.
	private void buildModel(Employee empl) {
		try {
			stmt = conn.createStatement();
			query = "SELECT * FROM EMP_ACCOUNTS WHERE EMP_ID = '" + empl.getEmployeeID() + "'";
			resultSet = stmt.executeQuery(query);
			while(resultSet.next()) {
				empl.setEmployeeID(resultSet.getString(1));
				empl.setEmployeePass(resultSet.getString(2));
				empl.setFirstName(resultSet.getString(3));
				empl.setLastName(resultSet.getString(4));
				empl.setIsManager(resultSet.getString(5));
			}
			Employee.setEmployeeObj(empl);
			if(empl.getIsManager().contains("y")) {
				FirstServlet.setManager(true);
			} else {
				FirstServlet.setManager(false);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//RETRIEVE ALL REQUESTS FROM AN EMPLOYEE.
	public ArrayList employeeRequests(Employee empl) {
		ArrayList listOfRequests = new ArrayList();
		System.out.println(empl.getEmployeeID());
		this.getConnection();
		try {
			stmt = conn.createStatement();
			query = "SELECT DATE_CREATED, AMOUNT, DESCRIPT, STATUS FROM REIMB_REQUESTS WHERE submitted_by = '" + empl.getEmployeeID() + "'";
			resultSet = stmt.executeQuery(query);
			while(resultSet.next()) {
				for(int i = 0; i > 12; i++) {
					listOfRequests.add(resultSet.getString(i));
					System.out.println(resultSet.getString(i) + " added to arraylist.");
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		this.closeConnection();
		return(listOfRequests);
	}

	//FIRST METHOD TO CALL BEFORE WORKING WITH DATABASE. - TESTED WORKING
	public void getConnection() {
		try {
			Class.forName ("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		}catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//LAST METHOD TO CALL AFTER WORKING WITH DATABASE. - TESTED WORKING
	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
