package com.guraysungur;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Guvercin g = new Guvercin();
		Guvercin g2 = new Guvercin();
		Devekusu dk = new Devekusu();
		
		List<Kus> kuslar = new ArrayList<>();
		kuslar.add(g);
		kuslar.add(g2);
		kuslar.add(dk);
		
		for(Kus k : kuslar) {
			k.uc(42, 54);
		}
		
		// Yani bir sınjıftan başka bir sınıf inherit ettiysen onun alt sınıfları üst sınıflaırn tüm metodlarını kullanabilir olmalı.
		// Burada uc metodu üst sınıfta var ancak devekusu uçamadığı için bu metodu implement edemiyor
		// Çözüm nedir?
		// Bu gibi durumalrda sadece tüm alt sınıflardan cağırılabilecek metodları üst sınıfta tanımlamalıyız.

	}

}
