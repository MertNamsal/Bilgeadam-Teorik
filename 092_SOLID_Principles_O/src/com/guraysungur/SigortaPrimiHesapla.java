package com.guraysungur;

public class SigortaPrimiHesapla {
	
	public int sigortaPrimHesapla(BankaMusterisiOzelSektorCalisan musteri) {
		if (musteri.sadikMusteriMi()) {
			return 90;
		}		
		return 100;
	}
	
	// Buraya yeni bir müşteri tipi daha eklenecek
	// Mesela BankaMusterisiDevletMemuruCalisan 
	// Mecburen aşağıdaki gibi bir değişiklik yapmak zorunda kalacağız ve bu da OCP'ye aykırı olacak:
	public int sigortaPrimHesapla(BankaMusterisiDevletMemuruCalisan musteri) {
		if (musteri.sadikMusteriMi()) {
			return 90;
		}		
		return 100;
	}
	
	

}
