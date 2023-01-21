package com.mertnamsal.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Kitap {
	
	@Id
	@GeneratedValue
	private int id;
	private String ad;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Yazar> yazarlistesi;

	public Kitap() {
		super();
	}

	// Kitap nesnesi Yazar nesnesi olmadan varolamaz şeklinde bir yapı kuruyorum.
	public Kitap(String ad, List<Yazar> yazarlistesi) {
		super();
		this.ad = ad;
		this.yazarlistesi = yazarlistesi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public List<Yazar> getYazarlistesi() {
		return yazarlistesi;
	}

	public void setYazarlistesi(List<Yazar> yazarlistesi) {
		this.yazarlistesi = yazarlistesi;
	}

	@Override
	public String toString() {
		return "Kitap [id=" + id + ", ad=" + ad + ", yazarlistesi=" + yazarlistesi + "]";
	}
	
	
	
	
}
