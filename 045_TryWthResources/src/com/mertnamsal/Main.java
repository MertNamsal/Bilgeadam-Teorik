package com.mertnamsal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	/*
	
	//TRY WITH RESOURCES KULLANIMI
	 * 
	 *   Closeable interface'ini implement eden herhangi bir sinifi try-with-resources ile kullanabilirsiniz.
	 *   Bu şekilde finally kod bloğu yazmak zorunda kalmazsınız
	try (declare resources here) {
		
	} catch (Exception e) {
		// exception handling
	}
	
	
	*/
	
	public static void main(String[] args) {
		
		try(FileWriter writer = new FileWriter("markalar.txt")){
			
			String marka="";
			Scanner scan = new Scanner(System.in);
			
			//Kullanıcıdan marka girmesini isteyin
			//Kullanıcı -1 girene kadar kullanıcının girdiği marka bilgisini markalar.txt dosyasına yazdırın.
			while(true) {
				System.out.println("Lütfen bir marka giriniz");
				marka =scan.nextLine();
				if(marka.equals("-1")) {
					System.out.println("Programdan çıkılıor. Lütfen dosyayı kontrol ediniz.");
					break;
				}
				writer.write(marka+ "\n");
			}
			
		} catch (IOException e) {
			System.out.println("I/O exception alındı.");
		}
	}
}
