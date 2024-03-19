package com.tnsif.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		ChildThread t1 = new ChildThread(6 , "First");
		ChildThread t2 = new ChildThread(9, "Second");
		
		t1.start();
		t2.start();
	}

}
