package com.tnsif.multithreading;

public class MultiT {

	public static void main(String[] args) {
		Process1 p1 = new Process1();
		Process2 p2 = new Process2();
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);

			t1.start();
			t2.start();
			
	}

}
