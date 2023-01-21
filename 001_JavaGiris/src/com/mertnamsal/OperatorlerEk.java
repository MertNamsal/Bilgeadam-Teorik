package com.mertnamsal;

public class OperatorlerEk {

	public static void main(String[] args) {
		/*
		int a=3;
		int b=a++;
		System.out.println(b);
		*/
		int a =3;
		int b =4;
		int z =5;
		//int toplam = a++ + ++b + --z;
		//System.out.println(toplam);
		
		//2 + 4 +5 -5 +2
		int toplam = --a + b++ + z++ - --z + a++;
		System.out.println(toplam);
		
		

	}

}
