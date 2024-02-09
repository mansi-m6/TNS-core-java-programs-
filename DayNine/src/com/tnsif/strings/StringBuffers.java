package com.tnsif.strings;

public class StringBuffers {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Shanaya");
		StringBuffer sb2= new StringBuffer("Manuu");
		StringBuffer sb3= new StringBuffer("Welcome");
		
		sb.append(sb2);
		System.out.println(sb);
		
		sb2.insert(0,"Mansiiii");
		System.out.println(sb2);
		
		sb3.replace(0, 3, "Hello");
		System.out.println(sb3);
		
		System.out.println(sb3.reverse());
		
		System.out.println(sb.capacity());
		

	}

}
