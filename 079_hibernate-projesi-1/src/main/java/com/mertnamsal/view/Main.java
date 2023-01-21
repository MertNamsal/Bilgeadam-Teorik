package com.mertnamsal.view;

import java.util.List;

import com.mertnamsal.entities.Ogretmen;
import com.mertnamsal.repository.OgretmenDao;

public class Main {
	
	public void save() {
		OgretmenDao ogretmenDao = new OgretmenDao();
//		Ogretmen ogr = new Ogretmen(104, "Mehmet","Hoca", 45, 14);
		Ogretmen ogr = new Ogretmen("Ayse","Öğretmen", 23);
		
		try {
			ogretmenDao.save(ogr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		OgretmenDao ogretmenDao = new OgretmenDao();
		
		Ogretmen ogr = new Ogretmen(1,"Ahmet","Şahin",25,5);
		
		
		try {
			ogretmenDao.update(ogr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getAll() {
		OgretmenDao ogretmenDao = new OgretmenDao();
		List<Ogretmen> list =null;
		try {
			list = ogretmenDao.getAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Ogretmen ogr : list) {
			System.out.println(ogr);
		}
	}
	
	public void findWithOrder() {
		OgretmenDao ogretmenDao = new OgretmenDao();
		List<Ogretmen> list =null;
		try {
			list = ogretmenDao.findWithOrder();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Ogretmen ogr : list) {
			System.out.println(ogr);
		}
	}
	
	public void getById() {
		OgretmenDao ogretmenDao = new OgretmenDao();
		Ogretmen ogr=null;
		try {
			ogr = ogretmenDao.getById(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ogr);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.findWithOrder();
		
		System.out.println("\nHoşçakalın");
	}
}
