package com.mertnamsal.soru1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		List<Ogrenci> ogrenciList = new ArrayList<>();
		
		//Scanner sınıfı Closeable interface'ini implement ettiği için try-with-resources yapısı ile kullanılabilir.
		try( Scanner scan = new Scanner(new FileReader("liste.txt"))){
			
			//tüm satıları okuma
			while(scan.hasNextLine()) {
				String okunanSatir = scan.nextLine();
				
				String [] arr= okunanSatir.split(",");
				Ogrenci ogr = new Ogrenci(arr[0],Integer.parseInt(arr[1].trim()));
				ogrenciList.add(ogr);
				
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		}
		System.out.println(ogrenciList);
	}
}
