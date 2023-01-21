package com.mertnamsal;

public class Homework2 {

	public static void main(String[] args) {
		//String metin ="Bugün Java ile string konusunu işleyeceğiz";
		
		//Verilmiş olsun.Metin değişkeninin içinde “i” harfinin geçtiği yerlerin indeksini 
		//bir while loop ve indexOf metodlarını kullanarak bulup ekrana yazdıran bir program yazınız. 
		//Çıktı şu şekilde olmalı 
		//i harfinin geçtiği yerler: 11, 18, 31, 40
		
		String metin ="Bugün Java ile string konusunu işleyeceğiz";
		int i=0;
		int sonIndex = metin.lastIndexOf('i');
		System.out.print("i harfinin geçtiği yerler:");
		while(i<metin.length()) {
			 
				if(metin.charAt(i)=='i') {
					if(sonIndex==metin.indexOf("i",i)) {
						System.out.print(" "+i);
					}else {
						System.out.print(" "+i+",");
					}		
				}
			i++;
		}
		

	}

}
