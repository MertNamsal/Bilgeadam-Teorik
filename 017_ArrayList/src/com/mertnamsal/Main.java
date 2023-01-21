package com.mertnamsal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void printArrayList(List<Kisi> list) {
		System.out.println("\n------------------------\n");
		for(Kisi k : list) {
			System.out.println("Ad : "+k.getAd()+" Soyad : "+k.getSoyad() );
		}
	}
	
	public static void printArrayList(List<String> list,int x) {
		System.out.println("\n------------------------\n");
		for(String k : list) {
			System.out.println(k);
		}
	}
	public static List<String> listeOlustur(){
		List<String> lst = new ArrayList<String>();
		lst.add("Ali");
		lst.add("Veli");
		return lst;
	}
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Totoya");
		cars.add("bmw");
		
		System.out.println(cars);
		for(String car : cars) {
			System.out.println(car);
		}
		for(int i = 0; i< cars.size();i++) {
			System.out.println(cars.get(i));
		}
		
		Kisi k1 = new Kisi("John","Smith");
		Kisi k2 = new Kisi();
		k2.setAd("Mac");
		k2.setSoyad("Donovan");
		Kisi k3 = new Kisi("Robert","Bruce");
		
		ArrayList<Kisi> list = new ArrayList<Kisi>();
		list.add(k1);
		list.add(k2);
		list.add(k3);
		Main.printArrayList(list);
		
		list.remove(1);
		Main.printArrayList(list);
		
		List<Kisi> list2 = new ArrayList<Kisi>();
		
		list2.add(new Kisi("Ahmet","Emre"));
		
		
		List<String> l = Main.listeOlustur();
		
		Main.printArrayList(l, 0);
		l.add(1,"Ayşe");
		Main.printArrayList(l, 0);
		
		//LINKED LIST 
	    // ArrayList allow fast random read access, so you can grab any element in constant time.
        // But adding or removing from anywhere but the end requires shifting all the latter elements over,
        // either to make an opening or fill the gap.
		//LinkedListlerde araya eleman ekleme ve silme arraylistlere göre dah hızlı
		//Ancak LinkedList belirli bir indexteki elemana erişim hızında daha yavaştır.
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("John");
		linkedList.add("Smith");
		
		Main.printArrayList(linkedList, 0);
		
		
		
		
		
		
	}
}
