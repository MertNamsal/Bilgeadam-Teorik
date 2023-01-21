package com.mertnamsal;

public class Main {

	public static void main(String[] args) {
		
		
		
		Motor motor3= new Motor(1100,"QQQQQQQQ",7); 
		
		motor3.motorBilgileriniYazdir();	
		motor3.setYakitTuketimi(11);
		motor3.motorBilgileriniYazdir();
		//-------------------------
		Motor motor1 = new Motor();
		System.out.println(motor1.getSaseNo());
		
		//----------------------
		
		Otomobil oto = new Otomobil();
		oto.setYil(2021);
//		System.out.println("Yılı : "+oto.getYil()+" Motor sase : "+oto.getAracinMotoru().getSaseNo());   motor bağlanmadı diye hata alırırz
		
		System.out.println("Yılı : "+oto.getYil()+" Aracın km : "+oto.getAracinKm()+ " Markası : "+oto.getMarka());      //stringde hata vermiyor fakat null dönüyor
		
		oto.setAracinMotoru(motor3);
		//Ornek full constructor
		//
		Otomobil oto2 = new Otomobil("Mercedes","CLK",2020,80000,motor3);
		
		Otomobil oto3 = new Otomobil("Audi","Q3",2021,4500,new Motor());
		oto3.getAracinMotoru().setYakitTuketimi(11);
		oto3.getAracinMotoru().setMotorHacmi(1700);
		
		
			
	}

}
