package com.mertnamsal;

public class ForEach {

	public static void main(String[] args) {
		
		//Ornek1
		int [] dizi = {1,24,35,44,59,79,111,122};
		
		//köşeli parantez kullanmadan dizi içinde iteration yapmamız sağlar
		
		for(int sayi : dizi) {
			System.out.println(sayi);
		}
		
		//Ornek2
		
		String[] isimlerDizi = {"Ali","Veli","Osman","Ayşe"};
		for(String isim : isimlerDizi) {
			System.out.println(isim);
		}
		
		

	}

}
