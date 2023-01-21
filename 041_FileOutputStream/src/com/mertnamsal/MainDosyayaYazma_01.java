package com.mertnamsal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_01 {

		public static void main(String[] args) {
			
			FileOutputStream fileOutputStream = null;
			//Dosya Açma
			//1. yol : Açacağım dosyayı bir File nesnesi olarak oluşturabiliriz.
//			File file = new File("dosya.txt");
//			fileOutputStream = new FileOutputStream(file);
			
			try {
		//		fileOutputStream = new FileOutputStream("dosya.txt");  //Bu şekilde dosya varsa içeriğini siler ve yeniden yazar.
				
		//		fileOutputStream = new FileOutputStream("C:\\test2\\dosya.txt");  Hata alır ama aşağıda yakalanır test2 diye birşey c de olmadığı için
				
				fileOutputStream = new FileOutputStream("C:\\test\\dosya.txt");
				
				fileOutputStream.write(74);               //asci tabledan J
				fileOutputStream.write(65);               //asci tabledan A
				fileOutputStream.write(86);               //asci tabledan V
				fileOutputStream.write(65);               //asci tabledan A
				fileOutputStream.write(10);               //asci tabledan new line
				fileOutputStream.write(72);               //asci tabledan H
				fileOutputStream.write(73);               //asci tabledan I
				
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
