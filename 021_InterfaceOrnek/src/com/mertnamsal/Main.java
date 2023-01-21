package com.mertnamsal;

public class Main {
	public static void kisaSureliUc(IUcabilir kus) {
		System.out.println("\n-------------------\n");
		kus.kanatCirp();
	}
	
	public static void belirtilenSureKadarUc(IUcabilir kus, int saniye) {
		System.out.println("\n *********");
		for (int i = 0; i < saniye; i++) {
			kus.kanatCirp();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void sevinmeHareketiYap(IKuyruklu kuyrukluHayvan,int adet) {
	
	}
	public static void main(String[] args) {
		
		IUcabilir beyazPacaliGuvercin = new Guvercin("Beyaz Paçalı",1,12);
		beyazPacaliGuvercin.gagala("yem");
		
		IUcabilir minikSerce = new Serce("Minik Serçe",1,8);
		minikSerce.gagala("yem");
		
		//POlymorphism with Interfaces:
		Main.kisaSureliUc(beyazPacaliGuvercin);
		Main.kisaSureliUc(minikSerce);
		
		Main.belirtilenSureKadarUc(beyazPacaliGuvercin, 1);
		Main.belirtilenSureKadarUc(minikSerce, 1);
		
		Kedi kedi = new Kedi("aaa",123,123);
		kedi.nefesAl();
		
		Guvercin guv = new Guvercin("guv", 1, 15);
		guv.nefesAl();
		
		HayvanBakicisi hayvanBakicisi = new HayvanBakicisi();
		hayvanBakicisi.hayvanlariOynat(kedi);
		
	}
}
