package com.mertnamsal;

public class OyunKarakteri {

	public String cevapla(String metin) {
		if(metin.equalsIgnoreCase("merhaba")) {
			return "Selam";
		}
		return "hey";
	}
	public String tepkiVer(String mesaj) {
		if(mesaj.equalsIgnoreCase("kızmak")) {
			return "Sinirlen";
		}
		return "nötr";
	}

}
