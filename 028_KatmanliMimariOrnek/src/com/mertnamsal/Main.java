package com.mertnamsal;

import java.util.Scanner;

import com.mertnamsal.controller.OgrenciController;
import com.mertnamsal.controller.OgretmenController;

public class Main {
	public static void main(String[] args) {
		
		OgrenciController ogrenciController = new OgrenciController();
		OgretmenController ogretmenController = new OgretmenController();
		
//		ogrenciController.ogrenciEkleme();
//		ogrenciController.ogrenciEkleme();
//		ogrenciController.ogrenciListesiniGoster();
//		
//		ogrenciController.ogrenciBul();
//		
//		ogrenciController.ogrenciSil();
//		ogrenciController.ogrenciListesiniGoster();
		
//		ogretmenController.ogretmenEkleme();
//		ogretmenController.ogretmenEkleme();
//		ogretmenController.ogretmenListesiniGoster();
//		ogretmenController.ogretmenSil();
//		ogretmenController.ogretmenListesiniGoster();
		
		int secim = 0;
		do {
			System.out.println("************ OKUL BİLGİ SİSTEMİ *****************");
			System.out.println("1-Öğrenci Ekleme");
			System.out.println("2-Öğrenci Silme");
			System.out.println("3-Öğrenci bilgilerini güncelleme");
			System.out.println("4-Öğrenci arama");
			System.out.println("5-Öğrenci Listesi görüntüleme");
			
			System.out.println("6-Ogretmen Ekleme");
			System.out.println("7-Ogretmen Silme");
			System.out.println("8-Ogretmen bilgilerini güncelleme");
			System.out.println("9-Ogretmen arama");
			System.out.println("10-Ogretmen Listesi görüntüleme");
			
			System.out.println("11-Çıkış");
			
			Scanner scan = new Scanner(System.in);
			secim = scan.nextInt();
			
			switch(secim) {
			case 1:
				ogrenciController.ogrenciEkleme();
				break;
			case 2:
				ogrenciController.ogrenciSil();
				break;
			case 3:
				ogrenciController.ogrenciGuncelle();
				break;
			case 4:
				ogrenciController.ogrenciBul();
				break;
			case 5:
				ogrenciController.ogrenciListesiniGoster();
				break;
			case 6:
				ogretmenController.ogretmenEkleme();
				break;
			case 7:
				ogretmenController.ogretmenSil();
				break;
			case 8:
				ogretmenController.ogretmenGuncelle();
				break;
			case 9:
				ogretmenController.ogretmenBul();
				break;
			case 10:
				ogretmenController.ogretmenListesiniGoster();
				break;
			default :
					break;
			}

		} while(secim != 11);
		
		
		
	}
}
