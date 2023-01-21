package com.mertnamsal.ornek2;

import java.util.List;

public class SiparisKatalog {

	public void tumSiparisleriGoster() {
		SiparisVTIslemleri siparisVTIslemleri = new SiparisVTIslemleri();
		
		List<String> list = siparisVTIslemleri.tumSiparisleriGoster();
		
		for(String s: list) {
			System.out.println(s);
		}
	}
	
	//Yukarıdaki tasarım DIP'e aykırı çünkü high level class low level class'a direk bağımlı
	//Interface veya Factory gibi sınıflar kullanarak bu sınıflar üzerinden low level sınıflara bağlanabilir.
	
}
