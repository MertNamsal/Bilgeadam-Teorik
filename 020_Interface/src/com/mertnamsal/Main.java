package com.mertnamsal;

public class Main {
	
	//Interfaceler soyutlamaya yarar
	
	public static void nemGoster(INemOlcer nemOlcer) {
		System.out.println(nemOlcer.nemOlc());
	}
	
	public static void tarihSaatGoster(ITarihSaatGoster tarihSaatGosterenCihaz) {
		System.out.println(tarihSaatGosterenCihaz.tarihGoster()+"  "+tarihSaatGosterenCihaz.saatGoster());
	}
	public static ITermometre termometreOlustur() {
		ITermometre termometre = new Arzum();
		return termometre;
	}
	
	public static void main(String[] args) {
		
		Arzum arzum = new Arzum();
//		System.out.println(arzumSicaklikOlcer.sicakligiOlc());
		
//		
//		ITermometre termometre = new ArzumSicaklikOlcer();
//		termometre = new Sinbo();
		
		
		
		Sinbo sinbo = new Sinbo();
		
		Main.nemGoster(sinbo);
		Main.nemGoster(arzum);
		System.out.println("\n----------\n");
		Main.tarihSaatGoster(arzum);
		
		Casio casio = new Casio();
		Main.tarihSaatGoster(casio);
		
		System.out.println("\n----------\n");
		ITermometre term = Main.termometreOlustur();
		System.out.println(term.sicakligiOlc());
		
	}
}
