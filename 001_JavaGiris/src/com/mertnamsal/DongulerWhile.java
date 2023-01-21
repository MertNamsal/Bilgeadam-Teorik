package com.mertnamsal;

import java.util.Scanner;

public class DongulerWhile {

	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		int sayi =0;
	
		while(sayi<5) {
			System.out.println(sayi);
			break;
		}*/
		
		/*int rakam =1;
		while(rakam != 0) {
			System.out.println(rakam + "'ın karesi = " + Math.pow(rakam, 2));
			rakam = scan.nextInt();
		}*/
		/*
		Scanner scan = new Scanner(System.in);
		int rakam = 0;
		while((rakam =scan.nextInt()) != 0) {
			System.out.println(rakam + "'ın karesi = " + rakam*rakam);
		}
		*/
		//do-while döngüsü
		//mekanizma kısmı en az 1 kere mutlaka çalışır
		/*
		int x=0;
		
		do {
			System.out.println(x);
			x++;
		} while (x<5);
		*/
		//Kullanıcı 0 a basana kadar kullanıcının girdiği sayının küpünü hesapla
		Scanner scan = new Scanner(System.in);
		int sayi;
		do {
			sayi = scan.nextInt();
			if(sayi == 0) {
				System.out.println("Programdan çıkılıyor.");
			}else {
				System.out.println(sayi + "'nın kübü = " + sayi*sayi*sayi);
			}
			
		} while(sayi!=0);
		
		

	}

}
