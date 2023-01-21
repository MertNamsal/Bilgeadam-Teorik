package com.mertnamsal;

import java.util.Scanner;

public class DiziOrnek1 {

	public static void main(String[] args) {
		//kullanıcıdan bir sayı alın Aldığınız sayı boyutunda bir tamsayı (int) dizisi oluşturun.
		//kullanıcının girdiği sayı kadar kullanıcıdan int tamsayı girmesini isteyin
		//for loop ile dizi içeriğini yazdır
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç sayı girmek istersiniz : ");
		int sayi = scan.nextInt();
		int dizi[]= new int[sayi];
		
		for(int i = 0 ; i<sayi;i++) {
			System.out.println(i+". index değerini giriniz");
			dizi[i]=scan.nextInt();
			
		}
		for(int i = 0;i<sayi;i++) {
			System.out.println(dizi[i]);		}
		
	}

}
