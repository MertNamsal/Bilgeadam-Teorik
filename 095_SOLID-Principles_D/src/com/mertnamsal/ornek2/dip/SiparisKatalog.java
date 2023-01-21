package com.mertnamsal.ornek2.dip;

import java.util.List;

public class SiparisKatalog {
	
	public void tumSiparisleriGoster() {
		ISiparisVTIslemleri siparisVTIslemleri = SiparisFactory.getSiparisVTIslemleri();
		
		List<String> list = siparisVTIslemleri.tumSiparisleriGetir();
		
		for(String s: list) {
			System.out.println(s);
		}
	}
}
