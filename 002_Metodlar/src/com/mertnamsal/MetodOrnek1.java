package com.mertnamsal;

import java.util.Random;
import java.util.Scanner;

public class MetodOrnek1 {

	//random sayi üreten metod
	public static int randomNumber() {
		Random random = new Random();
		int result = random.nextInt(100);
		return result;
	}
	
	//yukarıdaki metodu 1 den bizim istediğimiz limit sayıya kadar olan bir random sayi üretsin
	public static int randomNumber(int limit) {
		Random random = new Random();
		int result = random.nextInt(limit);
		return result;
	}
	
	//Soru
	//Alt limit ve üst limiti kullanıcıdan alan bir random sayı üreten metod yazınız.
	public static int randomNumberGenerator() {
		int ustLimit;
		int altLimit;
		do {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Üst limiti giriniz : ");
		ustLimit = scan.nextInt();
		
		System.out.println("Alt limiti giriniz : ");
		altLimit = scan.nextInt();
		}
		while(ustLimit<altLimit);
		
		Random random = new Random();
		int result = random.nextInt(altLimit,ustLimit);
		return result;
	}
	public static void main(String[] args) {
		
		//Ornek metod1:
		//Random sayı üreten bir metod
		System.out.println("Random bir sayı: "+MetodOrnek1.randomNumber());
		System.out.println("Random sayu üst limiti 1000 olan :"+MetodOrnek1.randomNumber(1000));
		System.out.println("Limitini belirlediğiniz random sayı : "+MetodOrnek1.randomNumberGenerator());
		
	}

}
