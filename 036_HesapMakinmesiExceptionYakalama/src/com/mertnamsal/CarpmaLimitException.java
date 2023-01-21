package com.mertnamsal;

public class CarpmaLimitException extends Exception{

	@Override
	public void printStackTrace() {
		System.out.println("İki sayıda çok büyük, lütfen daha küçük sayılar giriniz! ");
	}
	
}
