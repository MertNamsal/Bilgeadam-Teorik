package com.mertnamsal;

public class MainUcusTipi {
	
	public static void ucusBilgileriniGoster(UcusTipi ucusTipi) {
		System.out.println("Ucus tipi : "+ucusTipi.getTip()+" Ucus bilgisi : "+ucusTipi.getMetin());
	}
	
	public static void main(String[] args) {
		MainUcusTipi.ucusBilgileriniGoster(UcusTipi.EKONOMIK);
		MainUcusTipi.ucusBilgileriniGoster(UcusTipi.OZEL);
		MainUcusTipi.ucusBilgileriniGoster(UcusTipi.VIP);
		
	}
}
