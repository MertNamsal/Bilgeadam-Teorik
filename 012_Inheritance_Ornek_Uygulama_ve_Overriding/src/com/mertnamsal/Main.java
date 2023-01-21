package com.mertnamsal;

public class Main {
	public static void main(String[] args) {
		
		Mudur mudur = new Mudur("Ali","Kaya","468413",44,20000,3,533234234L,"İnşaat Emlak Müdürü",12345L);
		
		Sekreter s = new Sekreter("Ayşe","Zehra","111111",30,12000,5,555531535L,541315343L,85434533L);
		System.out.println(s.getAd()+" "+s.getTel1SeriNo());
		
		System.out.println(mudur.getZamKatsayisi());
		System.out.println(s.getZamKatsayisi());
		
		
		

	}

}
