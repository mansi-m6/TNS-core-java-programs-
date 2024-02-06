package com.encapsulProg;

public class EncapsulationDriver {

	public static void main(String[] args) {
		//Object Creation using new keyword
		
		EncapsulationProg ep=new EncapsulationProg();
		ep.setName("MANSI");
		ep.setAge(21);
		ep.setBankName("UNION BANK");
		ep.setAddress("NAHSIK ROAD");
		
		System.out.println("Your Bank Details are :\n "+ep);
	}

}
