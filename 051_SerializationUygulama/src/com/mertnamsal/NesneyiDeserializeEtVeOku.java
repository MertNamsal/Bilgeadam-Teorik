package com.mertnamsal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NesneyiDeserializeEtVeOku {
	
	public static void main(String[] args) {
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("otomobil.bin"))){
			
			Otomobil oto1 = (Otomobil) in.readObject();
			Otomobil oto2 = (Otomobil) in.readObject();
			Otomobil oto3 = (Otomobil) in.readObject();
			
			System.out.println(oto1);
			System.out.println(oto2);
			System.out.println(oto3);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (IOException e) {
			System.out.println("Okurken hata");
		} catch (ClassNotFoundException e) {
			System.out.println("Sınıf bulunamadı");
		}
	}
}
