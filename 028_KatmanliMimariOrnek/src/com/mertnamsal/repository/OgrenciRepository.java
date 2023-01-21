package com.mertnamsal.repository;

import java.util.List;

import com.mertnamsal.repository.entity.Ogrenci;
import com.mertnamsal.utility.DataBase;

public class OgrenciRepository {
	
	public void save(Ogrenci ogrenci) {
		DataBase.ogrenciListesi.add(ogrenci);
	}
	
	public void update(Ogrenci ogrenci) {
		for(int i = 0;i< DataBase.ogrenciListesi.size();i++) {
			if(DataBase.ogrenciListesi.get(i).getId()==ogrenci.getId()) {
				DataBase.ogrenciListesi.get(i).setAdi(ogrenci.getAdi());
				DataBase.ogrenciListesi.get(i).setSoyad(ogrenci.getSoyad());
				
			}
		}
	}
	
	public void delete(int ogrenciID) {
		Ogrenci silinecekOgrenci = null;
		for(Ogrenci ogr : DataBase.ogrenciListesi) {
			if(ogr.getId()== ogrenciID) {
				silinecekOgrenci=ogr;
				break;			
			}
		}
		if(silinecekOgrenci != null) {
			DataBase.ogrenciListesi.remove(silinecekOgrenci);
		}
	}
	
	public List<Ogrenci> findAll(){
		
		return DataBase.ogrenciListesi;
	}
	public Ogrenci findById(int id) {
		Ogrenci tempOgrenci = null;
		for(Ogrenci ogr : DataBase.ogrenciListesi) {
			if(ogr.getId()== id) {
				tempOgrenci = ogr;
				break;
			}
		}
		return tempOgrenci;
	}
}
