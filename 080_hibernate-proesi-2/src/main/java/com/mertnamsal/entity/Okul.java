package com.mertnamsal.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Okul {

	@Id
	@GeneratedValue
	private int id; 
	
	private String okulAdi;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "okul")	
	private List<Sinif> siniflar;
	
	
	public Okul(String okulAdi) {
		super();
		this.okulAdi = okulAdi;
	}




	public Okul() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getOkulAdi() {
		return okulAdi;
	}




	public void setOkulAdi(String okulAdi) {
		this.okulAdi = okulAdi;
	}




	public List<Sinif> getSiniflar() {
		return siniflar;
	}




	public void setSiniflar(List<Sinif> siniflar) {
		this.siniflar = siniflar;
	}
	
	
	
	
	
}
