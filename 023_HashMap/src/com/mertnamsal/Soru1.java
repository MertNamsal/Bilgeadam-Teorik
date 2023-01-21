package com.mertnamsal;

import java.util.HashMap;

public class Soru1 {
	
	public static void karakterBulanYazdiran(String metin) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for(int i = 0;i<metin.length();i++) {
			char ch=metin.charAt(i);
			if(hashMap.containsKey(ch)) {
				hashMap.put(ch, hashMap.get(ch)+1);
			}else {
				hashMap.put(ch, 1);
			}
		}
		System.out.println(hashMap);
			
	}
	public static void enCokTekrarEdenHarf(String metin) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		int max = Integer.MIN_VALUE;
		char c = 'c';
		for(int i = 0;i<metin.length();i++) {
			char ch=metin.charAt(i);
			if(hashMap.containsKey(ch)) {
				hashMap.put(ch, hashMap.get(ch)+1);
				if(hashMap.get(ch)>max) {
					max = hashMap.get(ch);
					c = ch;
					
				}
			}else {
				hashMap.put(ch, 1);
			}
			
			
		}
		System.out.println(max+" = "+c);
	}
//	public static void enCokTekrarEdenHarfiBul(String metin)
//    {
//        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
//        char c = 0;
//        int max = 0;
//        
//        
//        for(int i=0; i<metin.length();i++)
//        {
//            char ch = metin.charAt(i);
//            
//            if (hashMap.containsKey(ch))
//            {
//                int tekrarSayisi = hashMap.get(ch) + 1;   //  "Herkese merhaba iyi çalışmalar";
//                if (tekrarSayisi > max)                    // H: 1   e: 2 r: 1 k :1  s: 1     max = 2   c = 'e'
//                {
//                    c = ch;
//                    max = tekrarSayisi;
//                }
//                hashMap.replace(ch, tekrarSayisi);
//            }
//            else
//            {
//                hashMap.put(ch, 1);
//            }
//        }
//                
//        System.out.println("En çok tekrar eden karakter: " + c + " tekrar sayısı: " + max);
//    }
	public static void main(String[] args) {
		String metin ="Herkese merhaba iyi çalışmalar";
		//Static bir metod yazın karakterlerin sayısını bulan ve ekrana yazdıran bir metod
		karakterBulanYazdiran(metin);
		enCokTekrarEdenHarf(metin);
	}
}
