package com.mertnamsal.repository;

import java.util.List;

import com.mertnamsal.repository.entity.Ogretmen;
import com.mertnamsal.utility.DataBase;

public class OgretmenRepository {
	public void save(Ogretmen ogretmen) {
		DataBase.ogretmenListesi.add(ogretmen);
	}
	
	public void update(Ogretmen ogretmen) {
		for(int i = 0;i< DataBase.ogretmenListesi.size();i++) {
			if(DataBase.ogretmenListesi.get(i).getId()==ogretmen.getId()) {
				DataBase.ogretmenListesi.get(i).setAdi(ogretmen.getAdi());
				DataBase.ogretmenListesi.get(i).setSoyad(ogretmen.getSoyad());
				
			}
		}
	}
	
	public void delete(int ogretmenID) {
		Ogretmen silinecekOgretmen = null;
		for(Ogretmen ogr : DataBase.ogretmenListesi) {
			if(ogr.getId()== ogretmenID) {
				silinecekOgretmen=ogr;
				break;			
			}
		}
		if(silinecekOgretmen != null) {
			DataBase.ogretmenListesi.remove(silinecekOgretmen);
		}
	}
	
	public List<Ogretmen> findAll(){
		
		return DataBase.ogretmenListesi;
	}
	public Ogretmen findById(int id) {
		Ogretmen tempOgretmen = null;
		for(Ogretmen ogr : DataBase.ogretmenListesi) {
			if(ogr.getId()== id) {
				tempOgretmen = ogr;
				break;
			}
		}
		return tempOgretmen;
	}
}
