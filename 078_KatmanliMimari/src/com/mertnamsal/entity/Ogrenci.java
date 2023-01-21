package com.mertnamsal.entity;

public class Ogrenci {
	private int ogrencino;
	private String ad;
	private String soyad;
	private String cinsiyet;
	private int sinavnotu1;
	public Ogrenci(int ogrencino, String ad, String soyad, String cinsiyet, int sinavnotu1) {
		super();
		this.ogrencino = ogrencino;
		this.ad = ad;
		this.soyad = soyad;
		this.cinsiyet = cinsiyet;
		this.sinavnotu1 = sinavnotu1;
	}
	public int getOgrencino() {
		return ogrencino;
	}
	public void setOgrencino(int ogrencino) {
		this.ogrencino = ogrencino;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public int getSinavnotu1() {
		return sinavnotu1;
	}
	public void setSinavnotu1(int sinavnotu1) {
		this.sinavnotu1 = sinavnotu1;
	}
	@Override
	public String toString() {
		return "Ogrenci [ogrencino=" + ogrencino + ", ad=" + ad + ", soyad=" + soyad + ", cinsiyet=" + cinsiyet
				+ ", sinavnotu1=" + sinavnotu1 + "]";
	}
	
	
}
