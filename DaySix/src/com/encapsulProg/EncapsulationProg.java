package com.encapsulProg;

public class EncapsulationProg {
	private String Name;
	private int age;
	private String BankName;
	private String Address;
	
	//Getter Setter
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	@Override
	public String toString() {
		return "EncapsulationProg [Name=" + Name + ", age=" + age + ", BankName=" + BankName + ", Address=" + Address
				+ "]";
	}
	
	
	

}
