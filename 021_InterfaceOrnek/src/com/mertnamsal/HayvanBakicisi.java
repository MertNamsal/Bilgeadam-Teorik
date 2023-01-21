package com.mertnamsal;

import java.util.ArrayList;

public class HayvanBakicisi {
	
	public void hayvanlariOynat(IKuyruklu kuyrukluHayvan) {
		System.out.println("Hayvan bakıcısı hayvanları oynatıyor...");
		kuyrukluHayvan.kuyrukSalla();
		kuyrukluHayvan.kuyrukSalla();
	}
	public void hayvaniOynat(ArrayList<IKuyruklu>kuyrukluHayvan) {
		
	}
}
