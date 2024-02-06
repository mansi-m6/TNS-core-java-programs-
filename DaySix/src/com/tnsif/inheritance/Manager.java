package com.tnsif.inheritance;

public class Manager extends Inheritance {
	private int teamSize;

	

	public int getTeamSize() {
		return teamSize;
	}



	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}



	public Manager(String empName, int empId, String department) {
		super(empName, empId, department);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", getTeamSize()=" + getTeamSize() + ", getEmpName()=" + getEmpName()
				+ ", getEmpId()=" + getEmpId() + ", getDepartment()=" + getDepartment() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}
