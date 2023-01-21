package com.mertnamsal;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		
		//HashSet ler Java'da elemanlara random olarak çok hızlı bir şekilde erişebilmek amacıyla kullanılan veri yapılarıdır.
		//Bunun nedeni setleri elemanlara erişilirken hash kodlarının kullanılmasıdır.
		//Hashcode sayesinde herhangi bir input elemanı unique(benzersiz) olarak tanımlandırabilir.
		//HashSet aynı elemanları barındıramaz.
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Kus");
		hashSet.add("Kedi");
		hashSet.add("Kopek");
		
		for(String s : hashSet) {
			System.out.println(s);
		}
		
		//Asagidaki ifadeyi içinde milyonlarca kayıt olan bir arraylistte yapmaya kalkarsanız cok uzun süre alabilir.
		//HashSet çok daha kısa sürede ulaşır.
		if(hashSet.contains("Kus")){
			System.out.println("Kus set icinde mevcut");
		}else {
			System.out.println("Kus set icinde yok");
		}
		
		//Hashset2 nin hashSetden farkını bulma
		
		HashSet<String> hashSet2 = new HashSet<>();
		hashSet2.add("Kaplan");
		hashSet2.add("Kedi");
		hashSet2.add("Aslan");
		
		//Fark bulma 1.adım
		
		HashSet<String> fark = new HashSet<String>(hashSet2);   //fark hashSetine hashSet2 yi atadık
		
		//2.adım
		fark.removeAll(hashSet);
		
		System.out.println(fark);
		System.out.println(hashSet2);
		System.out.println(hashSet);
		
		
		
	}

}
