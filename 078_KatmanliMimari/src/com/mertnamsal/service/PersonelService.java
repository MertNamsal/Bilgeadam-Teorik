package com.mertnamsal.service;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import com.mertnamsal.entity.Personel;
import com.mertnamsal.repository.PersonelRepository;

public class PersonelService {

	private PersonelRepository personelRepository;
	
	public PersonelService() {
		personelRepository = new PersonelRepository();
	}
	
	public ArrayList<Personel> getAllPersonel() {
		
		return personelRepository.getAllPersonel();
	}

	public ArrayList<Personel> getPersonelById(String id) {
		
		//id int mi değil mi kontrol et
		if(StringUtils.isNumeric(id)) {
			return personelRepository.getPersonelById(id);
		}
		else
		return null;
	}

}
