package com.mertnamsal;

public class Main {

	public static void main(String[] args) {
		
		// 3 tane farklı thread sınıfı oluşturun
		// 1. sınıf 0-50 arasında 3'erli saysın
		// 2. sınıf 0-50 arasında 5'erli saysın
		// 3. sınıf 0-50 arasında 7'serli saysın
		// Aralarda 1 sn beklesin her 3 sınıf da
		
		System.out.println("Main thread çalışıyor..");
		
		Yazici1 yaziciThread1 = new Yazici1("Yazici thread-1");
		Yazici2 yaziciThread2 = new Yazici2("Yazici thread-2");
		Yazici3 yaziciThread3 = new Yazici3("Yazici thread-3");
		
		yaziciThread1.start();		
		yaziciThread2.start();
		yaziciThread3.start();
		
		System.out.println("Main thread çıkıyor..");
	}

}
