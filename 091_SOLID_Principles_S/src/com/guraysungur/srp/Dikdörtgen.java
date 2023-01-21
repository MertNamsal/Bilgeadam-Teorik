package com.guraysungur.srp;

public class Dikdörtgen {

	private int kenar1;
	private int kenar2;
	
	// Alttaki 2 metod matematiksel dikdörtgen hesaplamalaır ile ilgilili
	public int alanHesapla( ) {
		return (kenar1 * kenar2);
	}
	
	
	public int cevreHesapla() {
		return (2 * (kenar1 + kenar2));
	}
	
}
