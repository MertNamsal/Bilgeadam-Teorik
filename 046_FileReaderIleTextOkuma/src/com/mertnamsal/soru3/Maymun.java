package com.mertnamsal.soru3;

public class Maymun extends MemeliHayvan{

	public Maymun(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);

	}

	@Override
	public void yuru() {
		System.out.println(this.getAd()+" yürüyor.");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd()+" bağırıyorr.");
		
	}

	
	

}
