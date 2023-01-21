package com.mertnamsal;

//Thread oluşturma yöntem 2 : Runnable interface'ini implement edin
public class Thread2 implements Runnable {
	
	private String isim;

	public Thread2(String isim) {
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
		
		for(int i=1;i<51;i+=5) {
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