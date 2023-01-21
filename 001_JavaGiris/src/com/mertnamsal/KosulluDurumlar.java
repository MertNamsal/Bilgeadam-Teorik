package com.mertnamsal;

import java.util.Scanner;

public class KosulluDurumlar {

	public static void main(String[] args) {/*
		int x = 20;
		if(x % 10 == 0 && x%7==0) {
			System.out.println("10'a ve 7'ye kalansız bölünür.");
		}
		else if (x%10 ==0) {
			System.out.println("Sayı 10'a kalansız bölünür");
		}
		else if (x%7 ==0) {
			System.out.println("Sayı 7'ye kalansız bölünür.");
		}
		else 
			System.out.println("10 a kalansız bölünemez");
		    System.out.println("Hoşçakalın");*/
		
		//Otomabil yaşına göre vergi dilimi tespiti
		
		//Kullanıcı girdiği otomobil yaşına göre vergi dilimi bilgisi ekrana
		
		//0-5  yas : en yüksek vergi dilimi
		//5-10 yas : Orta vergi dilimi
		//10 yas : en düşük vergi dilimi
		Scanner scan =  new Scanner(System.in);
		
		/*System.out.println("Otomobil yaşını giriniz :");
		int yas = scan.nextInt();
		if(yas<6 && yas>=0) {
			System.out.println("En yüksek vergi dilimindesiniz");
		}
		else if(yas<11) {
			System.out.println("Orta vergi dilimindesiniz");
		}
		else {
			System.out.println("En düşük vergi dilimdesiniz");
		}*/
		/*
		System.out.println("Otomobil kaç model ?");
		int model = scan.nextInt();
		int yıl = 2022;
		int yas = yıl - model;
		
		if(yas<6 && yas>=0) {
			System.out.println("En yüksek vergi dilimindesiniz");
		}
		else if(yas<11) {
			System.out.println("Orta vergi dilimindesiniz");
		}
		else {
			System.out.println("En düşük vergi dilimdesiniz");
		}*/
		//1-toplama 2-çıkarma 3-çarpma 4-bölme
		System.out.println("Lütfen işlem giriniz:");
		int key = scan.nextInt();
		
		
		switch(key) {
		case 1:
			System.out.println("toplama");
			break;
		case 2:
			System.out.println("çıkarma");
			break;
		case 3:
			System.out.println("çarpma");
			break;
		case 4:
			System.out.println("bölme"); 
			break;
		}

	}

}
