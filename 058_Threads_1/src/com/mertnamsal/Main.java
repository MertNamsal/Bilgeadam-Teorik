package com.mertnamsal;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Main thread çalışıyor..");
		
		Yazici yaziciThread1 = new Yazici("Yazici thread-1");
		Yazici yaziciThread2 = new Yazici("Yazici thread-2");
		
		yaziciThread1.start();
		yaziciThread2.start();  //kontrol JVM e geçiyor 
		
		try {
			yaziciThread1.join();
			yaziciThread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Main thread bitti çıkılıyor..");
	}
}
