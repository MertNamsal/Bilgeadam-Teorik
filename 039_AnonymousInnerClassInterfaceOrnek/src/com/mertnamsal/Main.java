package com.mertnamsal;

//anonymous Inner Class'lar Interface'ler kullanılarak da oluşturulabilir.
public class Main {
	
	public static void main(String[] args) {
		IUcabilir ucanKaz = new IUcabilir() {
			
			@Override
			public void uc() {
				System.out.println("Kaz uçuyor - saniyede 3 kez kanat çırpıyor");
				
			}
		};
		
		ucanKaz.uc();
	}
}
