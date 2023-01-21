package com.mertnamsal.ornek2.dip;

public class SiparisFactory {

	public static ISiparisVTIslemleri getSiparisVTIslemleri() {
		return new SiparisVTIslemleri();
	}
}
