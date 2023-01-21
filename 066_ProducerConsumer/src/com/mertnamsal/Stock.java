package com.mertnamsal;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Stock {
	Random random = new Random();
	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);  //capacity : 10 ( max 10 integer olabilir bu kuyrukta)
																		//bir tane ReentrantLock lock nesnesi tutuyor.
																		//Bu sınıfı içindeki locklar sayesinde bu queue thread safe ve multilock oluyor.
	//random bir sayı üretip queue ya ekleyecek
	public void produce() {
		while(true) {
			
			
			Integer val = random.nextInt(1000);
			try {
				queue.put(val);
				System.out.println("Producer stoğa  mal ekliyor.. : "+val);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//stock'tan integer değer çekiyor
	public void consume() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			try {
				Integer val;
				val = queue.take();
				System.out.println("Consumer stoktan mal tüketiyor.. : "+val);
				System.out.println("Stok büyüklüğü/Queue güncel size : "+queue.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
