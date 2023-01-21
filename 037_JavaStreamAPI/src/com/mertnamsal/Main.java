package com.mertnamsal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	 
	public static void main(String[] args) {
		
		List<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
		ogrenciler.add(new Ogrenci("Ali",100));
		ogrenciler.add(new Ogrenci("Ayse",101));
		ogrenciler.add(new Ogrenci("Veli",102));
		ogrenciler.add(new Ogrenci("Osman",103));
		ogrenciler.add(new Ogrenci("Fatma",104));
		
		for(Ogrenci ogr : ogrenciler) {
			System.out.println("\nÖğrenci bilgisi :");
			System.out.println(ogr);
			System.out.println("---------------------");
			ogr.printSinavNotu();
		}
		System.out.println("---------------------");
		
		//Stream akış
		//Ogrenciler listesnin üzerinden gidip işlemler yapmamızı sağlar.Bir nevi akış oluşturur.
		//ogrenciler.stream() => yazığımız zaman kaynağı ögrenciler listesi olan bir akış oluşturulur.
		
		//Lambda functions :  '->' un solundaki parametredir sağındakide çalışacağı metod
		ogrenciler.stream().forEach(ogrenci -> System.out.println(ogrenci.toString()));
		System.out.println();
		
		ogrenciler.stream().forEach(ogrenci -> {
			System.out.println("Öğrenci bilgisi :");
			System.out.println(ogrenci);
			System.out.println("---------------------");
		});
		
		//Sınav notları
		ogrenciler.stream().forEach(ogrenci -> ogrenci.printSinavNotu());
		
		System.out.println("\n---------------\n");
		//Method referance deniyor.
		ogrenciler.stream().forEach(Ogrenci::printSinavNotu);             //üsttekinin kısa hali   
		// :: manası bu Ogrenci sınıfının içindeki printSinavNotu methodunu çağır demek
		
		//stream api'nin en çok kullanılan metodlarından biri
		//filter metodudur.
		
		long id102denBuyuk = ogrenciler.stream().filter(ogrenci -> ogrenci.getId()>102).count();
		System.out.println("count : "+id102denBuyuk); 
		
		//collect() metodu ile filtre sonuçlarını liste haline çevirme:
		List<Ogrenci> filtrelenmisListe = ogrenciler.stream().filter(ogrenci -> ogrenci.getId()>102).collect(Collectors.toList());
		System.out.println("* * * * ");
		System.out.println(filtrelenmisListe);
		
		//map'leme işlemi ile yeni nesneler oluşturma (Stream API ile)
		
		List<Ogrenci> mappedList = ogrenciler.stream().map(ogr -> new Ogrenci(ogr.getAdi(),ogr.getId()*100)).collect(Collectors.toList());
		System.out.println(mappedList);
		
		//Şimdi ise Map sınıfından bir nesne oluşturma (Ogrenci sınıfından istediğimiz değerleri alarak)
		System.out.println("\n- + - + - + - + -");
		Map<Integer,String>ogrenciMap = ogrenciler.stream().collect(Collectors.toMap(ogr -> ogr.getId(),ogr -> ogr.getAdi()));
		
		//Map içeriğini ekrana yazdıralım:
		ogrenciMap.forEach((key,value)-> System.out.println(key +"   "+value));
		
		System.out.println(ogrenciMap.containsKey(108));
		String s = ogrenciMap.get(102);
		System.out.println(s);
		
		
		
		
	}
}
