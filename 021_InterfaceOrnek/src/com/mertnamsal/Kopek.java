package com.mertnamsal;

public class Kopek extends Hayvan implements IKuyruklu{

	public Kopek(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);		
	}
	
	public void sesCikar() {
		System.out.println("Hav hav hav...");
	}

	@Override
	public void yemekYe() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void kuyrukSalla() {
		System.out.println(this.getAd()+" kedisi kuyruk sallıyor.");
		
	}

	

}
