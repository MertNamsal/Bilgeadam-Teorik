package com.mertnamsal.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table
public class Sinif {

	@Id
	@GeneratedValue
	private int sinifId;
	private String lokasyon;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Dolap> dolaplar;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Okul okul;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Lab lab;
	

	public Sinif() {
		super();
	}

	
	
	public Sinif(String lokasyon, List<Dolap> dolaplar, Lab lab, Okul okul) {
		super();
		this.lokasyon = lokasyon;
		this.dolaplar = dolaplar;
		this.lab = lab;
		this.okul = okul;
	}



	public Sinif(Lab lab, String lokasyon) {
		super();
		this.lokasyon = lokasyon;
		this.lab = lab;
	}


	public List<Dolap> getDolaplar() {
		return dolaplar;
	}


	public void setDolaplar(List<Dolap> dolaplar) {
		this.dolaplar = dolaplar;
	}


	

	public int getSinifId() {
		return sinifId;
	}


	public void setSinifId(int sinifId) {
		this.sinifId = sinifId;
	}


	public String getLokasyon() {
		return lokasyon;
	}


	public void setLokasyon(String lokasyon) {
		this.lokasyon = lokasyon;
	}


	public Lab getLab() {
		return lab;
	}


	public void setLab(Lab lab) {
		this.lab = lab;
	}



	public Okul getOkul() {
		return okul;
	}



	public void setOkul(Okul okul) {
		this.okul = okul;
	}



	@Override
	public String toString() {
		return "Sinif [sinifId=" + sinifId + ", lokasyon=" + lokasyon + ", dolaplar=" + dolaplar + ", lab=" + lab + "]";
	}


	
	
	
	
}
