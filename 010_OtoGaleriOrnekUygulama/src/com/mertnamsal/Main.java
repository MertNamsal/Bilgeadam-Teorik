package com.mertnamsal;

public class Main {
	
	public static void main(String[] args) {
		OtoGaleri kardeslerOtomotivGaleri = new OtoGaleri(5); 
		
		Otomobil otomobil1 = new Otomobil ("Opel","Corsa",2018,12400,new Motor(1000,"WGMOP123",7),40);
		kardeslerOtomotivGaleri.galeriyeOtomobilEkle(otomobil1);
		
		Otomobil otomobil2 = new Otomobil ("Opel","Astra",2019,11400,new Motor(1200,"WGMOP124",8),50);
		kardeslerOtomotivGaleri.galeriyeOtomobilEkle(otomobil2);
		
		Otomobil otomobil3 = new Otomobil ("Audi","A4",2020,11300,new Motor(1400,"WGMOP125",9),70);
		kardeslerOtomotivGaleri.galeriyeOtomobilEkle(otomobil3);
		
		kardeslerOtomotivGaleri.galeridekiOtomobilleriListele();
		
		System.out.println("Galerideki otomobil sayısı : "+ kardeslerOtomotivGaleri.getGaleridekiOtomobilSayisi());
		
		//2. OtoGaleri nesnemiz
		
		OtoGaleri galeriMahmut = new OtoGaleri(100);
		Otomobil otomobil7 = new Otomobil ("Fiat","Agea",2018,11300,new Motor(1400,"WGMOP125",8),55);
		Otomobil otomobil8 = new Otomobil ("Renault","Clio",2016,7500,new Motor(1000,"WGMOP125",5),40);
		
		galeriMahmut.galeriyeOtomobilEkle(otomobil7);
		galeriMahmut.galeriyeOtomobilEkle(otomobil8);
		galeriMahmut.galeridekiOtomobilleriListele();
		
		Otomobil[] sonuclarDizi = kardeslerOtomotivGaleri.search("Opel");
		
		
		
		
		
		
		
	}

}
