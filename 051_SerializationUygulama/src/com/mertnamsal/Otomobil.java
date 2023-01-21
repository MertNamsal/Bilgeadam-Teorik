package com.mertnamsal;

import java.io.Serializable;

public class Otomobil implements Serializable {
	
	private String marka;
	private String model;
	private int yil;
	private Motor motor;
	
	public Otomobil(String marka, String model, int yil,int motorNo) {
		super();
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.motor = new Motor(motorNo);
	}
	
	
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
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
		return "Otomobil [marka=" + marka + ", model=" + model + ", yil=" + yil + ", motor=" + motor.motorNo + "]";
	}
	
	
}
