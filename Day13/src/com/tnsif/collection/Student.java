package com.tnsif.collection;

public class Student {
	private String Name;
	private int Roll_Num;
	private float per;
	public Student(String name, int roll_Num, float per) {
		Name = name;
		Roll_Num = roll_Num;
		this.per = per;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRoll_Num() {
		return Roll_Num;
	}
	public void setRoll_Num(int roll_Num) {
		Roll_Num = roll_Num;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Roll_Num=" + Roll_Num + ", per=" + per + "]";
	}
	
	

}
