package com.mertnamsal;

import com.alikaya.YardimciSinif;

public class Main {
	
	
	//Metodlar
	
	//public => Access modifier( Erişim belirleyici) //public: bütün package lerin kullanımına açık
	                                                 //protected: sadece aynı package içi kullanıma açık
													 //private: sadece bulunduğu	
	//static => (zorunlu değil) static metodların hepsi program çalışır çalışmaz adreslenir ve değişmez.
													// static olmasa idi memory adresi nesne oluşunca oluşacaktı.
	//final => (zorunlu değil) metodun başına gelirse override edilemez anlamına gelir(OOP de görcez)
													//sınıfın başına gelirse o sınıftan sınıf türetilemez.
	
	//metod ismi yazmak zorundasınız.
	//sonrasındaki paranteze parametre yazabilirsiniz.
	
	//Return type : zorunludur. Hiç bir şey return etmiceksek void yazmalıyız.
	
	public static final void hello() {               
		System.out.println("Hello");                  
	}

	public static void main(String[] args) {
	//	hello();   Metod çağırımı/kullanımı
	//	Main.hello(); Baska paketten çağırmak için  
		
		//1.yol farklı paketteki static metodları kullanım
		com.alikaya.YardimciSinif.helloYardimci();
		
		//2.yol farklı paketteki static metodları kullanım
		YardimciSinif.helloYardimci();
		System.out.println(alanHesapla(5,3));

	}
	
	//Soru
	//dikdörtgenin alanını hesaplayan metod
	//hesapla return etsin
	
	public static int alanHesapla(int a , int b) {
		int alan = a*b;
		return alan;
	}

}
