package com.mertnamsal.singleton;

public class UtilityClass {

	public void hesaplamaYap() {
		
		//AlanHesaplayici alanHesaplayici;
		for (int i = 0; i < 10000; i++) {
			//alanHesaplayici = new AlanHesaplayici();
			int toplama =Singleton.getAlanHesaplayici().dikdortgenAlanHesapla(2, 4)+Singleton.getAlanHesaplayici().kareAlanHesapla(3);
			
//			int toplamCevre = (new CevreHesaplayici()).dikdortgenCevreHesapla(4, 7);
			
			int toplamCevre = Singleton.getCevreHesaplayici().dikdortgenCevreHesapla(2,4)+Singleton.getCevreHesaplayici().kareCevreHesapla(3);
		}
		
	}
}
