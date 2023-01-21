package com.mertnamsal;


public class Motor {
	private int motorHacmi;
	private String saseNo;
	private double yakitTuketimi; // lt/100km
	
	//Constructor : nesnelerin ilk oluşumu sırasında çağrılan methoda denir.
	
	//Yazılımcı Class içinde hiçbir constructor tanımlamazsa java o class için otomatik
	//boş bir constructor oluşturur
	//Ancak içine parametre alan bir constructor tanımlarsa java otomatik constructor oluşturmaz.
	
	public Motor(int motorHacmi, String saseNo, int yakitTuketimi) {
		super();
		this.motorHacmi = motorHacmi;
		this.saseNo = saseNo;
		this.yakitTuketimi = yakitTuketimi;
	}
	
	
	
	public Motor() {
		
	}
	
	
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
	public void setYakitTuketimi(double yakitTuketimi) {
		this.yakitTuketimi = yakitTuketimi;
	}
	public double getYakitTuketimi() {
		return yakitTuketimi;
	
	
	
	
	}

}
