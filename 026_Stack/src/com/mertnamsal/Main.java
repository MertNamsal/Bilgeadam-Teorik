package com.mertnamsal;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); // içinde synchronized metodlar bulunur, vector gibi threadlerle kullanılabilir
				
		stack.add("Kedi");
		stack.add("Köpek");
		stack.add("Aslan");
		stack.add("Kuş");
		
		for(String s : stack) {
			System.out.println(s);
		}
		
		
		//LIFO Mantığı
		//son giren ilk çıkar
		//son gireni alır
		System.out.println();
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println("-----------------------");
		//stack e son giren elemanı çıkar pop()
		System.out.println(stack.pop());
		System.out.println("-----------------------");
		
		//Stack boşmu kontrolü isEmpty()
		System.out.println("Stack boşmu : "+stack.isEmpty());
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("Stack boşmu : "+stack.isEmpty() );
	}
}
