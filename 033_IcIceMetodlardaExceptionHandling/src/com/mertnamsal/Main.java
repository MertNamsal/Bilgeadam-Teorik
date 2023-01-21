package com.mertnamsal;

public class Main {
	
	
	public void function3() {
		int x = 20 / 0;
		System.out.println("function3 sonu...");
	}
	
	public void function2() {
		
			function3();

		
		System.out.println("function2 sonu");
	}
	
	public void function1() {
		try {
			function2();
		} catch (Exception e) {
			
		}
		
		System.out.println("function 1 sonu");
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		main.function1();
	}
}
