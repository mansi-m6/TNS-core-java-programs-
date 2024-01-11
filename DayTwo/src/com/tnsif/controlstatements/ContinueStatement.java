//Continue statement
package com.tnsif.controlstatements;

public class ContinueStatement {

	public static void main(String[] args) {
		for(int i=0;i<15;i++) {
			//even number are skipped
			if (i%2!=0) 
				
				continue;
				//print odd number
					System.out.println(i+" ");
			
		}
	}
}
