package com.tnsif.dayten;

public class Student {
	private String Name;
	private int RollNum;
	
	
	public Student(String name, int rollNum) {
		super();
		Name = name;
		RollNum = rollNum;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNum() {
		return RollNum;
	}
	public void setRollNum(int rollNum) {
		RollNum = rollNum;
	}
	
	
	
}
