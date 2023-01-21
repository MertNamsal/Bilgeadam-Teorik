package com.mertnamsal.multiLocalThreadliListeYazici;

public class Main {

	public static void main(String[] args) {

		ThreadliListeYazici threadliListeYazici = new ThreadliListeYazici();
		threadliListeYazici.threadlerOlusturCalistir();  
		
	}
	
	
	/*
	Threadsiz:
	----------
	
	list1 size: 1000  list2 size: 1000
	Toplam süre: 3661
	
	Threadli ve Vector'lü:
	----------------------
	list1 size: 1000  list2 size: 1000
	Toplam süre: 1790
	
	Threadli ArrayList'li ancak synchrinized kullanılmış durum:
	-------------------------------------------------------------
	list1 size: 1000  list2 size: 1000
	Toplam süre: 3668
	
	Threadli ArrayList ancak Mulit-lock kullanılmış durum:
	------------------------------------------------------
	list1 size: 1000  list2 size: 1000
	Toplam süre: 1968

	*/

}

