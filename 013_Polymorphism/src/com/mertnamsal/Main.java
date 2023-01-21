package com.mertnamsal;

public class Main {
	
	//POLYMORPHISM (ÇOK BİÇİMLİLİK)
	
	//Bir nesne referansının farklı nesneler gibi davranabilmesi
	
	public static void yeniMaasiHesapla(Personel personel) {
		System.out.println(personel.getZamKatSayisi()*personel.getMaas());
		System.out.println(personel.getZamKatSayisi());
	}
	
	
	public static void main(String[] args) {
		
		Mudur mudur = new Mudur("Ali","Kaya","468413",44,10000,3,533234234L,"İnşaat Emlak Müdürü",15616);
		Main.yeniMaasiHesapla(mudur);
		
		Muhendis muhendis = new Muhendis("Ali","Kaya","468413",44,10000,3,533234234L,"İnşaat Emlak Müdürü");
		Main.yeniMaasiHesapla(muhendis);
		
		
	}

}
