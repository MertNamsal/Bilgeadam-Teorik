package com.mertnamsal;

public class DizilerMultiDimensionalOrnek {

	public static void main(String[] args) {
		// Örnek
		//Sınıf listesi
		//SıraNo:  OgrenciNo  Ad  Soyad
		//1         101       Ali Kaya
		//2         102       Veli  Öz
		//3         103       Zeynep Çalışkan
		
		String[][] sinifListesi = new String[3][4]; //3 satır 4 sütun
		
		sinifListesi[0][0]="1";
		sinifListesi[0][1]="101";
		sinifListesi[0][2]="Ali";
		sinifListesi[0][3]="Kaya";
		
		sinifListesi[1][0]="2";
		sinifListesi[1][1]="102";
		sinifListesi[1][2]="Veli";
		sinifListesi[1][3]="Öz";
		
		sinifListesi[2][0]="3";
		sinifListesi[2][1]="103";
		sinifListesi[2][2]="Zeynep";
		sinifListesi[2][3]="Çalışkan";

	}

}
