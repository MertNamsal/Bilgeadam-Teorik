package com.mertnamsal.service;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import com.mertnamsal.entity.Ogrenci;
import com.mertnamsal.repository.OgrenciRepository;

public class OgrenciService {
	
	private OgrenciRepository ogrenciRepository;
	
	public OgrenciService() {
		ogrenciRepository = new OgrenciRepository();
	}
	
	public ArrayList<Ogrenci> getAllOgrenci() {
		
		return ogrenciRepository.getAllOgrenci();
	}

	public boolean kayitSil(String ogrno) {
		//id int mi değil mi kontrol et
		if(StringUtils.isNumeric(ogrno)) {
			ogrenciRepository.delete(ogrno);
			return true;
		}
		else
			return false;
		
	}

	public boolean kayitEkle(Ogrenci ogr) {
		ogrenciRepository.kayitEkle(ogr);
		return false;
	}

}
