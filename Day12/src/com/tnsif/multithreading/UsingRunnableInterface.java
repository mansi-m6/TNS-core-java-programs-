package com.tnsif.multithreading;

public class UsingRunnableInterface implements Runnable {
	Thread t;
	int l ,h ;
	String msg;

		
	public UsingRunnableInterface( int l, int h, String msg) {
		
		this.l = l;
		this.h = h;
		this.msg = msg;
		t=new Thread(this,"Child Thread");
		t.start();
	}


	@Override
	public void run() {

			for(int i=1;i<=h;i++) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
				System.out.println(msg+i);
			}
	}

}
