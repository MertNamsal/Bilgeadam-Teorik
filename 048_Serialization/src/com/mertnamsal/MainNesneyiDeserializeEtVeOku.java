package com.mertnamsal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class MainNesneyiDeserializeEtVeOku {

	public static void main(String[] args) {
		
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("otomobil.bin"))){
			
			//Yazdığımız sırayla okumalıyız
			Otomobil otomobil1 = (Otomobil) input.readObject();
			System.out.println(otomobil1);
			
			Otomobil otomobil2 = (Otomobil) input.readObject();
			System.out.println(otomobil2);
			
			Otomobil otomobil3 = (Otomobil) input.readObject();
			System.out.println(otomobil3);
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (IOException e) {
			System.out.println("IO exception");
		} catch (ClassNotFoundException e) {
			System.out.println("Deserialization yaparken cast edilen sınıf bulunamadı, sınıf adı yanlış yazılmış olabilir");
		}

	}

}
