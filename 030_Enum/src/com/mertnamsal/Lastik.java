package com.mertnamsal;

import com.mertnamsal.EnumOrnek1.Mevsimler;

public class Lastik {
	
	public Mevsimler lastikMevsimi;
	
	public static void main(String[] args) {
		
		Lastik lastik = new Lastik();
		lastik.lastikMevsimi = Mevsimler.KIS;
		System.out.println(lastik.lastikMevsimi);
	}
}
