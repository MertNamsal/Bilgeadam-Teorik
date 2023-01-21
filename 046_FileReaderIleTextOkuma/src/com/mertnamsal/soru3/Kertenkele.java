package com.mertnamsal.soru3;

public class Kertenkele extends Surungen {

	public Kertenkele(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void surun() {
		System.out.println(this.getAd()+" sürünüyor.");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd()+" ses çıkarıyor");
		
	}

	
	
	

}
