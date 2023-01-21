package com.mertnamsal;


//Bir class'ı thread sınıfından extend ederseniz(türetirseniz), türettiğiniz bu yeni class da bir Thread olur.
public class Yazici extends Thread{
	
	private String isim;

	public Yazici(String isim) {
		super();
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public void run() {
		System.out.println(this.isim+" isimli thread çalışıyor..");
		
		for(int i=1;i<10;i++) {
			System.out.println(isim+" yazıyor");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(isim+" işini bitirdi.");
	}
	
	
	
	
}
