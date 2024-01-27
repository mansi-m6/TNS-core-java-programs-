package com.tnsif.dayfour;

public class Student {
	private String StudName;
	private int RollNum;
	private  String City;
	
	//Default constructor
	
	public Student() {
		System.out.println("This is From Default Constructor:");
	}
	//getter setter method
	public String getStudName() {
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	public int getRollNum() {
		return RollNum;
	}
	public void setRollNum(int rollNum) {
		RollNum = rollNum;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Student [StudName=" + StudName + ", RollNum=" + RollNum + ", City=" + City + "]";
	}
	
	
	
	

}
