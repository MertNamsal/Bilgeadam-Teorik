package com.mertnamsal;

public class Main {

	public static void main(String[] args) {
			
		Test test = new Test();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				test.thread1Metod();
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				test.thread2Metod();
				
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
