package com.demo.multithreading;

class Multithreads implements Runnable{

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

public class MultithreadingDemoUsingRunnable{
	public static void main(String[] args) {
		int n = 8;
		for (int i = 0; i< n ; i++) {
			
			Thread thread = new Thread(new Multithreads());
			thread.start();
		}
	}
}