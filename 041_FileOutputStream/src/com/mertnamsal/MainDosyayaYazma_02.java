package com.mertnamsal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_02 {

		public static void main(String[] args) {
			
			FileOutputStream fileOutputStream = null;
			//Dosya Açma
			//1. yol : Açacağım dosyayı bir File nesnesi olarak oluşturabiliriz.
//			File file = new File("dosya.txt");
//			fileOutputStream = new FileOutputStream(file);
			
			try {
		//		fileOutputStream = new FileOutputStream("dosya.txt");  //Bu şekilde dosya varsa içeriğini siler ve yeniden yazar.
				
		//		fileOutputStream = new FileOutputStream("C:\\test2\\dosya.txt");  Hata alır ama aşağıda yakalanır test2 diye birşey c de olmadığı için
				
				fileOutputStream = new FileOutputStream("C:\\test\\dosya.txt",true); // dosya mevcutsa içeriği silmez ekleme yapar
				
				fileOutputStream.write(67);               //asci tabledan C
				fileOutputStream.write(79);               //asci tabledan O
				fileOutputStream.write(68);               //asci tabledan D
				fileOutputStream.write(69);               //asci tabledan E
			
				
			} catch (FileNotFoundException e) {
				System.out.println("Dosya bulunamadı");
			} catch (IOException e) {
				System.out.println("Dosyaya yazma hatası!");
			} catch (Exception e) {
				System.out.println("Bilinmeyen bir hata oluştu");
			}finally {
				if(fileOutputStream != null) {
					try {
						fileOutputStream.close();
					} catch (IOException e) {
						System.out.println("Dosya kapanırken exception aldık!");
					}
				}
			}
			System.out.println("Hoşçakalın");
		}
}
