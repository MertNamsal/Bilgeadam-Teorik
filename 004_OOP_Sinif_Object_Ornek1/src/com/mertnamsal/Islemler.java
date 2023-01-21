package com.mertnamsal;

public class Islemler {
	
	public int sayi1;
	public int sayi2;
	
	public static int topla(int x, int y) {
		int z = x + y;
		return z;
	}
	public int topla() {
		return (sayi1+sayi2);
	}
	public double topla(double... sayilar) {
		double toplam = 0;
		for(double sayi : sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}

	public static void main(String[] args) {
		
		System.err.println(Islemler.topla(3,2));
		Islemler islemler = new Islemler();        //bunu yapmasak sayi1 ve sayi 2 ye ulasamazdık (statik değiller)
		islemler.sayi1=10;
		islemler.sayi2=20;
		System.out.println(islemler.topla());
		Islemler islemler3 = new Islemler();
		System.out.println(islemler3.topla(2.1,3.7,4.0));
		
		
	}

}
