package com.tnsif.finalkeyword;

public class FinalKeyword {
	//final variable
	final int a= 23;

	public void change()
	{
		//a= 2; // cannot assign the value again
		System.out.println("A= "+a);
	}
	public static void main(String[] args) {
		FinalKeyword f1 = new FinalKeyword();
		f1.change();
	}

}
  