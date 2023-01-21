package com.mertnamsal.repository.entity;

public class Ogretmen {
	
	private int id;
	private String adi;
	private String soyad;
	public Ogretmen(String adi, String soyad,int id) {
		super();
		this.id = id;
		this.adi = adi;
		this.soyad = soyad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	@Override
	public String toString() {
		return "Ogretmen [tcKimlikNo=" + id + ", adi=" + adi + ", soyad=" + soyad + "]";
	}
	
	
}
