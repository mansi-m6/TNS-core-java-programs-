package com.tnsif.multithreading;

public class Process2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<=10;i++) {
			System.out.println("Process 2 "+i);
		}
		
	}

}
