package com.guraysungur;


// Single Responsibility Principle
public class Dikdortgen {
	
	private int kenar1;
	private int kenar2;
	
	// Alttaki 2 metod matematiksel dikdörtgen hesaplamalaır ile ilgilili
	public int alanHesapla( ) {
		return (kenar1 * kenar2);
	}
	
	
	public int cevreHesapla() {
		return (2 * (kenar1 + kenar2));
	}
	
	
	// Alttaki 2 metod ise dikdörtgen şeklinin GUI üzerinde grafiksel çizimi ile ilgili
	public void dikdortgenSekliniCiz() {
		System.out.println("Grafik kütüphanelerini kullanarak dikdörtgeni ekrana çizdiriyor..");
	}
	
	public void dikdortgenSekliniDondur(int aci) {
		System.out.println("Grafik kütüphanelerini kullanarak dikdörtgen şekli döndürülüyor..");
	}
	
	
	// Bu sınıf SRP'ye uygun mu? Değilse neden?
	// alanHesapla ve cevreHesapla aralarında bir kohezyon var bunlar bir resonsibility olabilir
	// dikdortgenSekliniCiz ve dikdortgenSekliniDondur aralarında bir kohezyon var, bunlar da ayrı bir responsibility olabilir
	// Bu sınıfı 2 ayrı sınıfa bölerek SRP'ye uygun hale getirmeliyiz...

}
