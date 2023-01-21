package com.mertnamsal;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorOrnek3 {
	
	public static void main(String[] args) {
		
		
		//List iterator kullanımı: 
//		  next() : ileri
//        previous(): geri
//        hasNext(): ileride eleman varmı?
//        hasPrevious(): geride elaman varmı? true yada false
		
		List<String> list = new ArrayList<>();
		list.add("Ahmet");
		list.add("Müjdat");
		list.add("Kaan");
		System.out.println(list);
		
		//Listeyi baştan sona gezmek için
		ListIterator<String> listIterator = list.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		
		//Listeyi sondan başa doğru gezme
		System.out.println("\n------------------\n");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		
	}
}
