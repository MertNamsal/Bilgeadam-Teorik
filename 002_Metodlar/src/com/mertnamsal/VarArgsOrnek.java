package com.mertnamsal;

public class VarArgsOrnek {
	
	public static void toplaVarArgs(int... sayilar) {
		int toplam =0;
		//sayilar dizi gibi davranir
		for(int i=0;i<sayilar.length;i++) {
			toplam += sayilar[i];
		}
		System.out.println(toplam);
	}

	public static void main(String[] args) {
		toplaVarArgs(1,2,3,4);

	}

}
