package com.mertnamsal;

public class Kutu {
	
	public int hacim;

	public static void main(String[] args) {
	
		Kutu kutu1 = new Kutu();
		kutu1.hacim = 10;
		
		Kutu kutu2 = null;
		
		if(kutu1 == kutu2) {
			System.out.println("kutu1 ve kutu2 aynı nesneyi gösteriyor.");
		}else {
			System.out.println("kutu1 ve kutu2 aynı nesne göstermiyor.");
		}
		
		System.out.println(kutu1);
		System.out.println(kutu2);
		System.out.println("\n----------------------------");
		
		kutu2= kutu1;
		if(kutu1 == kutu2) {
			System.out.println("kutu1 ve kutu2 aynı nesneyi gösteriyor.");
		}else {
			System.out.println("kutu1 ve kutu2 aynı nesne göstermiyor.");
		}
		
		System.out.println(kutu1);
		System.out.println(kutu2);
		System.out.println("\n----------------------------");
		
		kutu2 = new Kutu(); // hacimleri aynı olsa bile heap de farklı bir yerde tutulur
		System.out.println(kutu1);
		System.out.println(kutu2);
		System.out.println("\n----------------------------");
		
		Kutu kutu3;
		kutu3 = kutu2;
		
		if(kutu2 == kutu3) {
			System.out.println("kutu2 ve kutu3 aynı nesneyi gösteriyor.");
		}else {
			System.out.println("kutu2 ve kutu3 aynı nesneyi göstermiyor.");
		}
		//Soru
		kutu3.hacim = 500;
		System.out.println(kutu2.hacim);
		
		//Hatırlatma ********
		int x =30;
		int y;
		y=x;
		y++;
		System.out.println(x);
		
	}

}
