package com.tnsif.exception;

public class Exceptions {

	public static void main(String[] args) {
		int arr[];
		try {
				arr = new int[] {10 , 20 , 30 , 40 , 50 , 60};
				System.out.println(arr[6]);		
			}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.err.println("Specifiesd index does not exist ."+e.getMessage());
			
		}
		finally {
			System.out.println("Heyyy I am finally");
		}
	}

}
