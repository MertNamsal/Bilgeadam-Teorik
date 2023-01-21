package com.mertnamsal;

public class Dikdortgen {
	public int kisaKenar;
	public int uzunKenar;
	
	public int alanHesapla() {
		return(kisaKenar * uzunKenar);
	}
	public static void main(String[] args) {
		Dikdortgen dikdortgen = new Dikdortgen();
		dikdortgen.kisaKenar=10;
		dikdortgen.uzunKenar=20;
		System.out.println(dikdortgen.alanHesapla());
		
		
	}

}
