package com.mertnamsal;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	
		
		//1. sınıfımızı oluşturalm
		Sinif sinif4 = new Sinif("1D","Zemin kat 103 nolu oda");
		sinif4.sinifaOgrenciEkle("Kaan","Gök",800,0);
		sinif4.sinifaOgrenciEkle("Tahsin","Yanar",801,0);
		sinif4.siniftakiOgrencilerinListesiniYazdir();
		
		Sinif sinif1 = new Sinif("1C","Zemin kat 102 nolu oda");
		sinif1.sinifaOgrenciEkle("Ali","Göker",501,0);
		sinif1.sinifaOgrenciEkle("Turan","Alp",502,0);
		sinif1.sinifaOgrenciEkle("Ahmet","Alper",503,0);
		sinif1.siniftakiOgrencilerinListesiniYazdir();
		
		Okul okul1 = new Okul("Atatürk ilkokulu","Çiçek sok.no 15");
		okul1.sinifEkle(sinif1);
		okul1.sinifEkle(sinif4);
		okul1.siniflariYazdir();
		okul1.okuldakiOgrencileriYazdir();
		
		//toString konusu
		System.out.println("\n------------------------------------------\n");
		Ogrenci ogr = new Ogrenci("John","Nash",300,0);
		System.out.println(ogr);
		
		
		
	
		
		
	}
}
