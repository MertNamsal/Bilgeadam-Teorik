package com.guraysungur;

public class Devekusu extends Kus {

	public void uc(double enlem, double boylam) {
		System.out.println("Unimplemented... Çünkü devekuşu uçamaz!!! ");  // LSP'ye aykırı
	}
	
	public void kosarakGit(double enlem, double boylam) {
		System.out.println("enlem " + enlem + " boylam " + boylam + " koordinatlarına koşarak gidiyor..");
	}
	
}
