package com.mertnamsal.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mertnamsal.entity.Personel;

public class PersonelRepository {

	public ArrayList<Personel> getAllPersonel() {
		
		ArrayList<Personel> personelList = veritabanindanVeriCek("select * from persons");
		
		return personelList;
	}
	
	public ArrayList<Personel> getPersonelById(String id) {
		
		ArrayList<Personel> personelList = veritabanindanVeriCek("select * from persons where id = "+id);
		
		return personelList;
	}

	private ArrayList<Personel> veritabanindanVeriCek(String sqlKomut) {
				
		Connection conn = veriTabaninaBaglan();
		PreparedStatement prp;
		ArrayList<Personel> list = new ArrayList<>();
		
		try {
			prp = conn.prepareCall(sqlKomut);
			ResultSet rs = prp.executeQuery();
			
			while(rs.next()) {
				Personel p = new Personel(rs.getInt("id"),rs.getString("ad"),rs.getString("soyad"));
				list.add(p);
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

	

}
