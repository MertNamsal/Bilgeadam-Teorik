package com.mertnamsal;

import java.io.Serializable;

public class Otomobil implements Serializable {
	
	private String marka;
	private String model;
	private int yil;
	
	public Otomobil(String marka, String model, int yil) {
		super();
		this.marka = marka;
		this.model = model;
		this.yil = yil;
	}
	public String getMarka() {
		return marka;
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
	@Override
	public String toString() {
		String ozellikler = "Araba markasi : "+this.marka+" Araba modeli : "+this.model+" Yıl : "+this.yil;
		return ozellikler;
	}
	
	
}
