package com.mertnamsal;

import java.util.ArrayList;

public class Sinif {
	private String sinifAdi;
	private String lokasyon;
	private ArrayList<Ogrenci> ogrencilerArrayList;
	
	
	public Sinif(String sinifAdi, String lokasyon, ArrayList<Ogrenci> ogrencilerArrayList) {
		super();
		this.sinifAdi = sinifAdi;
		this.lokasyon = lokasyon;
		this.ogrencilerArrayList = ogrencilerArrayList;
	}
	public Sinif(String sinifAdi, String lokasyon) {
		super();
		this.sinifAdi = sinifAdi;
		this.lokasyon = lokasyon;
		this.ogrencilerArrayList = new ArrayList<Ogrenci>();
	}
	
	public void sinifaOgrenciEkle(Ogrenci ogrenci) {
		this.ogrencilerArrayList.add(ogrenci);
	}
	public void sinifaOgrenciEkle(String ad, String soyad, int okulNo, int notOrtalamasi) {
		if(ad.length()<2 || soyad.length()<2) {
			System.err.println("Ad veya soyad 2 karakterden küçük olamaz! Öğrenci sınıfa eklenmedi");
		}else {
			this.ogrencilerArrayList.add(new Ogrenci(ad,soyad,okulNo,notOrtalamasi));
		}
		
	}
	
	public void siniftakiOgrencilerinListesiniYazdir() {
		System.out.println("\n * * * *       "+this.sinifAdi + " sınıfındaki öğrenci listesi * * * *\n");
		for(Ogrenci ogrenci : this.ogrencilerArrayList) {
			System.out.println("Ogrenci adi : "+ogrenci.getAd() + " Ogrenci soyadi : "+ogrenci.getSoyad()
								+" Ogrenci no : "+ogrenci.getOkulNo()+" Ogrenci not ort : "+ogrenci.getNotOrtalamasi());
		}
	}
	
	
	
	public String getSinifAdi() {
		return sinifAdi;
	}
	public void setSinifAdi(String sinifAdi) {
		this.sinifAdi = sinifAdi;
	}
	public String getLokasyon() {
		return lokasyon;
	}
	public void setLokasyon(String lokasyon) {
		this.lokasyon = lokasyon;
	}
	public ArrayList<Ogrenci> getOgrencilerArrayList() {
		return ogrencilerArrayList;
	}
	public void setOgrencilerArrayList(ArrayList<Ogrenci> ogrencilerArrayList) {
		this.ogrencilerArrayList = ogrencilerArrayList;
	}
	
	
	
	
}
