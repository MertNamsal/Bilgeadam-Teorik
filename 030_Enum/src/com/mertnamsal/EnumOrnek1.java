package com.mertnamsal;

public class EnumOrnek1 {
	
	enum Size{
		LOW,MEDIUM,HIGH
	}
	enum Mevsimler{
		ILKBAHAR,YAZ,SONBAHAR,KIS
	}
	
	//enumlar bizi aşağıdaki şekilde tek tek yazmaktan kurtarır.
	//enum değerleri public,static ve finaldır.
	public static final int LOW = 1; 
	public static final int MEDIUM = 2; 
	public static final int HIGH = 3; 
	
	public static void ekranaYaz(Mevsimler m) {
		System.out.println(m);
	}
	
	public static void main(String[] args) {
		
		//enum
		//enumlar değişmeyecek olan sabit değerlerdir.
		//enumlardan nesne türetilemez.
		Size size = Size.HIGH;
		size=Size.MEDIUM;
		System.out.println(size);
		
		System.out.println("-----------");
		for(Size s : Size.values()) {
			System.out.println(s);
		}
		//enumlar ne zaman kullanılır?
		//değişmez değerleriniz varsa 
		//Mesela ilkbahar yaz kış gibi
		System.out.println("-----------");
		Size beden = size.MEDIUM;
		if(beden == Size.MEDIUM) {
			System.out.println("Orta- M beden");
		}
		EnumOrnek1.ekranaYaz(Mevsimler.SONBAHAR);
	}
}
