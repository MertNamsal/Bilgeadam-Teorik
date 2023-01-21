package com.mertnamsal;

public class OrnekSoru {

	public static void main(String[] args) {
		
		//Microsof SWAP Numbers Exam Question:
		//sayi1 ve sayi2 sayılarını 3. bir değişken kullanmadan değiştirin.
		int sayi1 = -5;
		int sayi2 = 3;
		int temp;
		
		
		//templi
		/*
		temp=sayi1;
		sayi1=sayi2;
		sayi2=temp;
		System.out.println("sayı 1 :"+sayi1+" sayı 2 : "+sayi2);
		
		*/
		
		//2.Çözüm
		sayi1= sayi1+sayi2;
		sayi2=sayi1-sayi2;
		sayi1=sayi1-sayi2;
		System.out.println("sayı 1 :"+sayi1+" sayı 2 : "+sayi2);
		

	}

}
