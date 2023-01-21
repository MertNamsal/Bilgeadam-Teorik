package com.mertnamsal;

public class Diziler {

	public static void main(String[] args) {
		//dizi
		
		long[]dizi1;
		
		//Kural: dizilerini initialize etmeden kullanamazsınız!
		
		dizi1 = new long[7]; //bu satırı yazınca 7 yerlik dizi oluşturur.
		
		//dizilere atama yapmak
		dizi1[0] =10;
		dizi1[1]=14;
		dizi1[2]=28;
		
		int[] arrayInt = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arrayInt[0]);
		System.out.println(arrayInt[1]);
		for(int i =0;i<arrayInt.length;i++) {
			System.out.println(arrayInt[i]);
		}
		
		//dizi tanımlama string
		
		String[] arrayString =new String[] {"Ali","Veli","Ayşe","Can"};
		
		//alternatif
		
		String[] dizi2 = new String[3];
		dizi2[0]="Papatya";
		dizi2[1]="Gül";
		dizi2[2]="Lale";
		
		//null olayı
		//dizide tanımlanmayan yerler null olarak atanır
		
		//Örnek
		//içinde sadeece 2 eleman olan bir double dizisi tanımlayınız.
		
		//ilk eleman 23.457 ikinci 11
		double[]dizi5 = new double[2];
		dizi5[0]=23.457;
		dizi5[1]=11;
		
		for(int i=0;i<dizi5.length;i++) {
			System.out.println(dizi5[i]);
		}

	}

}
