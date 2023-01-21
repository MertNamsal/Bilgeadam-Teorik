package com.mertnamsal;

public class VeriTipleriBoolean {
	public static void main(String[] args) {
		
		//boolean veritipi : 1 bit
		//flag de denir
		
		boolean agirMi;
		int agirlik =95;
		//agirlik 85 den büyükse agirMi true olsun
		agirMi= agirlik >= 85;
		System.out.println(agirMi);
		
		int yas = 19;
		String deger;
		if(yas >= 18) {
			deger = "Yetişkin";
		}
		else {
			deger ="Yetişkin değil";
		}
		System.out.println(deger);
		
		//Ternary ile
		
		yas=21;
		deger = yas >=18 ? "Yetişkin" : "Yetişkin değil";
		System.out.println(deger);
	}

}
