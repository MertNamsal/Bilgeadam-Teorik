package com.mertnamsal.soru3;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi {
	
	static List<Hayvan> hayvanlar = new ArrayList<>();
	static List<MemeliHayvan> memeliHayvanlar = new ArrayList<>();
	static List<Surungen> surungenler = new ArrayList<>();
	
	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
		for (int i = 0; i < hayvanlar.size(); i++) {
			if(hayvanlar.get(i).getAd()== m.getAd()) {
				System.out.println("Bu isimde bir hayvan vardır ");
				return;
			}
		}	
		hayvanlar.add(m);
		memeliHayvanlar.add(m);
		System.out.println("Hayvanat bahçesine "+m.getAd()+" eklendi.");
	}
	
	public void bahceyeSurungenEkle(Surungen s) {
		for (int i = 0; i < hayvanlar.size(); i++) {
			if(hayvanlar.get(i).getAd()== s.getAd()) {
				System.out.println("Bu isimde bir hayvan vardır ");
				return;
			}
		}
		hayvanlar.add(s);
		surungenler.add(s);
		System.out.println("Hayvanat bahçesine "+s.getAd()+" eklendi.");
	}
	public void hayvanSesCikar(Hayvan h) {
		h.sesCikar();
	}
	public void hayvanCinsiniBul(String hayvanAdi) {
		for (int i = 0; i < hayvanlar.size(); i++) {
			if(hayvanlar.get(i).getAd().equalsIgnoreCase(hayvanAdi)) {
				if(hayvanlar.get(i).toString().substring(0,1).equals("M")) {
					System.out.println(hayvanlar.get(i).getAd()+ " bir Memeli Hayvan");
					return;
				}else if(hayvanlar.get(i).toString().substring(0,1).equals("S")) {
					System.out.println(hayvanlar.get(i).getAd()+ " bir Sürüngen ");
					return;
				}
			}
		}
		System.out.println(hayvanAdi+" isimli hayvan bu hayvanat bahçesinde yok!");
	}
	
	public void hayvaninBilgileriniYazdir(String hayvanAdi) {
		for (int i = 0; i < hayvanlar.size(); i++) {
			if(hayvanlar.get(i).getAd().equalsIgnoreCase(hayvanAdi)) {
				System.out.println(hayvanlar.get(i).toString());
				return;
			}
		}
		System.out.println(hayvanAdi+" isminde bir hayvan Hayvanat Bahçesinde yok");
	}
	public void hayvaniHareketEttir(String hayvanAdi) {
		
		for (int j = 0; j < memeliHayvanlar.size(); j++) {
			if(memeliHayvanlar.get(j).getAd().equalsIgnoreCase(hayvanAdi)) {
				memeliHayvanlar.get(j).yuru();
				
			}	
		}
		
		
		for (int k = 0; k < surungenler.size(); k++) {
			if(surungenler.get(k).getAd().equalsIgnoreCase(hayvanAdi)) {
				surungenler.get(k).surun();
				
			}
		}
		
		
		
		
	}
}
