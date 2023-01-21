package com.mertnamsal;

import java.util.concurrent.Semaphore;

public class AgUzerindenDosyaKopyalayıcı {

	
	private Semaphore semaphore;
	
	public AgUzerindenDosyaKopyalayıcı(int threadSayisi) {
		semaphore = new Semaphore(threadSayisi); // Bu semaphore u kullanan kod bloğuna aynı anda sadece threadSayisi kadar thread girebilir.
	}
	
	public void dosyaKopyalayiciThreadMetodu(String ip) {
		try {
			semaphore.acquire();
			System.out.println("Thread dosya kopyalamaya başlıyor hedef IP : "+ip);
			Thread.sleep(4000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread dosya kopyalamayı bitirdi çıkıyor hedef IP : "+ip);
		semaphore.release();
	}

}
