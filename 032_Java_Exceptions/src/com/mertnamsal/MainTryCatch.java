package com.mertnamsal;

import java.util.Scanner;

//TRY-CATCH BLOKLARI

/*
try {
	
} catch (Exception e) {
	// TODO: handle exception
} 
*/
public class MainTryCatch {

	public static void main(String[] args) {

		// 1.bölüm

//		int x = 20/0;
//		int[] arr = {1,2,3,4};
//		System.out.println(arr[7]);

		// 2.bölüm
		// catch(Exception e ) ile bütün exceptionları yakalarsınız
		try {
			int x = 20 / 0;
		} catch (Exception e) {
			System.out.println("Sıfıra bölme olmaz");
		}

		// 3.bölüm
		int[] arr = { 1, 2, 3, 4 };
		try {
			System.out.println(arr[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Arrayın sınırının dışına çıkılıyor");
		}
		System.out.println("Hoşçakalın");

		// 4.bölüm
		// aldığınız exception ın detayını öğrenmek için printStackTrace() metodu
		// kullanın
		System.out.println();
		int[] arr2 = { 1, 2, 3, 4 };
		try {
			System.out.println(arr[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// System.out.println(e);
			System.out.println();
			// e.printStackTrace();
		}
		System.out.println("bye bye");

		// 5.bölüm
		// birden çok exception yakalama

//		Scanner scan = new Scanner(System.in);
//		System.out.println("bölen kaç");
//		int bolen = scan.nextInt();
//		try {
//			int sayi = 20 / bolen;
//			int[] array= {1,2,3,4};
//			System.out.println(array[7]);
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array sınırı aşıyor");
//		}catch (ArithmeticException e) {
//			System.out.println("0 a bölme hatası");
//		}catch(Exception e) {
//			System.out.println("Tahmin edilemeyen bir hata oluştu");
//			e.printStackTrace();
//		}

		// 6.bölüm
		// birden çok exception yakalama
		Scanner scan = new Scanner(System.in);
		System.out.println("bölen kaç");
		int bolen = scan.nextInt();
		String s =null;
		try {
			int sayi = 20 / bolen;
			int[] array = { 1, 2, 3, 4 };
			System.out.println(s.length());
			System.out.println(array[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array sınırı aşıyor");
		} catch (ArithmeticException e) {
			System.out.println("0 a bölme hatası");
		} catch (Exception e) {
			System.out.println("Tahmin edilemeyen bir hata oluştu");
			e.printStackTrace();
		}
	}
}
