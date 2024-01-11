//To demontrate For Each Loop

package com.tnsif.controlstatements;

public class ForEachLoop {

	public static void main(String[] args) {
		int n[]= {10,20,30,40,50,60}; //integer array
//		for(int i=0;i<=n.length-1;i++) {
//			System.out.println(n[i]);
//		}
		
		//forEach loop
		
		for(int i:n) {
			System.out.println(i*6);
		}
		
		//String names
		
		String name[]={"Mansi","Rutuja","Swati"};
		for(String m : name) {
			System.out.println("Student Names are:"+m);
		}
		

	}

}
