package com.mertnamsal;

public class Ogrenci implements Comparable<Ogrenci>{
	
	private String ad;
	private int yas;
	
	
	
	
	public Ogrenci(String ad, int yas) {
		super();
		this.ad = ad;
		this.yas = yas;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	@Override
	public int compareTo(Ogrenci o) {
		if(this.yas>o.yas) {
			return 1;
		}else if(this.yas==o.yas) {
			return 0;
		}else {
			return -1;
		}
		
	}
	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", yas=" + yas + "]";
	}
	
	
}
