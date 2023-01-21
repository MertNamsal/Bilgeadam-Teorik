package com.mertnamsal;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	
	public static void main(String[] args) {
		
		FileWriter fileWriter = null;
		
		try {
			fileWriter= new FileWriter("dosya.txt",true);
			
			//FileWriter ile dosyadaki veriyi byte'a çevirmeden direk String olarak yazabiliriz.
			fileWriter.write("Mert Namsal");
			fileWriter.write("Ahmet Ozan");
		} catch (IOException e) {
			System.out.println("Dosya açılırken veya yazarken hata oluştu");
		} finally {
			if(fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken hata oluştu");
				}
			}
		}
		System.out.println("Hoşçakalın");
	}
}
