package com.tnsif.exception;

import java.util.*;
import java.util.Scanner;

public class MultiCatch{
	public static void divide() {
		
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Operand for division: ");
		
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division is ="+c);
			
		}
		catch(InputMismatchException e) 
		{
			
			System.out.println("Invalid Input please insureing integer inputs only.");
			
		}
		catch(ArithmeticException e)
		{
			
			System.err.println("Exception caught:"+e.getMessage());
			
		}
		catch(Exception e) 
		{
			
			System.err.println("Exception caught:"+e.getMessage());
		}
		finally
		{
			sc.close();
		}
		
	}

}
