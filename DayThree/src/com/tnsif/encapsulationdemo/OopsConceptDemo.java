//Demostrate Encapsulation

package com.tnsif.encapsulationdemo;

public class OopsConceptDemo {
	private int serialNum;
	private String name;
	private int age;
	
	//Getters and Setters
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//DefaultConstructor
	
	public OopsConceptDemo() {
		super();
	}
	//constructor
	public OopsConceptDemo(int serialNum, String name, int age) {
		super();
		this.serialNum = serialNum;
		this.name = name;
		this.age = age;
	}
	
	//Object Class method
	@Override
	public String toString() {
		return "OopsConceptDemo [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
