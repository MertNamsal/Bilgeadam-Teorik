package com.mertnamsal;

public class Main {

	public static void main(String[] args) {
		// Thread oluşturma yöntem 3 :
		// Anonymous inner class ile interface üzerinden thread oluşturma
		System.out.println("Main başlıyor");
		Thread printer1 = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("Thread1 çalışıyor");
				for (int i = 1; i < 5; i++) {
					System.out.println("Thread 1 yazıyor : " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		});

		Thread printer2 = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("Thread1 çalışıyor");
				for (int i = 1; i < 7; i++) {
					System.out.println("Thread 1 yazıyor : " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		});

		printer1.start();
		printer2.start();

		System.out.println("Main bitiyo");
	}
}
