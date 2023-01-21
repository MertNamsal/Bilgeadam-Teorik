package com.guraysungur;

public class Personel {

	private int id;
	private String ad;
	private String soyad;
	
	
	public void save() {
		System.out.println("JDBC ve PostgreSQL kullanarak veritabanına bu Personel nesnesini kaydediyoruz..");
	}
	
	public void update() {
		System.out.println("JDBC ve PostgreSQL kullanarak veritabanına bu Personel nesnesini güncelliyoruz..");
	}
	
	public Personel(int id, String ad, String soyad) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
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


	@Override
	public String toString() {
		return "Personel [id=" + id + ", ad=" + ad + ", soyad=" + soyad + "]";
	}
	
	// Bu sınıf bu haliyle SRP'ye uygun değil.
	// Bu sınıfta şuanda 2 responsibility var:
	// 1. Temel personel verilerini tutmak
	// 2. Vertiabanı işlemleri
	// Bu nedenle SRP'ye aykırı, bu sınıfı 2 ayrı sınıfa bölmeliyiz...
	
}
