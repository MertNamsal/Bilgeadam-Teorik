package com.mertnamsal;

import java.util.Scanner;

public class Main {
	
	public static void hizKontrol(int hiz) {
		if(hiz > 120) {
			throw new AsiriHizException("Aşırı hız yapılmak isteniyor");
		}else {
			System.out.println("İyi yolculuklar");
		}
			
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hızı giriniz :");
		int hiz = scan.nextInt();
		
		try {
			Main.hizKontrol(hiz);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Bye");
		
		
		
	}
}
