package com.guraysungur.lsp;

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
		
		for (Kus k : kuslar) {
			k.git(42, 56);
		}

	}

}
