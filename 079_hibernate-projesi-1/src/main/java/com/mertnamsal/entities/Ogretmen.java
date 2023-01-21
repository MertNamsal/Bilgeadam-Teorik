package com.mertnamsal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

//Anotasyon
@Entity
@Table(name = "ogretmen")
public class Ogretmen {

	@Id             //Primary key olduğunu belirtmek için Id anatasyonunu kullanıyoruz.
	@GeneratedValue // Primary keyi kendi verir, sen nesne içerisinde id versen de dikkate almaz.
	private int id;
	
	@Column(nullable = true)    //tablodaki ad sütunu null olabilir demek.
	private String ad;
	
	@Column(nullable = false,length=20)  //not null ve 20 karanter uzunlugunda
	private String soyad;
	
	@Column(columnDefinition = "int default 18", nullable =false)
	private int yas; //default not null
	
	@ColumnDefault(value = "5")
	@Column(name ="hizmet_yili",nullable = false) // Tablodaki sütun isminin class içindeki üye değişkeninden farklı olmasını istiyorsanız name ile belirtin.
	private int hizmetyili;

	public Ogretmen() {
		super();
	}

	public Ogretmen(int id, String ad, String soyad, int yas, int hizmetyili) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.hizmetyili = hizmetyili;
	}

	public Ogretmen(String ad, String soyad, int yas, int hizmetyili) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.hizmetyili = hizmetyili;
	}
	

	public Ogretmen(String ad, String soyad, int yas) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
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

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public int getHizmetyili() {
		return hizmetyili;
	}

	public void setHizmetyili(int hizmetyili) {
		this.hizmetyili = hizmetyili;
	}

	@Override
	public String toString() {
		return "Ogretmen [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", yas=" + yas + ", hizmetyili=" + hizmetyili
				+ "]";
	}
	
	
}
