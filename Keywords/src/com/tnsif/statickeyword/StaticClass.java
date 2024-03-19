package com.tnsif.statickeyword;

public class StaticClass {

	 
	static String Name ="Mansi";
	
	static class inner{
		void print() {
			System.out.println(Name);
		}
		public static void main(String[] args) {
			StaticClass.inner obj = new StaticClass.inner();
			obj.print();
		}
	}
	}


