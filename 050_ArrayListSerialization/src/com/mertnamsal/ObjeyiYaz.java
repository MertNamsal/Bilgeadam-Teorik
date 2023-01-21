package com.mertnamsal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjeyiYaz {

	
	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Ahmet",1234,"Bilgisayar Mühendisliği");
		Ogrenci ogrenci2 = new Ogrenci("Zeynep",124,"Elektronik Mühendisliği");
		Ogrenci ogrenci3 = new Ogrenci("Fatma",134,"Maden Mühendisliği");
		
		//java 7 ye kadar sağ tarafa <> içine öğrenci demek gerekiyordu
		ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
		ogrenciList.add(ogrenci1);
		ogrenciList.add(ogrenci2);
		ogrenciList.add(ogrenci3);
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))){
			
			out.writeObject(ogrenciList);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (IOException e) {
			System.out.println("Dosyaya yazma hatası");
		}
		
		System.out.println("Arraylist ve içindeki nesneler dosyaya yazıldı");
		
		
	}
}
