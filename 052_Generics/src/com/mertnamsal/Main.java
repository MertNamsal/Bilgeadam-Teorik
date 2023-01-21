package com.mertnamsal;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		//Genericler sayesinde tasarladığımız sınıflar tek bir sınıf tipi için değil,
		//bir şablon yapısına uyan her tip sınıf için çalışmasını sağlayan yapılardır.
		
		//Aslında biz generic konusunuCollection frameworkde uyguladık
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(5);
		listInteger.add(24);
		listInteger.add(150);
		System.out.println(listInteger);
		
		List<String> listString = new ArrayList<>();
		listString.add("Java");
		listString.add("C++");
		listString.add("C#");
		listString.add("Phyton");
		System.out.println(listString);
		
		//**************************
		
		GenericSinif<Integer> genericSinif = new GenericSinif<Integer>(20);
		System.out.println(genericSinif.getObj());
		
		GenericSinif<String>  gs = new GenericSinif<String>("Hello!");
		System.out.println(gs.getObj());
		
		GenericSinif<Kare> gsinif = new GenericSinif<Kare>(new Kare(5));
		System.out.println(gsinif.getObj());
	}
}
