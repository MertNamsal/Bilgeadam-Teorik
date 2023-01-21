package com.mertnamsal.ornek2.dip;

import java.util.ArrayList;
import java.util.List;

public class SiparisVTIslemleri implements ISiparisVTIslemleri {

	@Override
	public List<String> tumSiparisleriGetir() {

		// Siparişlerin VT'den geldiğini düşünün, prensibi anlatmak için
		// kolaylaştırıyoruz.
		List<String> siparisler = new ArrayList<>();
		siparisler.add("sipariş1");
		siparisler.add("sipariş2");
		siparisler.add("sipariş3");

		return siparisler;

	}

}
