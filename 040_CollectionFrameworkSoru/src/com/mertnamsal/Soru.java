package com.mertnamsal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Soru {
	
//	public static void tekrarEdenKarakteriBul(String s) {
//		HashSet<Character> c1 = new HashSet<Character>();
//		for (int i = 0; i < s.length(); i++) {
//			if(c1.add(s.charAt(i))) {
//				continue;
//			}else {
//				System.out.println(s.charAt(i));
//				break;
//			}
//		}
//	}
	static void tekrarEdenKarakteriBul(String s)
    {
        Set<Character> hashSet = new HashSet<Character>();                
        
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            
            if (hashSet.contains(c))
            {
                System.out.println("Tekrar eden karakter: " + c);
                return;
            }
            else
            {
                hashSet.add(c);
            }
        }
        
        System.out.println("Tekrar eden karakter bulunamamaıştır");
    }
	
	
	public static void main(String[] args) {
		
		//ilk tekrar eden karakteri bul
		//koşullar
		//sadece 1 for döngüsü kullanabilirsiniz.
		//collections frameworkundan yararlanabilirsiniz.
		tekrarEdenKarakteriBul("ABBCDEARY"); // -> B
		tekrarEdenKarakteriBul("ABCDEARY");  // -> A
	}
}
