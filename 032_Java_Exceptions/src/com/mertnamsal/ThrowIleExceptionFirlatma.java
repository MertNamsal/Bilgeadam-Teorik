package com.mertnamsal;

import java.util.Scanner;

public class ThrowIleExceptionFirlatma {
	//Parametre olarak gelen hız değeri 120 den büyükse exception fırlatcaz
	public static void hizKontrol(int hiz) {
		if(hiz > 120) {
			throw new ArithmeticException();
		}else {
			System.out.println("iyi yolculuklar");
			
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hızı giriniz");
		int hiz = scan.nextInt();
		try {
			ThrowIleExceptionFirlatma.hizKontrol(hiz);
		} catch (Exception e) {
			System.out.println("Çok hızlı gidiyorsunuz, lütfen hızınızı azaltın");
		}
		
		System.out.println("Hoşçakal");
		
	}
	
	
}
