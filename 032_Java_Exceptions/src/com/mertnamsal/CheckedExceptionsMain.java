package com.mertnamsal;

public class CheckedExceptionsMain {
	
	public static void main(String[] args) {
		
		//Checked exceptionlar Exception sınıfından türerler
		//Bu tarz exceptionlar program compile edilirken yakalanması ve handle edilmesi gerekn durumlardır.
		//Bu tarz exceptionlar try-catch blokları içinde throws keywordu kullanarak handle edilmelidir.
		//Aksi takdirde compile hatası alınır.
		
		//Not : Checked Exception'lar Runtime Exception'lardan türemez.
		
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println("1");

    }
	
}
