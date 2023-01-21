package com.mertnamsal;

public class ThreadSafeMain {
	
	private int count = 0;
	
     // synchronized metodları aynı anda sadece 1 thread çalıştırabilir.
    // Oda-anahtar(kilit) mekanizmasyı gibi düşünün, bur metoda ilk giren thread odayı kitler ve anahtarı alır (lock'ı alır).
	//Bu şekilde yaptığımız zaman uygulamamız Thread-Safe olur.
	public synchronized void threadlerBurayaSenkronOlarakGirer() {
		count++;
	}
	
	public void threadleriCalistir() {
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i =0;i<5000;i++) {
					threadlerBurayaSenkronOlarakGirer();
				}
				System.out.println("Thread 1 bitti");
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i =0;i<5000;i++) {
					threadlerBurayaSenkronOlarakGirer();
				}
				System.out.println("Thread 2 bitti");
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
		//Bu şekilde çalıştırınca count 10000 yazmaz. bunun nedeni threadlerin senkronizasyon sorunudur.
		//Yani count++ ile aynı anda ikisi de count değişkenine erişip arttırmaya çalışıyorlar.
		//İkiside aynı anda count değerini alıp arttırmaya çalıştığı için değeri her zaman tam alamayız.
		//Bu tarz uygulamalar Thread not safe denilebilir.
		//Çözümü SENKRONİZASYON yapmaktır.
		
		
		System.out.println("Count değişkeninin değeri : "+count);
	}
	
	public static void main(String[] args) {
		
		ThreadSafeMain main = new ThreadSafeMain();
		main.threadleriCalistir();
		
	}
}
