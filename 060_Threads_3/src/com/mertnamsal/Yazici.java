package com.mertnamsal;


//Thread oluşturma yöntem 2 : Runnable interface'ini implement edin
public class Yazici implements Runnable {
	
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
				System.out.println("Thread kesintiye uğradı.");
			}
		}
		System.out.println(isim+" işini bitirdi.");
	}
	
	
	
	
}
