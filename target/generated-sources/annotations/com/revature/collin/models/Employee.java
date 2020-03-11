package com.revature.collin.models;

public class Employee {

	private String employeeID;
	private String employeePass;
	private String firstName;
	private String lastName;
	private String isManager;
	private static Employee empl;
	
	
	public Employee() {
		super();
	}
	
	
	
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeePass() {
		return employeePass;
	}
	public void setEmployeePass(String employeePass) {
		this.employeePass = employeePass;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIsManager() {
		return isManager;
	}
	public void setIsManager(String isManager) {
		this.isManager = isManager;
	}
	public static Employee getEmployeeObj() {
		return empl;
	}
	public static void setEmployeeObj(Employee em) {
		empl = em;
	}
}
