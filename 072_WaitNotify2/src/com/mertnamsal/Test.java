package com.mertnamsal;

import java.util.Scanner;

public class Test {

	//Tek farkı lock oluşturmak önceki paketten
	private Object lock = new Object();
	//synchronized (this) kullanımı ile public synchronized thread1Metod() aynı görevi icra eder.
	//synchronized (this) kullanarak nesne üzerinden lock kurulur.
	public void thread1Metod() {
		
		synchronized (lock) {
			System.out.println("Thread 1 is running...");
			System.out.println("Thread 1 waits...");
			try {
				lock.wait(); // wait ile biz diyoruzki ben uyuyucam lock'u teslim edebilir
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread 1 is awake and continues...");
		}
		
	}

	public void thread2Metod() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized (lock) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Thread 2 is running...");
			System.out.println("Please press a key to continue :");
			scan.nextInt();  //Thread2 thread1 başladıktan sonra başlamalı o yüzden buraada hemen console dan sayı girmeyelim en az 3 sn bekliyelim.
							//ve emin olalım ki thread1 önce başlasın.
			lock.notify();		//notify ile diyoruz ki bizim bu lock ile işimiz bitti isyen lock'u alıp çalışabilir.
							//synchronized içi bitince diğerlerini uyandırıyor.
			System.out.println("Threads 2 quits");
		}
		
		
	}

}
