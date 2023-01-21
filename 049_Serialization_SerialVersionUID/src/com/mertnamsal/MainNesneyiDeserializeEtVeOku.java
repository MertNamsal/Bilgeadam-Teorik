package com.mertnamsal;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class MainNesneyiDeserializeEtVeOku {

	public static void main(String[] args) {
		
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("otomobil.bin"))){
			
			Otomobil oto = null;
			//Dosyadaki tüm objeleri okur
			//Yazdığımız sırayla okumalıyız
			//Dosyanın sonuna gelindiğinde readObject() metodu EOFException mutlaka fırlatır!
			while((oto = (Otomobil) input.readObject())!= null) {
				if(oto != null) {
					System.out.println(oto);
				}
			}
		
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (EOFException e) {
			System.out.println("Dosya sonu...");
		} catch (ClassNotFoundException e) {
			System.out.println("Deserialization yaparken cast edilen sınıf bulunamadı, sınıf adı yanlış yazılmış olabilir");
		} catch (IOException e) {
			System.out.println("IO exception");
		} 
		System.out.println("Hoşçakalın");

	}

}
