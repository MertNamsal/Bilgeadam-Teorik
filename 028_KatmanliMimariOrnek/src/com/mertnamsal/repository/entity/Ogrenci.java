package com.mertnamsal.repository.entity;

public class Ogrenci {
	private String adi;
	private String soyad;
	private int id;
	
	public Ogrenci(String adi,String soyad, int id) {
		super();
		this.adi = adi;
		this.soyad=soyad;
		this.id = id;
	}
	
	

	public String getSoyad() {
		return soyad;
	}



	public void setSoyad(String soyad) {
		this.soyad = soyad;
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
	
	
}
