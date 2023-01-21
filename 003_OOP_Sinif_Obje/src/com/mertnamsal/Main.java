package com.mertnamsal;

public class Main {

	public static void main(String[] args) {
		Anahtar anahtar1 = new Anahtar();
		anahtar1.renk ="Kırmızı";
		anahtar1.ad = "Babamın anahtarı";
		anahtar1.no =100;
		
		Anahtar anahtar2 = new Anahtar();
		anahtar2.renk ="Mavi";
		anahtar2.ad ="Benim anahtarım";
		anahtar2.no =101;
		
		Anahtar anahtar3 = new Anahtar();
		anahtar3.renk ="Bordo";
		anahtar3.ad ="Kardeşimin anahtarı";
		anahtar3.no =103;
		
//		System.out.println(anahtar1.renk);
//		System.out.println(anahtar2.renk);
//		System.out.println(Anahtar.uzunluk);
		
//		anahtar1.bilgileriEkranaYaz();
//		anahtar2.bilgileriEkranaYaz();
//		anahtar3.bilgileriEkranaYaz();
		
		Anahtar[] anahtarDizisi = { anahtar1 , anahtar2,anahtar3};
		for (int i = 0; i < anahtarDizisi.length; i++) {
			anahtarDizisi[i].bilgileriEkranaYaz();
		}
	}

}
