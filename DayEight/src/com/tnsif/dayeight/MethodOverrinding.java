package com.tnsif.dayeight;

public class MethodOverrinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sbi s = new Sbi();
		Icici i = new Icici();
		Hdfc h = new Hdfc();
		
		System.out.println("Interest of SBI : "+s.getRateOfIntrest());
		System.out.println("Interest of ICICI : "+i.getRateOfIntrest());
		System.out.println("Interest of HDFC : "+h.getRateOfIntrest());
		
	}

}
