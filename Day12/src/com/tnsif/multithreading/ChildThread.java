package com.tnsif.multithreading;

public class ChildThread extends Thread {
	private int n;
	private String msg;
	
	public ChildThread(int n , String msg) {
		
		this.n=n;
		this.msg = msg;
	}
	public void run() {
		for(int i=2;i<=n;i++) {
			System.out.println(msg + i+" "+Thread.currentThread().getName());
		}
	}

}
