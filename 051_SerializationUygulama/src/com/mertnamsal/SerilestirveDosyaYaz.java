package com.mertnamsal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilestirveDosyaYaz {

	public static void main(String[] args) {
		
		Otomobil otomobil1 = new Otomobil("Audi","A3",2007,1234);
		Otomobil otomobil2 = new Otomobil("BMW","M3",2015,6854685);
		Otomobil otomobil3 = new Otomobil("Toyota","Corolla",2021,554164);
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("otomobil.bin"))){
			
			out.writeObject(otomobil1);
			out.writeObject(otomobil2);
			out.writeObject(otomobil3);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (IOException e) {
			System.out.println("Dosya yazma hatası");
		}
	}
}
