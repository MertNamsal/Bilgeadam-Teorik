package com.mertnamsal.soru2;

public class Main {
	
	public static void main(String[] args) {
		
		CustomStringTR customStr = new CustomStringTR("Merhaba");
		System.out.println(customStr.bosMu());
		System.out.println(customStr.uzunluk());
		System.out.println(customStr.büyükHarfYapma());
		System.out.println(customStr.kücükHarfYapma());
		System.out.println(customStr.indexGetir('b'));
		System.out.println(customStr.subs(3,7));
		System.out.println(customStr.sonDeger("a"));
		System.out.println(customStr.kontrolHarf("a"));
		System.out.println(customStr.esitMi("merhaba"));
		System.out.println(customStr.buyukKucukFarketmedenEsitMi("merhaba"));
	}
}
