package com.mertnamsal;

public class Main {

	public static void main(String[] args) {
		Otomobil otomobil1 = new Otomobil();
		otomobil1.marka="Togg";
		otomobil1.model ="V1";
		otomobil1.aracinKm=0;
		otomobil1.yil =2022;
		
		Motor motor1 = new Motor();
		motor1.motorHacmi = 1500;
		motor1.saseNo ="WER3447788";
		motor1.yakitTuketimi =10;
		
		otomobil1.aracinMotoru = motor1;
		
		//Otomobil bilgilerini yazdıralım:
		System.out.println("Marka : "+ otomobil1.marka+" model: "+otomobil1.model);
		
		//Motorun bilgilerini yazdiralim
		System.out.println("motorHacmi : "+motor1.motorHacmi + " saseNo : "+motor1.saseNo+" yakitTuk : "+motor1.yakitTuketimi);
		System.out.println("motorHacmi : "+otomobil1.aracinMotoru.motorHacmi+ " saseNo : "+otomobil1.aracinMotoru.saseNo+" yakitTuk : "+otomobil1.aracinMotoru.yakitTuketimi);
		
		//2.otomobil
		Otomobil otomobil2 = new Otomobil();
		otomobil2.marka = "BMW";
		motor1 = new Motor();
		motor1.motorHacmi = 1400;
		motor1.saseNo = "AUD1112223";
		motor1.yakitTuketimi=9;
		
		//--------
		
		Motor motorTest;
		motorTest = otomobil1.aracinMotoru;
		System.out.println(motorTest.saseNo);
		motorTest = otomobil2.aracinMotoru;
		System.out.println(motorTest.saseNo);
		
		//--------
		
		System.out.println("\n----------------------------------------------------------\n");
		otomobil1.aracinMotoru.motorBilgileriniYazdir();
		otomobil2.aracinMotoru.motorBilgileriniYazdir();
		
		
		
		

	}

}
