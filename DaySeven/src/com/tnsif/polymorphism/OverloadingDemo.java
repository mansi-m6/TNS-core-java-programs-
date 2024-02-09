package com.tnsif.polymorphism;

public class OverloadingDemo {

	public static void main(String[] args) {

//		MethodOverloading m = new MethodOverloading();
//		System.out.println(m.addition(666,9898));
		
		System.out.println("String + String :" +MethodOverloading.addition("Mansi", "Mahale"));
		System.out.println("int + int : "+MethodOverloading.addition(15,24));
		System.out.println("Float + Float : "+MethodOverloading.addition(24.6f, 15.6f));
		System.out.println("Float + Int : "+MethodOverloading.addition(21.6f, 60));
		System.out.println("Int + Float : "+MethodOverloading.addition(69, 6.3f));
	}

}
