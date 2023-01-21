package com.mertnamsal;

public class Main {
	
	//GENERIC METODLAR
	public static <E> void myGenericMethod(E[] array) { //staticten sonraki <E> yazmazsak ide hata verir
		int toplam =0;
		for(E obj : array ) {
			Sekil k = (Sekil) obj;
			toplam+=k.alanHesapla();
			System.out.println(k.alanHesapla());
		}
		System.out.println("Arrayin toplam alanı : "+toplam);
	}
	
	public static void main(String[] args) {
		
		GeometrikAlan<DikUcgen,Kare> alan1 = new GeometrikAlan<DikUcgen, Kare>(new DikUcgen(4, 10), new Kare(5));
		System.out.println("Alan1 "+alan1.geometrikSeklinAlaniniHesapla());
		
		GeometrikAlan<Dikdortgen, DikUcgen> alan2 = new GeometrikAlan<Dikdortgen, DikUcgen>(new Dikdortgen(10,20), new DikUcgen(3, 4));
		System.out.println("Alan2 "+alan2.geometrikSeklinAlaniniHesapla());
		
		GeometrikAlan<Kare, Kare> alan3 = new GeometrikAlan<Kare, Kare>(new Kare(7), new Kare(3));
		System.out.println("Alan2 "+alan3.geometrikSeklinAlaniniHesapla());
		
		//
		Kare[] kareArray = new Kare[3];
		kareArray[0]= new Kare(3);
		kareArray[1]= new Kare(4);
		kareArray[02]= new Kare(5);
		Main.myGenericMethod(kareArray);
		
		//
		System.out.println("+++++++++++++");
		Sekil[] sekillerArray= new Sekil[3];
		sekillerArray[0]= new Dikdortgen(5, 10);
		sekillerArray[1]= new Kare(5);
		sekillerArray[2]= new DikUcgen(3,6);
		Main.myGenericMethod(sekillerArray);
		
	}
}
