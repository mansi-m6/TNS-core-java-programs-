package com.tnsif.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		//way1
		UsingRunnableInterface u1 = new UsingRunnableInterface(10,20,"Hello");
		
		//way2
		Runnable runnable = new Runnable(){
			public void run() 
			{
				System.out.println("Runnable with the help of Anonymous class");
			}
		
	};
	Thread t1 = new Thread(runnable);
	t1.start();
	}

}
