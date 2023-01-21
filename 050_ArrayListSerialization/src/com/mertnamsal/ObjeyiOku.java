package com.mertnamsal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class ObjeyiOku {
	
	public static void main(String[] args) {
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))){
			
			ArrayList<Ogrenci> ogrenciler = (ArrayList<Ogrenci>) in.readObject();
			
			for(Ogrenci o: ogrenciler) {
				System.out.println(o);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (IOException e) {
			System.out.println("Dosyadan okunamadı");
		} catch (ClassNotFoundException e) {
			System.out.println("Class bulunamadı");
		}
	}
}
