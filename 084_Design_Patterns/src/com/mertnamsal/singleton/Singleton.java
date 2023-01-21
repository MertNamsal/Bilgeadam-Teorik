package com.mertnamsal.singleton;

public class Singleton {

	private static AlanHesaplayici alanHesaplayici;
	private static CevreHesaplayici cevreHesaplayici;
	
	public static AlanHesaplayici getAlanHesaplayici() {
			if(alanHesaplayici == null){
				alanHesaplayici = new AlanHesaplayici();
			}
			return alanHesaplayici;
	}
	public static CevreHesaplayici getCevreHesaplayici() {
		if(cevreHesaplayici == null) {
			cevreHesaplayici = new CevreHesaplayici();
		}
		return cevreHesaplayici;
	}
}
