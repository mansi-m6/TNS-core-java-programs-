package com.tnsif.inheritance;

public class Inheritance {
	
	private String EmpName;
	private int empId;
	private String department;
	
	//getters amd setters
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	//to string method
	@Override
	public String toString() {
		return "Inheritance [EmpName=" + EmpName + ", empId=" + empId + ", department=" + department + "]";
	}
	public Inheritance(String empName, int empId, String department) {
		super();
		EmpName = empName;
		this.empId = empId;
		this.department = department;
	}
	
	//constructor
	
	
	
	
	
	
	
}
