package com.mertnamsal;

//Ata sınıf veya üst sınıf olarak geçer ( Parent class)
public class Personel {
	private String ad;
	private String soyad;
	private String tcKimlik;
	private String yas;
	private int maas;	
	private String kidemBilgisi;
	private long cepTelNo;
	
	public Personel() {
		System.out.println("Personel sınıfın constructor çağrıldı.");
	}
	public Personel(String str) {
		System.out.println("Personel sınıfı 2. constructor çağrıldı.");
	}
	
	public String getTcKimlik() {
		return tcKimlik;
	}
	public void setTcKimlik(String tcKimlik) {
		this.tcKimlik = tcKimlik;
	}
	public long getCepTelNo() {
		return cepTelNo;
	}
	public void setCepTelNo(long cepTelNo) {
		this.cepTelNo = cepTelNo;
	}
	public String getKidemBilgisi() {
		return kidemBilgisi;
	}
	public void setKidemBilgisi(String kidemBilgisi) {
		this.kidemBilgisi = kidemBilgisi;
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
	public String getYas() {
		return yas;
	}
	public void setYas(String yas) {
		this.yas = yas;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	public String getTcKimlikNo() {
		return tcKimlik;
	}
	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlik = tcKimlikNo;
	}
	
	

}
