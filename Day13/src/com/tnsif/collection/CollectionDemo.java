package com.tnsif.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(6000);
		list.add(9000);
		list.add(3000);
		list.add(2000);
		list.add(7000);
		list.add(1000);
		
		System.out.println(list);
		for(int element : list) {
			System.out.println(element);
		}
		
		//collection framework
		
		Collections.sort(list);
		System.out.println("Sorted List is : "+list);
		
		Collections.reverse(list);
		System.out.println("Reverse List is : "+list);
		
		Collections.rotate(list, 5);
		System.out.println("Rotate List is : "+list);
		
		Collections.swap(list, 3, 5);
		System.out.println("Swapping List is : "+list);
		
		Comparator<Integer> comp = (n1,n2)->n2-n1;
		Collections.sort(list , comp);
		System.out.println("Sorted List Dsc"+list);
		
		
		//User Define Object
		
		ArrayList <Student> studentList = new ArrayList<Student>();
		Student s1 = new Student("Mansi" , 06 , 86);
		studentList.add(s1);
		Student s2 = new Student("Rutuja" , 05 , 80);
		studentList.add(s2);
		Student s3 = new Student("Swati" , 07 , 84);
		studentList.add(s3);
		Student s4 = new Student("Ashwini" , 03 , 90);
		studentList.add(s4);
		Student s5 = new Student("Sayali" , 04 , 70);
		studentList.add(s5);
		Student s6 = new Student("Monika" , 02 , 69);
		studentList.add(s6);
		System.out.println("\n");
		System.out.println("****** Original List ****** ");
		System.out.println(studentList);
		
		//sorting on per criteria
		Comparator<Student> comp1 = (str1,str2) ->(int)(str1.getPer()-str2.getPer());
		Collections.sort(studentList , comp1);
		System.out.println("\n");
		System.out.println("******Sorted List on the basis of percentage****** ");
		System.out.println(studentList);
		
		Comparator<Student> comp2 = (str3,str4) ->(int)(str3.getRoll_Num()-str4.getRoll_Num());
		Collections.sort(studentList , comp2);
		System.out.println("\n");
		System.out.println("******Sorted List on the basis of Roll Num****** ");
		System.out.println(studentList);
		
		
		
	}

}
