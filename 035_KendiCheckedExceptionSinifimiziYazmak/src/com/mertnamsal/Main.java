package com.mertnamsal;

import java.util.Scanner;

public class Main {
	
	public static void hizKontrol(int hiz) throws AsiriHizException{
		if(hiz>120) {
			throw new AsiriHizException("Asiri hiz yapılıyor");
		}else {
			System.out.println("İyi yolculuklar");
		}
	}
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Hızı giriniz : ");
		 int hiz = scan.nextInt();
		 
		 try {
			hizKontrol(hiz);
		} catch (AsiriHizException e) {
			e.printStackTrace();
		}
	}
}
