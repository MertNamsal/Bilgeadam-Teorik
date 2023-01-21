package com.mertnamsal;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Main thread çalışıyor");
		
		Thread printer1 = new Thread(new Yazici("Printer-1"));
		Thread printer2 = new Thread(new Yazici("Printer-2"));
		
		printer1.start();
		printer2.start();
		
		
		System.out.println("Main thread çıkıyor");
		
	}
}
