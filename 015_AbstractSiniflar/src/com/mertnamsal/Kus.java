package com.mertnamsal;

public class Kus extends Hayvan {

	public Kus(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}
	
	public void sesCikar()
	{
		System.out.println("Cik cik cik...");
	}

	@Override
	public void yemekYe() {
		// TODO Auto-generated method stub
		
	}

}
