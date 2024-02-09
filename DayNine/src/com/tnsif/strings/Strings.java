package com.tnsif.strings;

public class Strings {
	public static void main(String args[])
	{
		String str="Mansi";
		String str1="Mahale";
		String str2=new String("TNSIF");
		String str3=new String("TNSIF");
		System.out.println("Length of "+str+" is :" +str.length());
		System.out.println("Character present in 4th position of String is:" +str.charAt(1));
		System.out.println(str.charAt(4));
		System.out.println(str.concat(" "+str1));
		System.out.println(str.replace('M','u'));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.compareTo(str1));
		System.out.println(str.lastIndexOf(4));
		System.out.println(str.substring(2,4));
		System.out.println(str.startsWith("M"));
		System.out.println(str.endsWith("i"));
		System.out.println(str.replaceAll("Mansi", "Welcome"));
		
		System.out.println(str3.isEmpty());
		System.out.println(str3.isBlank());
		
		//==
		System.out.println("str==str1"+str==str1);
		System.out.println("str==str2"+str==str2);
		System.out.println("str3==sttr2"+str3==str2);
		
		//equals()
		System.out.println("str equals str2" +str.equals(str1));
		System.out.println("str equals str2" +str.equals(str2));
		System.out.println("str3 equals str2" +str3.equals(str2));
		
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println(str.compareToIgnoreCase("Mani"));
	}
}
