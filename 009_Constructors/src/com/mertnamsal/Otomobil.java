package com.mertnamsal;

public class Otomobil {
	// Herbiri otomobil sınıfından üretilecek bir nesnenin sahip olabilieceği
	// özellikler
	private String marka;             //null atama olmazsa
	private String model;
	private int yil;                 //sayisal veriler tanımlanmazsa 0 atar
	private int aracinKm;
	private Motor aracinMotoru;           //atama olmazsa default null döner
	public String getMarka() {
		return marka; 
	}
	
	public Otomobil() {
		
	}
	
	
	
	public Otomobil(String marka, String model, int yil, int aracinKm, Motor aracinMotoru) {
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.aracinKm = aracinKm;
		this.aracinMotoru = aracinMotoru;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYil() {
		return yil;
	}
	
	public void setYil(int yil) {
		this.yil = yil;
	}
	
	public int getAracinKm() {
		return aracinKm;
	}
	
	public void setAracinKm(int aracinKm) {
		this.aracinKm = aracinKm;
	}
	
	public Motor getAracinMotoru() {
		return aracinMotoru;
	}
	
	public void setAracinMotoru(Motor aracinMotoru) {
		this.aracinMotoru = aracinMotoru;
	}
	
	
}
