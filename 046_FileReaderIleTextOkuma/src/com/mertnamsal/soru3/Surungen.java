package com.mertnamsal.soru3;

public abstract class Surungen extends Hayvan {

	public Surungen(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		// TODO Auto-generated constructor stub
	}

	public abstract void surun();

	@Override
	public String toString() {
		return "Surungen [getAd()=" + getAd() + ", getKilo()=" + getKilo() + ", getUzunluk()=" + getUzunluk()
				+ ", isTehlikeliMi()=" + isTehlikeliMi() + "]";
	}
	
	
}
