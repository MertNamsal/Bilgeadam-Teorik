package com.mertnamsal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BufferedReaderOrnek2 {

	public static void main(String[] args) {
		
		List<Ogrenci> ogrenciList = new ArrayList<>();
		
		try(Scanner scan = new Scanner(new BufferedReader(new FileReader("liste.txt")))){
			
			//scanner.hasNextLine() => okunacak satır kaldıysa true, aksi halde false olur.
			//Bunu bir while döngüsü içinde kullnarak tüm satırları okuyabiliriz.
			
			while(scan.hasNextLine()) {
				String okunanSatir = scan.nextLine();
				String[] arr = okunanSatir.split(",");
				Ogrenci ogr = new Ogrenci(arr[0],Integer.parseInt(arr[1].trim()));
				ogrenciList.add(ogr);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		}
		
		for(Ogrenci o : ogrenciList) {
			System.out.println(o);
		}
		
	}
}
