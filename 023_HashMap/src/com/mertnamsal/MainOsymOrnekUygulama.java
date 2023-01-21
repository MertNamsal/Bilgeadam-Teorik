package com.mertnamsal;

import java.util.HashMap;

public class MainOsymOrnekUygulama {
	
	public static void main(String[] args) {
		
		OgrenciOsymSonuc ogrenci1Sonuc = new OgrenciOsymSonuc("Ali", "Özkan", 88, 70,79);
		OgrenciOsymSonuc ogrenci2Sonuc = new OgrenciOsymSonuc("Mehmet", "Sek", 58, 60,91);
		OgrenciOsymSonuc ogrenci3Sonuc = new OgrenciOsymSonuc("Ayşe", "Poyraz", 45, 80,65);
		OgrenciOsymSonuc ogrenci4Sonuc = new OgrenciOsymSonuc("Batu", "Sen", 45, 35,63);
		
		//key : Integer(TcKimlikNo)            ->   value : OgrenciOsymSonuc
		HashMap<Integer, OgrenciOsymSonuc> hashMap = new HashMap<Integer, OgrenciOsymSonuc>();
		hashMap.put(201706090,ogrenci1Sonuc);
		hashMap.put(201706091,ogrenci2Sonuc);
		hashMap.put(201706092,ogrenci3Sonuc);
		hashMap.put(201706093,ogrenci4Sonuc);
		
		//Sorgu
		OgrenciOsymSonuc sonuc = hashMap.get(201706090);
		System.out.println(sonuc);
		
		sonuc = hashMap.get(201706092);
		System.out.println(sonuc);
	}
}
