package com.mertnamsal;

import java.io.Serializable;

public class Otomobil implements Serializable {
	
	private static final long serialVersionUID =2;
	//değişiklik yaptıktan sonra serialVersionUID değişmesi lazım
	//okuma yapmak için önce güncel versiyonla yazmak gerekiyor
	private String marka;
	private String model;
	private int yil;
	private int motorHacmi;
	
	public Otomobil(String marka, String model, int yil) {
		super();
		this.marka = marka;
		this.model = model;
		this.yil = yil;
	}
	
	public int getMotorHacmi() {
		return motorHacmi;
	}

	public void setMotorHacmi(int motorHacmi) {
		this.motorHacmi = motorHacmi;
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
