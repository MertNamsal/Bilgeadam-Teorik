package com.mertnamsal;

public class VeriTipleriOndalik {

	public static void main(String[] args) {
		// float veri tipi 4 byte
		//Bilimsel uygulamalarda kullanılmaz
		//Noktadan sonra 7 basamak
		
		float floatValue = 1.7f;
		//f yazmazsak sağ taraf double
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		floatValue = 22;
		floatValue = 22.7f; //f veya başına (float koymamız gerekir)
		
		//double 8 byte
		double doubleValue = 1.2;
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		doubleValue =12.33e8;
		System.out.println(doubleValue);
		
		floatValue = 1.1234567F;
		
		String kusurat = String.format("%.3f" , floatValue);
		System.out.println(kusurat);
		
		final double PI =3.14; // PI değeri değiştirilemez oldu.
		

	}

}
