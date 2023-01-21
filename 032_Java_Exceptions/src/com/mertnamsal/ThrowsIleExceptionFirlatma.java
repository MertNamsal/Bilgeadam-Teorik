package com.mertnamsal;

import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsIleExceptionFirlatma {
	public static void hizKontrol(int hiz) throws SQLException {
		if(hiz > 120) {
			throw new SQLException();  //SQLException bir checkedException olduğu için metoda ekstradan throws yazmamış gerekir.
		}else {
			System.out.println("iyi yolculuklar");
			
		}
	}
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen hız giriniz");
		int hiz = sc.nextInt();
		try {
			ThrowsIleExceptionFirlatma.hizKontrol(hiz);
		} catch (SQLException e) {
			System.out.println();
			e.printStackTrace();
		}
	}
}
