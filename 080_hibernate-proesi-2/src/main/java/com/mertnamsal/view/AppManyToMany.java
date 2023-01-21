package com.mertnamsal.view;

import java.util.Arrays;
import java.util.List;

import com.mertnamsal.entity.Kitap;
import com.mertnamsal.entity.Yazar;
import com.mertnamsal.repository.KitapDao;
import com.mertnamsal.repository.YazarDao;

public class AppManyToMany {

	public static void main(String[] args) {

		Yazar y1 = new Yazar("Ömer Seyfettin");
		Yazar y2 = new Yazar("Yahya Kemal Beyatlı");
		
		Kitap kitap = new Kitap("Kaşağı", Arrays.asList(y1, y2));
		Kitap kitap2 = new Kitap("Kitap2", Arrays.asList(y1, y2));
		Kitap kitap3 = new Kitap("Kitap3", Arrays.asList(y1));
		Kitap kitap4 = new Kitap("Kitap4", Arrays.asList(y1));
		Kitap kitap5 = new Kitap("Kitap5", Arrays.asList(y1));
		Kitap kitap6 = new Kitap("Kitap6", Arrays.asList(y1));
		Kitap kitap7 = new Kitap("Kitap7", Arrays.asList(y2));
		
		KitapDao kitapDao = new KitapDao();
		try {
			kitapDao.save(kitap);
			kitapDao.save(kitap2);
			kitapDao.save(kitap3);
			kitapDao.save(kitap4);
			kitapDao.save(kitap5);
			kitapDao.save(kitap6);
			kitapDao.save(kitap7);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		YazarDao yazarDao = new YazarDao();
		List<Yazar> yazarListesi = yazarDao.getAll();
		
		for(Yazar y : yazarListesi) {
			System.out.println("Yazar Adı:"+y.getAd()+" Id : "+y.getId());
			for(Kitap k : y.getKitaplar()) {
				System.out.println(" Kitap adı: "+k.getAd()+" Id: "+k.getId());
				//Hata alırız yazarı fetch = FetchType.EAGER yapmamız lazım
			}
		}
		
		
		

	}

}
