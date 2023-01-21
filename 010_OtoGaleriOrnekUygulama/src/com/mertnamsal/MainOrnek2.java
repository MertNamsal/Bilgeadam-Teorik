package com.mertnamsal;

public class MainOrnek2 {
	public static void main(String[] args) {
		
		//--------------------- Yakıt tüketimi çalışması
		
		Otomobil oto1 = new Otomobil("Nissan", "Juke", 2005, 210244, new Motor(1500,"12345678",10),50,50);
		
		System.out.println("Aracı sürmeden önce yakıt: "+oto1.getDepodakiYakit());
		oto1.araciSur(200);
		System.out.println("Aracı sürdükten sonra yakıt: "+oto1.getDepodakiYakit());
		
		
	}

}
