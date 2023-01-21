package com.mertnamsal.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Yazar {
	
	@Id
	@GeneratedValue
	private int id;

	private String ad;
	
	@ManyToMany(mappedBy = "yazarlistesi",fetch = FetchType.EAGER)
	private List<Kitap> kitaplar;

	public Yazar() {
		super();
	}

	public Yazar(String ad) {
		super();
		this.ad = ad;
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

	public List<Kitap> getKitaplar() {
		return kitaplar;
	}

	public void setKitaplar(List<Kitap> kitaplar) {
		this.kitaplar = kitaplar;
	}

	@Override
	public String toString() {
		return "Yazar [id=" + id + ", ad=" + ad + ", kitap sayısı=" + kitaplar.size() + "]";  // DİKKAT
	}
	
	
	
	
}
