package com.mertnamsal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Otomobil> cars = new ArrayList<Otomobil>();
		cars.add(new Otomobil("Opel","Astra",2011));
		cars.add(new Otomobil("Audi","A3",2015));
		cars.add(new Otomobil("BMW","1.18",2017));
		cars.add(new Otomobil("Renault","Clio",2018));
		
		for(Otomobil s : cars ) {
			System.out.println(s);
		}
		
		//Soru Audi A3 otomobilini index kullanmadan for döngüsü içinde silmeye çalışın
		//remove olmıcak
		
		//Iteratorların en önemli kullanım alanı döngü içinde gezerken istediğiniz liste elemanını silebilmenizdir.
		//For loop da bunu yapamayız.
		for (Iterator iterator = cars.iterator(); iterator.hasNext();) {
			Otomobil otomobil = (Otomobil) iterator.next();
			
			if(otomobil.getMarka().equalsIgnoreCase("Audi")&& otomobil.getModel().equalsIgnoreCase("A3")) {
				iterator.remove();
			}
		}
		System.out.println("----------------------");
		for(Otomobil s : cars ) {
			System.out.println(s);
		}
//		//Alternatif
//		ListIterator<Otomobil> listIterator = cars.listIterator();
//		while(listIterator.hasNext()) {
//			if(listIterator.next().getMarka().equals("Audi")) {
//				listIterator.remove();
//			}
//		}
		
		
		
		
		
		
		
	}
}
