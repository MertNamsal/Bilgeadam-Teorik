package com.mertnamsal;

public class MainEncapsulation {
	public static void main(String[] args) {
		
		Motor motor = new Motor();
		motor.setMotorHacmi(-500);
		motor.motorBilgileriniYazdir();
		
		System.out.println("Motor hacmi : "+motor.getMotorHacmi());
		int motorhacminin2kati = 2*motor.getMotorHacmi();
		System.out.println(motorhacminin2kati);
		
		//---------------
		Otomobil otomobil1 = new Otomobil();
		otomobil1.setAracinKm(0);
		otomobil1.setMarka("Opel");
		otomobil1.setModel("Insignia");
		otomobil1.setYil(2022);
		
		Motor motor1 = new Motor();
		motor1.setMotorHacmi(1500);
		motor1.setSaseNo("12345678");
		motor1.setYakitTuketimi(7);
		
		otomobil1.setAracinMotoru(motor1);
		
		otomobil1.getAracinMotoru().motorBilgileriniYazdir();
		
		//------------
		Otomobil otomobil2 = new Otomobil();
		otomobil2.setAracinKm(0);
		otomobil2.setMarka("Opel");
		otomobil2.setModel("Astra");
		otomobil2.setYil(2022);
		otomobil2.setAracinMotoru(new Motor());
		otomobil2.getAracinMotoru().setMotorHacmi(1000);;
		
	}
	
}
