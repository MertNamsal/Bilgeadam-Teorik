package com.mertnamsal;

public class Main {
	public static void main(String[] args) {
		
		//bir alt sınıfın bir üst sınıfı olabilir
		
//		Muhendis muhendis1 = new Muhendis();
//		muhendis1.setAd("Ali");
//		muhendis1.setSoyad("Kaya");
//		muhendis1.setTcKimlikNo("1651685464");
//		
//		
//		Mudur mudur = new Mudur();
//		mudur.setAd("Ahmet");
//		
//		IdariMemur idariMemur = new IdariMemur();
//		idariMemur.setAd("Ayşe");
//		idariMemur.setGorevi("D.Başkanı Sekreteri");
//		
		Muhendis m = new Muhendis(); // mühendis içi default constructorın içinde super() oldugu için personelin constructorını çağırdı
		
		
		Sekreter s = new Sekreter(654166516L); // super() yazmasakta üst sınıfın constructorını çağırıyor.
	}

}
