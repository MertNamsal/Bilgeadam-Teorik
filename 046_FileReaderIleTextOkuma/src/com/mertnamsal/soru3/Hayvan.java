package com.mertnamsal.soru3;

public abstract class Hayvan {
	
	private String ad;
	private int kilo;
	private int uzunluk;
	private boolean tehlikeliMi;
	public abstract void sesCikar();

	public Hayvan(String ad, int kilo, int uzunluk) {
		super();
		this.ad = ad;
		this.kilo = kilo;
		this.uzunluk = uzunluk;
		this.tehlikeliMi=false;
		
	}
	
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getKilo() {
		return kilo;
	}

	public void setKilo(int kilo) {
		this.kilo = kilo;
	}

	public int getUzunluk() {
		return uzunluk;
	}

	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}

	public boolean isTehlikeliMi() {
		return tehlikeliMi;
	}

	public void setTehlikeliMi(boolean tehlikeliMi) {
		this.tehlikeliMi = tehlikeliMi;
	}
	


	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilo=" + kilo + ", uzunluk=" + uzunluk + ", tehlikeliMi=" + tehlikeliMi + "]";
	}
	
	
	
	
	
}
