package com.mertnamsal;

import java.util.Random;

public class ThreadSafe2 {

	private int count=0;
	
	
	public synchronized void uretimTuketim(int degisimSayisi) {
		count =count + degisimSayisi;
		if(degisimSayisi<0) {
			System.out.println("Stoktan mal çıkışı");
		}else {
			System.out.println("Üretim sonucu stoğa mal girişi");
		}
		System.out.println("Güncel stok : "+count);
	}
	public synchronized void isciSayisi(){
		
	}
	
	private void threadleriCalistir() {
		
		//Üretici thread
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Üretici thread çalıştı.");
				
				for (int i = 0; i < 100; i++) {
					Random r = new Random();
					int uretimSayisi = r.nextInt(10);
					uretimTuketim(uretimSayisi);
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Thread 1 üretici sonlandı");
			}
				
			
		});
		//Tüketici thread
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Tüketici thread çalıştı");	
				
				for(int i=0; i<100;i++) {
					Random r = new Random();
					int tuketimSayisi = r.nextInt(5)* -1 ;
					uretimTuketim(tuketimSayisi);
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
			}
	});
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				
	}

	
	
	public static void main(String[] args) {
		
		ThreadSafe2 threadSafe = new ThreadSafe2();
		threadSafe.threadleriCalistir();
	}

	
}
