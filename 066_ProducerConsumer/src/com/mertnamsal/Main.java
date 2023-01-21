package com.mertnamsal;

public class Main {
	
	public static void main(String[] args) {
		
		Stock stock = new Stock();
		
		Thread producer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				stock.produce();
				
			}
		});
		
		Thread consumer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				stock.consume();
				
			}
		});
		producer.start();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		consumer.start();
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
