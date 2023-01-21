package com.mertnamsal;

public class DiziOrnek3 {

	public static void main(String[] args) {
		
		int[] dizi = { -4, 7, 12, 78, 72, -122, 18, 0, 90};
		int toplam =0;
		for(int i=0;i<dizi.length;i++) {
			toplam +=dizi[i];
		}
		int ortalama =  toplam / dizi.length;
		System.out.println("Ortalama: "+ortalama);
		
		
		//aynı dizi içindeki en küçük sayı ve indeksini bulunuz
		
		int enKucuk=Integer.MAX_VALUE;
		int index=0;
		for (int i = 0; i < dizi.length; i++) {
			if(enKucuk>dizi[i]) {
				enKucuk=dizi[i];
				index=i;
			}
		}
		System.out.println("Dizi içindeki en küçük sayı : "+enKucuk+ " indexi : "+index);
		

	}

}
