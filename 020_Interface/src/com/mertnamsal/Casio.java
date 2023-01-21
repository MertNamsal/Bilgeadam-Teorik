package com.mertnamsal;

public class Casio implements ITarihSaatGoster {

	@Override
	public String tarihGoster() {
		return "1 Ocak 2020";
	}

	@Override
	public String saatGoster() {
		return "14:58";
	}

}
