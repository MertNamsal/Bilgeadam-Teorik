package com.mertnamsal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class MainNesneyiSerilestirVeDosyayaYaz {

	public static void main(String[] args) {
		
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("otomobil.bin"))){
			
			Otomobil otomobil1 = new Otomobil("Opel","Astra",2017);
			Otomobil otomobil2 = new Otomobil("Audi","A3",2019);
			Otomobil otomobil3 = new Otomobil("BMW","1.18",2015);
			
			out.writeObject(otomobil1);   //Java gönderdiğimiz otomobil objesini object sınıfından bir nesneye dönüştürecek sonra bunu byte
			 								//dizisi olarak otomobil.bin dosyasına yazacak.
			out.writeObject(otomobil2);
			out.writeObject(otomobil3);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya/dizin bulunamadı");
		}catch (NotSerializableException e) {
			System.out.println("Serializable yazmayı unuttuk");
		} catch (IOException e) {
			System.out.println("I/O Exception");
		}
		
		
	}

}
