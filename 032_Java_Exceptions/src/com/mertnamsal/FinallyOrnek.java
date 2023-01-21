package com.mertnamsal;

public class FinallyOrnek {
	
	//Exception alan ve finally çalışan bir örnek
	
	public static void main(String[] args) {
		
		try {
			int x= 4/0;
		} catch (Exception e) {
			System.out.println("Exception alındı");
		} finally {
			System.out.println("Finally kod bloğu içindekiler ne yazarsa yaz hep çalışır.");
		}
		System.out.println("Bye");
		
		try {
			String s ="test";
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println("Exception aldı");
		} finally {
			System.out.println("Finally kod bloğu içindekiler ne yazarsan yaz hep çalışır");
		}
		System.out.println("***********************");
		//Hatayı yakalıyor fakat finally genede çalışıyor
		try {
			int x= 4/0;
		} catch (NullPointerException e) {
			System.out.println("Exception aldı");
		}finally {
			System.out.println("Finally kod bloğu içindekiler ne yazarsan yaz hep çalışır");
		}
		System.out.println("By");
	}
}
