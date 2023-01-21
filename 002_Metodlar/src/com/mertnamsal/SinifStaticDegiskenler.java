package com.mertnamsal;

public class SinifStaticDegiskenler {
	
	//Bunlara sınıfların üye değişkenleri denir.
	public static final int dunyaninYariCapi=6371; //km
	public static int x=5;
	public static final double PI = 3.14;
	
	public static void main(String[] args) {
		
		//Java'da global değişken yoktur.
		//Ancak her sınıfın üye değişkenleri vardır.
		//Siz bunları public ve static yaparsanız herkes bunları kullanabilir.
		//Tıpkı global değişkenler gibidir ama adı global değişken değildir.
		SinifStaticDegiskenler.x++;
		System.out.println(dunyaninYariCapi);
		System.out.println(SinifStaticDegiskenler.dunyaninYariCapi); //Convention: sınıf adı.üye değişken adı
		System.out.println(com.alikaya.YardimciSinif.mesafe());
		
		//Kural
		//static olmayan metodları static metodlar içinden direk çağıramayız
		//staticOlmayanMetod(); hata alır
	}
	public void staticOlmayanMetod() {
		System.out.println("static olmayan method");
	}

}
