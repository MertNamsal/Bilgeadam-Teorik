package com.mertnamsal;

public class AlgoritmaPerformans {

	public static void main(String[] args) {
		
		int islemAdedi = 100000;
		//Basit algoritma
		//Algoritma 1:
//		long startTime = System.currentTimeMillis();
		
		
//		String metin = "Hello";
//		for(int i =0;i<islemAdedi;i++) {
//			metin= metin + String.valueOf(i);
//		}
//		long endTime = System.currentTimeMillis();
//		
		
		//Algoritma 2:
		long startTime = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hello");
		for(int i=0;i<islemAdedi;i++) {
			stringBuilder.append(i);
		}
		long endTime=System.currentTimeMillis();
		System.out.println("Algortimanın işlem süresi: "+ (endTime-startTime)+ " milisaniye");

	}

}
