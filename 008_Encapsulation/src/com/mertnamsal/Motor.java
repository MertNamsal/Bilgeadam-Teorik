package com.mertnamsal;


public class Motor {
	private int motorHacmi;
	private String saseNo;
	private int yakitTuketimi; // lt/100km
	
	public void motorBilgileriniYazdir() {
		System.out.println("motorHacmi : "+this.motorHacmi + " saseNo : "+saseNo+" yakitTuk : "+yakitTuketimi); //içine motorHacmi diye birşey gelirse diye this kullanılıyor.
	}
	
	public void setMotorHacmi(int motorHacmi) {
		if(motorHacmi>800 && motorHacmi <10000) {
			this.motorHacmi = motorHacmi;
		}else {
			System.out.println("motor hacmi 800-10000 dışında tanımlandı otomatik 800 olarak ayarlandı.");
			this.motorHacmi =800;
		}
		
	}
	public int getMotorHacmi() {
		return this.motorHacmi;
	}
	public void setSaseNo(String saseNo) {
		if(saseNo.length()!=8) {
			System.out.println("Şase no 8 karakter olmalı");
			this.saseNo ="00000000";
		}else{
			this.saseNo = saseNo;
		}
	}
	public String getSaseNo() {
		return saseNo;
	}
	public void setYakitTuketimi(int yakitTuketimi) {
		this.yakitTuketimi = yakitTuketimi;
	}
	public int getYakitTuketimi() {
		return yakitTuketimi;
	
	
	
	
	}

}
