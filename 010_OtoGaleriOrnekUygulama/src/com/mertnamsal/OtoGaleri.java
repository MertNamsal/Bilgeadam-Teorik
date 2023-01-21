package com.mertnamsal;

public class OtoGaleri {
	
	private Otomobil[] otomobilDizisi;
	private int galeridekiOtomobilSayisi;
	
	public OtoGaleri(int limit) {
		otomobilDizisi = new Otomobil[limit];  // { null,null,null ...} limit kadar
		this.galeridekiOtomobilSayisi =0;
		
	}
	public int findCount(String marka) {
		int counter = 0;
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			if(this.otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) {
				counter++;
			}
		}
		return counter;
	}
	public Otomobil[] search(String marka) {
		
		
		Otomobil[] aramaSonuclari = new Otomobil[findCount(marka)];
		
		int sayac=0;
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			if(this.otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) {
				aramaSonuclari[sayac]= this.otomobilDizisi[i];
				sayac++;
			}
		}
		return aramaSonuclari;
	}
	
	public void galeriyeOtomobilEkle(Otomobil otomobil) {
		if(galeridekiOtomobilSayisi < otomobilDizisi.length) {
			otomobilDizisi[galeridekiOtomobilSayisi] = otomobil;
			galeridekiOtomobilSayisi++;
		}else {
			System.err.println("Galeri kapasitesi full araç eklenmedi");
		}
	}
	
	public void galeridekiOtomobilleriListele() {
		System.out.println("\nGalerideki otomobiller :\n------------------------------");
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			System.out.println(otomobilDizisi[i].getMarka()+" "+ otomobilDizisi[i].getModel());
		}
	}

	public int getGaleridekiOtomobilSayisi() {
		return galeridekiOtomobilSayisi;
	}

	public void setGaleridekiOtomobilSayisi(int galeridekiOtomobilSayisi) {
		this.galeridekiOtomobilSayisi = galeridekiOtomobilSayisi;
	}
	

}
