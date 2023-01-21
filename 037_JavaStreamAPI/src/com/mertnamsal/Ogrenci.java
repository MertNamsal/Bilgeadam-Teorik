package com.mertnamsal;

import java.util.Random;

public class Ogrenci {
	
	private String adi;
	private int id;
	
	public Ogrenci(String adi, int id) {
		super();
		this.adi = adi;
		this.id = id;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Ogrenci [adi=" + adi + ", id=" + id + "]";
	}
	public void printSinavNotu() {
		Random r = new Random();
		System.out.println("Ogrenci "+this.adi+" sınav notu : "+r.nextInt(100));
	}
	
	
}
