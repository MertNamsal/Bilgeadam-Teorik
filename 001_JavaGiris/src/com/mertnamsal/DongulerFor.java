package com.mertnamsal;

public class DongulerFor {

	public static void main(String[] args) {
		
		int toplam =0;
		
		for(int i=1;i<=10;i++) {
			toplam+=i;
			if(i % 2 != 0) {
				System.out.println(i+". sayıdayız."+" Güncel toplam :"+toplam );
			}
		}
		System.out.println("toplam :"+toplam);
	
		
		
 	}

}
