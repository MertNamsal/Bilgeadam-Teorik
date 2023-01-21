package com.mertnamsal;

public class Yazici2 extends Thread{
	
	private String isim;

	public Yazici2(String isim) {

		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	//Dikkat
		//Threadimiz start() ettirildiğinide calısacak metodlar run() metodunun içine yazılır
	@Override
	public void run() {
		System.out.println(this.isim+" isimli thread çalışıyor..");
		
		for(int i=1;i<3;i++) {
			System.err.println(isim+" yazıyor");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.err.println(isim+" işini bitirdi.");
	}
}
