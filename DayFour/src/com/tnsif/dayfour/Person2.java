package com.tnsif.dayfour;

import java.util.Scanner;

public class Person2 {
	public static void main(String args[]) {
		//Scanner object to to access the input from user
		Scanner sc= new Scanner(System.in);
		String personName;
		System.out.println("Enter Person Name");
		personName=sc.next();
		
		int income;
		System.out.println("Enter Person Income");
		income = sc.nextInt();
		
		int age;
		System.out.println("Enter Person Ege");
		age = sc.nextInt();
		
		String gender;
		System.out.println("Enter a Person Gender");
		gender = sc.next();
		
		int tax;
		System.out.println("Enter a tax");
		tax=sc.nextInt();
		
		Person p1=new Person();
		p1.setPersonName(personName);
		p1.setIncome(income);
		p1.setAge(age);
		p1.setGender(gender);
		p1.setTax(tax);		
		System.out.println(p1);
		
		
		
		
		
		
	}

}
