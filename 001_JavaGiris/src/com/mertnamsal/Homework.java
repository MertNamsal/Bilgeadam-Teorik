package com.mertnamsal;

import java.util.Iterator;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		//Soru 1 :
		//Kullanıcı girdiği pozitif bir tamsayıyı (int) ters çeviren ve görüntüleyen bir uygulama yazın.(Not : String ve char kullanarak)
		//output =>   2345 -> 5432
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ters çevirmek istediğiniz tam sayıyı giriniz : ");
		int sayi = scan.nextInt();
		String ceviri = String.valueOf(sayi);
		
		for(int i = ceviri.length() ; i > 0 ;i--) {
			System.out.print(ceviri.charAt(i-1));
		} 
	}

}
