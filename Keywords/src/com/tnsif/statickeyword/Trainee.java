package com.tnsif.statickeyword;

public class Trainee {
	
	String Name;
	int U_Id;
	int Age;
	static String batchNo = "SF01";
	
	public Trainee(String name, int u_Id, int age) {
		Name = name;
		U_Id = u_Id;
		Age = age;
	}
	
	@Override
	public String toString() {
		return "Trainee [Name=" + Name + ", U_Id=" + U_Id + ", Age=" + Age + ",Batch No ="+batchNo+"]";
	}
	
	

}
