package com.guraysungur.ocp;

public class SigortaPrimiHesapla {
	
	public int sigortaPrimiHesapla(IBankaMusterisi musteri) {
		
		if (musteri.sadikMusteriMi()) {
			return 90;
		}		
		return 100;		
	}

}

// Bu haliyle artık tasarımımız OCP'ye uygun oldu.. 
