package com.mertnamsal.soru3;

public abstract class  MemeliHayvan extends Hayvan {
	
	public MemeliHayvan(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
	}

	public abstract void yuru();

	@Override
	public String toString() {
		return "MemeliHayvan [getAd()=" + getAd() + ", getKilo()=" + getKilo() + ", getUzunluk()=" + getUzunluk()
				+ ", isTehlikeliMi()=" + isTehlikeliMi();
	}
	
	
}
