package com.mertnamsal;

public class MetodOrnek2 {

	
	
	public static int diziTopla(int[] array) {
		int toplam=0;
		for (int i = 0; i < array.length; i++) {
			toplam+=array[i];
		}
		return toplam;
	}
	
	

	private static void test(int sayi) {
		sayi=200;
		
	}
	private static int test2(int sayi) {
		sayi=200;
		return sayi;
		
	}
	
	private static void arrayIcerigiDegistir(int[]dizi) {
		dizi[0]=100;
	}

	
	
	public static void main(String[] args) {
		//Ornek1
		int[] array = {5,10,15,20};
		System.out.println(diziTopla(array));
		
		//Ornek2
		int sayi =1;
		test(sayi);
		System.out.println(sayi);
		
		//Ornek3
		int sayi2 =1;
		sayi2 = test2(sayi2);         //Atama yaparsak değişiyor
		System.out.println(sayi2);
		
		//Ornek4:
		arrayIcerigiDegistir(array);
		System.out.println(array[0]);

	}

}
