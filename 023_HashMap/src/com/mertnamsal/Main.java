package com.mertnamsal;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		//HashMap ler key value pairler (anahtar - değer) çifti olarak tutulurlar.
		//Key -> Value
		//HashMap içindeki elemanları sıralı şekilde tutmaz! (Arraylist ve LinkedList aksine)
		//HaspMap içindeki elemanları hashleyerek random bir sıra tutar.
		//HashMapler Listlere göre random access (rastgele erişimde) tıpkı HashSetler gibi hızlıdırlar.
		HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
		hashMap.put(10, "Opel");
		hashMap.put(20, "Audi");
		hashMap.put(30, "VW");
		hashMap.put(40, "BMW");
		hashMap.put(50, "Renault");
		System.out.println(hashMap);
		
		//Aynı key'e başka bir değer eklerseniz üzerine yazarsınız:
		hashMap.put(40, "Fiat");
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(20));
		System.out.println(hashMap.get(70));
		
		//HashMap yazdırmak
		
		//1.yol
		for(Integer key : hashMap.keySet()) {
			System.out.println("Key : "+key+ " Value :"+hashMap.get(key));
		}
		//2.yol
		//HashMap i Set e dönüştürür ve loop ederiz
		for(Map.Entry<Integer, String>entry : hashMap.entrySet()) {
			System.out.println("Anahatar : "+entry.getKey()+" Değer: "+entry.getValue());
		}
		
		//önemli bir iki metod
		if(hashMap.containsKey(30)) {
			System.out.println("30 anahtarı mevcut");
		}else {
			System.out.println("30 anahtarı mevcut değil");
		}
		if(hashMap.containsValue("Renault")){
			System.out.println("Renault değeri mevcut");
		}else {
			System.out.println("Renault değeri mevcut değil");
		}
		
		
	}
}
