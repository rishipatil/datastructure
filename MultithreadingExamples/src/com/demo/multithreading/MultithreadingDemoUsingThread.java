package com.demo.multithreading;

class Multithread extends Thread{

	@Override
	public void run() {
		try {
			System.out.println("Thread"+Thread.currentThread().getId()+" is running....");
		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught...");
		}
	}
}

public class MultithreadingDemoUsingThread{
	public static void main(String[] args) {
		int n = 8;
		for (int i = 0; i< n ; i++) {
			
			Multithread multithread = new Multithread();
			multithread.start();
		}
	}
}