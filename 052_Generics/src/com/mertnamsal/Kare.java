package com.mertnamsal;

public class Kare {
	
	private int kenarUzunluk;

	public Kare(int kenarUzunluk) {
		super();
		this.kenarUzunluk = kenarUzunluk;
	}

	public int getKenarUzunluk() {
		return kenarUzunluk;
	}

	public void setKenarUzunluk(int kenarUzunluk) {
		this.kenarUzunluk = kenarUzunluk;
	}

	@Override
	public String toString() {
		return "Kare [kenarUzunluk=" + kenarUzunluk + "]";
	}
	
	
}
