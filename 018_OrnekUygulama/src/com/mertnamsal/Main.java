package com.mertnamsal;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Ogrenci ogrenci1 = new Ogrenci("Ahmet","Emre",450,0);
		Ogrenci ogrenci2 = new Ogrenci("Ayşe","Ekmek",451,0);
		Ogrenci ogrenci3 = new Ogrenci("Mehmet","Sert",452,0);
		Ogrenci ogrenci4 = new Ogrenci("Ali","Doğa",453,0);
		
		Sinif sinif1 = new Sinif("1A","Zemin kat 100nolu oda",new ArrayList<Ogrenci>());
		sinif1.getOgrencilerArrayList().add(ogrenci1);
		sinif1.getOgrencilerArrayList().add(ogrenci2);
		sinif1.getOgrencilerArrayList().add(ogrenci3);
		sinif1.getOgrencilerArrayList().add(ogrenci4);
		
		sinif1.siniftakiOgrencilerinListesiniYazdir();
		
		//2. sınıfımızı oluşturalım
		Ogrenci ogrenci5 = new Ogrenci("Fatoş","Sal",550,0);
		Ogrenci ogrenci6 = new Ogrenci("Semih","Şener",551,0);
		Ogrenci ogrenci7 = new Ogrenci("Büşra","Taş",552,0);
		
		ArrayList<Ogrenci> ogrencilerList = new ArrayList<Ogrenci>();
		ogrencilerList.add(ogrenci5);
		ogrencilerList.add(ogrenci6);
		ogrencilerList.add(ogrenci7);
		
		Sinif sinif2 = new Sinif("1B","Zemin kat 101 nolu oda",ogrencilerList);
		sinif2.siniftakiOgrencilerinListesiniYazdir();
		
		//3. sınıfımızı oluşturalım
		Ogrenci ogrenci8 = new Ogrenci("Nuh","Sahin",601,0);
		Ogrenci ogrenci9 = new Ogrenci("Alp","Kartal",602,0);
		Sinif sinif3 = new Sinif("1C","Zemin kat 102 nolu oda");
		sinif3.sinifaOgrenciEkle(ogrenci8);
		sinif3.sinifaOgrenciEkle(ogrenci9);
		sinif3.siniftakiOgrencilerinListesiniYazdir();
		
		//4. sınıfımızı oluşturalm
		Sinif sinif4 = new Sinif("1D","Zemin kat 103 nolu oda");
		sinif4.sinifaOgrenciEkle("Kaan","Gök",800,0);
		sinif4.sinifaOgrenciEkle("Tahsin","Yanar",801,0);
		sinif4.sinifaOgrenciEkle("Mehmet","Y",803,0);
		sinif4.siniftakiOgrencilerinListesiniYazdir();
		
	
		
		
	}
}
