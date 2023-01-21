package com.mertnamsal;

public class Anahtar {
	
	//özellik / üye değişken
	public static final int uzunluk = 10;
	public String renk;
	public String ad;
	public int no;
	
	//(üye) metod
	public void bilgileriEkranaYaz() {
		System.out.println("No: "+no+ " Ad: "+ad+" Renk: "+renk);
	}
	public static void uzunluguEkranaYaz() {
		System.out.println(uzunluk);
		
	}

	

}
