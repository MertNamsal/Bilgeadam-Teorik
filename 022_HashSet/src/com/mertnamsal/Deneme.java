package com.mertnamsal;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Deneme {
	
	public static void main(String[] args) {
		
		HashSet<String> h1 = new HashSet<>();
		Set<String> h2 = new LinkedHashSet<>();
		Set<String> h3 = new TreeSet<>();
		Set<Ogrenci>h4 = new TreeSet<>();
		Set<Ogrenci>h5 = new LinkedHashSet<>();
		
		h1.add("ali");
		h1.add("veli");
		h1.add("Ayşe");
		System.out.println(h1);
		
		h2.add("ali");
		h2.add("veli");
		h2.add("Ayşe");
		
		System.out.println(h2);
		
		h3.add("ali");
		h3.add("alirıza");
		h3.add("veli");
		h3.add("Ayşe");
		System.out.println(h3);
		
		h4.add(new Ogrenci("ali",10));
		h4.add(new Ogrenci("veli",20));
		h4.add(new Ogrenci("ahmet",15));
		h4.add(new Ogrenci("ayşe",16));
		
		System.out.println(h4);
		
		h5.add(new Ogrenci("ali",10));
		h5.add(new Ogrenci("veli",20));
		h5.add(new Ogrenci("ahmet",15));
		h5.add(new Ogrenci("ayşe",16));
		
		System.out.println(h5);
		
		
		
	}
}
