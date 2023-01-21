package com.mertnamsal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOgrenciLise {
	
	public static void main(String[] args) {
		List<OgrenciLise> ogrencilerLise = new ArrayList<OgrenciLise>();
		ogrencilerLise.add(new OgrenciLise("Fatih",1050,80));
		ogrencilerLise.add(new OgrenciLise("Metehan",1025,85.2));
		ogrencilerLise.add(new OgrenciLise("Irfan",1200,60));
		ogrencilerLise.add(new OgrenciLise("Buse",700,95.2));
		
		System.out.println(ogrencilerLise);
		
		Collections.sort(ogrencilerLise);
		System.out.println(ogrencilerLise);
	}
	
	
}
