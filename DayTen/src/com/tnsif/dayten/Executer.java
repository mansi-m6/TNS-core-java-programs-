//Entity Relationship

package com.tnsif.dayten;

public class Executer {

	public static void main(String[] args) {
		
		Student arr[];   //Array declaration
		arr = new Student[6]; //Array creation
		
		//Array Initialization
		arr[0] = new Student("Mansi",1);
		arr[1]= new Student("Rutuja", 2);
		arr[2]= new Student("Ashwini",3);
		arr[3]= new Student("Swati",4);
		arr[4]= new Student("Harshada",5);
		arr[5]= new Student("Gayatri",6);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Student Array Element "+i +" : "+arr[i].getName()+" "+arr[i].getRollNum());
		}
	}

}
