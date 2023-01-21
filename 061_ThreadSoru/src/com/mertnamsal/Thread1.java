
package com.mertnamsal;


public class Yazici1 extends Thread {

	private String isim;

	public Yazici1(String isim) {		
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	// Dikkat !
	// Threadimiz start() ettirildiğinde çalışacak kodlar run() metodunun içine yazılır !
	@Override
	public void run() {
		System.out.println(this.isim + " isimli thread çalışıyor..");
		
		for(int i=0;i<=50;i+=3) 
		{
			System.out.println(isim + " yazıyor: " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		
		System.out.println(isim + " işini bitirdi...");
	}
	
	
	
	
	
}
