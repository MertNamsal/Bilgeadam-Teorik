package com.mertnamsal;

public class Arzum implements ITermometre,INemOlcer,ITarihSaatGoster {
	
	
	@Override
	public int sicakligiOlc() {
		int toplam = 24;
		return toplam;
	}
	@Override
	public double nemOlc() {
		return 30.4;
	}
	@Override
	public String tarihGoster() {
		return "17 Kasım 2022";
	}
	@Override
	public String saatGoster() {
		return "11:30";
	}
	
	
	
	

	
	
	

}
