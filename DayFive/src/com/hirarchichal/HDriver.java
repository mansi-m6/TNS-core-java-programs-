package com.hirarchichal;

public class HDriver {
	public static void main(String[] args) {
		Person p1=new Person("MANSI","NASHIK"); //tightly coupling 
		System.out.println(p1);
		
		
		Person p; //obj reference
		
		p=new Person("RUTUJA","NASHIK");//loose coupling //dynamic binding
		if(p instanceof Person)
		System.out.println(p);
		
		p=new Employee("Mansi","Nashik",06,60000,"TNS");
		
		if(p instanceof Employee)
			System.out.println(p);
		
		p=new Doctor("ABC","Pune","Heart","fortis");
		if(p instanceof Doctor)
		System.out.println(p);

	}

}

