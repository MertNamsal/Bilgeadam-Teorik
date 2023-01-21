package com.mertnamsal.singleton;

public class Main {

	public static void main(String[] args) {
		
		int alan =Singleton.getAlanHesaplayici().dikdortgenAlanHesapla(5,10);
		
		UtilityClass uc = new UtilityClass();
		uc.hesaplamaYap();
	}
}
