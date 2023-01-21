package com.mertnamsal;

public class MethodOverloading {
	//Ornek method
	
	public static int topla(int sayi1, int sayi2) {
		return (sayi1+sayi2);
	}
	
	 //Aynı isimde, aynı tip ve aynı sayıda parametreleri olan 2 metod bulunamaz.
//	public static int topla(int s1,int s2) {
//		int snc = s1+s2;
//		return snc;
//				
//	}

	
	//tip
	public static double topla(double sayi1,double sayi2) {
		double sonuc = sayi1+sayi2;
		return sonuc;
	}
	
	//Gerçek hayatta kullanım
	
	//Aşağıdaki kullanımlar hata vermez ama yanlıştır.
//	public static void musteriKaydet() {}
//	public static void save() {}
//	public static void satisKaydet() {}
//	//...
//	//Bunun yerine doğru kullanım :
//	
//	public static void save(Musteri musteri) {}
//	public static void save(Stok stok) {}
//	public static void save(Satis satis) {}
	public static void main(String[] args) {
	   topla(2,3);
	

	}

}
