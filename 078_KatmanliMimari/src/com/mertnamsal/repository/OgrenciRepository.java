package com.mertnamsal.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mertnamsal.entity.Ogrenci;
import com.mertnamsal.entity.Personel;

public class OgrenciRepository {

	public ArrayList<Ogrenci> getAllOgrenci() {

		ArrayList<Ogrenci> list = veritabanindanVeriCek("select ogrencino,ad,soyad,cinsiyet,sinavnotu1 from ogrenci");
		return list;
	}
	
	private ArrayList<Ogrenci> veritabanindanVeriCek(String sqlKomut) {
		
		Connection conn = veriTabaninaBaglan();
		PreparedStatement prp;
		ArrayList<Ogrenci> list = new ArrayList<>();
		
		try {
			prp = conn.prepareCall(sqlKomut);
			ResultSet rs = prp.executeQuery();
			
			while(rs.next()) {
				Ogrenci o = new Ogrenci(rs.getInt("ogrencino"),rs.getString("ad"),rs.getString("soyad"),rs.getString("cinsiyet"),rs.getInt("sinavnotu1"));
				list.add(o);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//Veritabanı bağlantısını kapat
		veritabaniBaglantisiniKapat(conn);
		
		return list;
	}
	
	public void veritabaniBaglantisiniKapat(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static Connection veriTabaninaBaglan() {
		System.out.println("trying to connect...");
		String adres = "jdbc:postgresql://localhost:5432/dbtest"; 
		String kullaniciadi = "postgres";
		String sifre = "21wvtmykx";

		Connection conn = null;

		try {
			conn = DriverManager.getConnection(adres, kullaniciadi, sifre);

			System.out.println("Connection established...");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		return conn;
	}

	public void delete(String ogrno) {
		veritabaniniGuncelle("delete from ogrenci where ogrencino ="+ogrno);
		
	}

	private void veritabaniniGuncelle(String sqlKomut) {
		
		Connection conn = veriTabaninaBaglan();
		PreparedStatement prp;

		try {
			prp = conn.prepareCall(sqlKomut);
			prp.executeUpdate();

			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Veritabanı bağlantısını kapat
		veritabaniBaglantisiniKapat(conn);

		
		
	}

	public void kayitEkle(Ogrenci ogr) {
		veritabaniniGuncelle("insert into ogrenci (ogrencino,ad,soyad,dogumtarihi,cinsiyet,sinavnotu1) values("+ogr.getOgrencino()+",'"+ogr.getAd()+"','"+ogr.getSoyad()
			+"','2000-01-01','"+ogr.getCinsiyet()+"',"+ogr.getSinavnotu1()+")");
		
		
	}

}
