package com.mertnamsal;

import java.io.IOException;

//checked exception sınıflarından birinden türeteceğim
public class AsiriHizException extends IOException {

	public AsiriHizException(String message) {
		super(message);
	}

	@Override
	public void printStackTrace() {
		System.out.println("Bu bir aşırı hız exception'ıdır. Yüksek hız tespit edildi.");
		
	}

	
	
	
	
	
}
