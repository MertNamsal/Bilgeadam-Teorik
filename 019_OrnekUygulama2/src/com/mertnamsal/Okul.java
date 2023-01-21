package com.mertnamsal;

import java.util.ArrayList;

public class Okul {
	private String okulAdi;
	private String okulAdresi;
	private ArrayList<Sinif>siniflarArrayList;
	
	
	
	public Okul(String okulAdi, String okulAdresi) {
		super();
		this.okulAdi = okulAdi;
		this.okulAdresi = okulAdresi;
		this.siniflarArrayList=new ArrayList<Sinif>();
	}
	
	public void okuldakiOgrencileriYazdir() {
		for(Sinif sinif : siniflarArrayList) {
			for(Ogrenci ogrenci : sinif.getOgrencilerArrayList()) {
				System.out.println(ogrenci.getAd()+"\t"+ogrenci.getSoyad());
			}
		}
	}
	
	public void siniflariYazdir() {
		System.out.println("\n * * * *       "+this.okulAdi + " Okulundaki Sınıflar * * * *\n");
		for(Sinif sinif : siniflarArrayList) {
			System.out.println("Sınıf adı : "+sinif.getSinifAdi()+" Lokasyon : "+sinif.getLokasyon());
		}
	}
	
	public void sinifEkle(Sinif sinif) {
		this.siniflarArrayList.add(sinif);
	}
	
	public String getOkulAdi() {
		return okulAdi;
	}
	public void setOkulAdi(String okulAdi) {
		this.okulAdi = okulAdi;
	}
	public String getOkulAdresi() {
		return okulAdresi;
	}
	public void setOkulAdresi(String okulAdresi) {
		this.okulAdresi = okulAdresi;
	}
	public ArrayList<Sinif> getSiniflarArrayList() {
		return siniflarArrayList;
	}
	public void setSiniflarArrayList(ArrayList<Sinif> siniflarArrayList) {
		this.siniflarArrayList = siniflarArrayList;
	}
	
	
}
