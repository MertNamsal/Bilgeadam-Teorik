package com.mertnamsal;

public class Main {
	
	public static void hayvani3kezKonustur(Hayvan h) {
		h.sesCikar();
		h.sesCikar();
		h.sesCikar();
	}

	
	public static void main(String[] args) {
		
		Kopek kopek = new Kopek("karabaş",5,42); 
		System.out.println(kopek.getAd()+ " "+kopek.getKilosu()+" "+kopek.getKilosu());
		
		Hayvan hayvan;       //hayvan classına nesne üretemeyiz new diyip
		hayvan = new Kedi("Tekir",3,33);
		hayvan = new Kus("Çıtır",1,12);
		
		Main.hayvani3kezKonustur(hayvan);
		Main.hayvani3kezKonustur(kopek);
		
		
	
		
	}
	
}
