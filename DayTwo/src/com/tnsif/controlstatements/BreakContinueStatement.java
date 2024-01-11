//break statement

package com.tnsif.controlstatements;

public class BreakContinueStatement {
	public static void main(String[] args) {

		for (int i = 3; i < 10; i++) {
			if (i == 6)
				break;
			System.out.println(i);
		}
		System.out.println("End of the loop");
	}
}
