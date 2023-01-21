package com.mertnamsal;

//Unchecked Exception sınıflarından birinden türeteceğim
public class AsiriHizException extends ArithmeticException{

	public AsiriHizException(String message) {
		super(message);
	}

	@Override
	public void printStackTrace() {
		System.out.println("Bu bir aşırı hız exception'ıdır. Yüksek hız tespit edildi.");
	}
	
	
	
	
}
