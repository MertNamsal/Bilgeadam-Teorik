package com.mertnamsal;

import java.util.Random;
import java.util.Scanner;

public class MetodOrnek3 {

	
	public static int[] randomDiziUret(int ustLimit) {
		int[]dizi = new int[10];
		Random random = new Random();
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i]=(random.nextInt(ustLimit)*7);
		}
		return dizi;
	}
	
	public static void main(String[] args) {
		
		//Rastgele 7nin katı olan 10 tane tamsayı üreten bir metod yazınız.
		//Ust limiti parametre olarak kullanıcıdan alın
		//Metod 1 int dizisi return etsin
		//main içinde bu dizinin elemanlarını yazdırın
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Üretilcek sayıların üst limiti ?");
		int limit = scan.nextInt();
		int[] dizi =randomDiziUret(limit);
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		
		

	}

}
