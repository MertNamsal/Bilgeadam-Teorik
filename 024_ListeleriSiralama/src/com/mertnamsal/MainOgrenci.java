package com.mertnamsal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOgrenci {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Opel");
		list.add("Audi");
		list.add("VW");
		list.add("Renault");
		System.out.println(list);
		
		//collections sınıfı
		
		//collections sınıfı bir utiliy sınıfıdır.(Yani collection framework kullanırken bize yardımcı olabilcek metotları barındırır.
		
		Collections.sort(list);
		System.out.println(list);
		
		
		//Simdi kendi sınıfımızdan nesneli kullanarak nesneleri dolduralım
		List<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
		ogrenciler.add(new Ogrenci("Fatih",1050));
		ogrenciler.add(new Ogrenci("Metehan",1025));
		ogrenciler.add(new Ogrenci("Irfan",1200));
		ogrenciler.add(new Ogrenci("Buse",700));
		Collections.sort(ogrenciler);
		System.out.println(ogrenciler);
		//Nesneleri compare edelim
		Ogrenci ogr1 = new Ogrenci("Ahmet",200);
		Ogrenci ogr3 = new Ogrenci("Ahmet",200);
		Ogrenci ogr2 = new Ogrenci("Veli",202);
		System.out.println(ogr1.compareTo(ogr3));
		
		
		
		
		
		
		
	}
}
