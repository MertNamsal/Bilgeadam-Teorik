package com.mertnamsal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainDosyadanOkuma {

	public static void dosyadanTekbirByteOkuma() {
		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream("dosya.txt");
			
			char c = (char) fileInputStream.read(); // 1 byte ı int olarak okur. Bunu char'a cast ederek çevirirz.
			System.out.println(c);
			char c2 = (char) fileInputStream.read();
			System.out.println(c2);
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());
			int okunan = fileInputStream.read(); // dosyanın sonuna ulaşıldıgına read() -1 döner
			System.out.println(okunan);

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken hata oluştu");
				}
			}
		}
	}
	public static void dosyaninOrtasindanByteOkuma() {
		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream("dosya3.txt");
			
			fileInputStream.skip(8);
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken hata oluştu");
				}
			}
		}
	}
	
	public static void dosyaninTurunuOkuma() {
		FileInputStream fileInputStream = null;
		
		int okunan;
		String s="";
		
		try {
			fileInputStream = new FileInputStream("dosya3.txt");
			
			while((okunan = fileInputStream.read()) != -1) {
				
				s=s+(char)okunan;
			}
			System.out.println(s);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası");
		}
	}
	public static void dosyaninBelirtilenKisminiOku(int n, int m) {
		
		FileInputStream fileInputStream=null;
		String s = "";
		int okunan;
		
		try {
			fileInputStream = new FileInputStream("dosya5.txt");
			fileInputStream.skip(n);
			int sayac = 0;
			
			while((okunan = fileInputStream.read()) != -1) {
				
				s=s+(char)okunan;
				sayac++;
				if(sayac == m) {
					break;
				}
			}
			System.out.println(s);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası");
		}
		
		
		
	}

	public static void main(String[] args) {
		MainDosyadanOkuma.dosyadanTekbirByteOkuma();
//		MainDosyadanOkuma.dosyaninTurunuOkuma();
		
		//soru:
		//bir metod yazınız.bir dosyanın n. karakterinden başlayıp m tane karakter okusun ve ekrana yazsın.
		MainDosyadanOkuma.dosyaninBelirtilenKisminiOku(7,8);
		
		System.out.println("\n\nHoşçakalın");
		
		
	}
	
}
