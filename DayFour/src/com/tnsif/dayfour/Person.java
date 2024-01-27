package com.tnsif.dayfour;

public class Person {
	private String personName;
	private int income;
	private int age;
	private String gender;
	private int tax;
	
	//getters and setters
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	
	//toString Method
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", income=" + income + ", age=" + age + ", gender=" + gender
				+ ", tax=" + tax + "]";
	}
	
	
	
	
	

}
