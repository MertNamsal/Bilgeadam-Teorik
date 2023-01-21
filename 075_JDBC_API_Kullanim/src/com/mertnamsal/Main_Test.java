package com.mertnamsal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main_Test {
	
	private static void insert(Connection conn) {
		String sqlkomut = "insert into ogrenci(ogrencino,ad,soyad,dogumtarihi,cinsiyet) values(408,'Ömer','Işık','09.17.2001','E')";
		PreparedStatement prp;
		
		try {
			prp=conn.prepareCall(sqlkomut);
			prp.executeUpdate();  //Select sorgularında executeQuery digerlerinde executeUpdate cagirabilirsiinz
			System.out.println("Kayıt işlemi başarılı");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Kayıt işlemi başarısız");
		}
		
	}
	private static void select(Connection conn) {
		String sqlkomut ="select * from ogrenci";
		PreparedStatement prp;
		//VERİTABANI BAĞLANMA
		try {
			prp = conn.prepareCall(sqlkomut);
			ResultSet rs = prp.executeQuery();
			
			while(rs.next()) {
				//1.yol
				System.out.print(" Ogrenci no: "+rs.getInt("ogrencino"));
				System.out.print(" Ad: "+rs.getString("ad"));
				System.out.print(" Soyad: "+rs.getString("soyad"));
				System.out.print(" D.Tarihi: "+rs.getString("dogumtarihi"));
				System.out.print(" Cinsiyet: "+rs.getString("cinsiyet"));
				System.out.print(" SınavNotu1: "+rs.getInt("sinavnotu1"));
				System.out.print(" SınavNotu2: "+rs.getInt("sinavnotu2"));
				System.out.println(" FinalNotu: "+rs.getInt("finalnotu"));
				
				//2.yol
//				System.out.print(" Ogrenci no: "+rs.getInt(1));
//				System.out.print(" Ad: "+rs.getString(2));
//				System.out.print(" Soyad: "+rs.getString(3));
//				System.out.print(" D.Tarihi: "+rs.getString(4));
//				System.out.print(" Cinsiyet: "+rs.getString(5));
//				System.out.print(" SınavNotu1: "+rs.getInt(6));
//				System.out.print(" SınavNotu2: "+rs.getInt(7));
//				System.out.println(" FinalNotu: "+rs.getInt(8));
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	public static void selectOkulOzetBilgi(Connection conn) {
		//okulozetbilgi tablsoundaki kayıtları yazdıran
		String sqlkomut ="select * from okulozetbilgi";
		PreparedStatement prp;
		
		try {
			prp = conn.prepareCall(sqlkomut);
			ResultSet rs = prp.executeQuery();
			
			while(rs.next()) {
				System.out.print("Kız öğrenci sayısı: "+rs.getInt("kizogrencisayisi"));
				System.out.println(" Erkek öğrenci sayısı: "+rs.getInt("erkekogrencisayisi"));
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void update(Connection conn) {
		String sqlkomut ="update ogrenci set ad = 'Abuzer' where ogrencino = 408";
		PreparedStatement prp;
		
		try {
			prp=conn.prepareCall(sqlkomut);
			prp.executeUpdate(); 
			System.out.println("Güncelleme işlemi başarılı");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Güncelleme işlemi başarısız");
		}
		
	}
	
	public static void delete(Connection conn,int ogrencino) {
		String sqlkomut ="delete from ogrenci where ogrencino ="+ogrencino;
		PreparedStatement prp;
		
		try {
			prp=conn.prepareCall(sqlkomut);
			prp.executeUpdate(); 
			System.out.println("Silme işlemi başarılı");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Silme işlemi başarısız");
		}
	}
	private static void select(Connection conn,int ogrencino) {
		String sqlkomut ="select * from ogrenci where ogrencino ="+ogrencino;
		PreparedStatement prp;
		//VERİTABANI BAĞLANMA
		try {
			prp = conn.prepareCall(sqlkomut);
			ResultSet rs = prp.executeQuery();
			while(rs.next()) {
				System.out.print(" Ogrenci no: "+rs.getInt("ogrencino"));
				System.out.print(" Ad: "+rs.getString("ad"));
				System.out.print(" Soyad: "+rs.getString("soyad"));
				System.out.print(" D.Tarihi: "+rs.getString("dogumtarihi"));
				System.out.print(" Cinsiyet: "+rs.getString("cinsiyet"));
				System.out.print(" SınavNotu1: "+rs.getInt("sinavnotu1"));
				System.out.print(" SınavNotu2: "+rs.getInt("sinavnotu2"));
				System.out.println(" FinalNotu: "+rs.getInt("finalnotu"));
			}
			
					
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	private static void select(Connection conn,String ad) {
		String sqlkomut ="select * from ogrenci where ad ='"+ad+"'";
		PreparedStatement prp;
		//VERİTABANI BAĞLANMA
		try {
			prp = conn.prepareCall(sqlkomut);
			ResultSet rs = prp.executeQuery();
			while(rs.next()) {
				System.out.print(" Ogrenci no: "+rs.getInt("ogrencino"));
				System.out.print(" Ad: "+rs.getString("ad"));
				System.out.print(" Soyad: "+rs.getString("soyad"));
				System.out.print(" D.Tarihi: "+rs.getString("dogumtarihi"));
				System.out.print(" Cinsiyet: "+rs.getString("cinsiyet"));
				System.out.print(" SınavNotu1: "+rs.getInt("sinavnotu1"));
				System.out.print(" SınavNotu2: "+rs.getInt("sinavnotu2"));
				System.out.println(" FinalNotu: "+rs.getInt("finalnotu"));
			}
			
					
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	private static void selectWithPrepArgs(Connection conn,String ad,String soyad) {
		String sqlkomut ="select * from ogrenci where ad = ? and soyad = ?";
		PreparedStatement prp;
		//VERİTABANI BAĞLANMA
		try {
			prp = conn.prepareCall(sqlkomut);
			ResultSet rs = prp.executeQuery();
			prp.setString(1, ad);
			prp.setString(2, soyad); //Integer ise prp.setInt yapıcaktık
			while(rs.next()) {
				System.out.print(" Ogrenci no: "+rs.getInt("ogrencino"));
				System.out.print(" Ad: "+rs.getString("ad"));
				System.out.print(" Soyad: "+rs.getString("soyad"));
				System.out.print(" D.Tarihi: "+rs.getString("dogumtarihi"));
				System.out.print(" Cinsiyet: "+rs.getString("cinsiyet"));
				System.out.print(" SınavNotu1: "+rs.getInt("sinavnotu1"));
				System.out.print(" SınavNotu2: "+rs.getInt("sinavnotu2"));
				System.out.println(" FinalNotu: "+rs.getInt("finalnotu"));
			}
			
					
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("trying to connect...");

		String adres = "jdbc:postgresql://localhost:5432/dbtest"; // localhost : 127.0.0.1 her bilgisayarda local IP olarak tanımlıdır. WAN -> IP servis saglayıcı tarafından verilen
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
		
		//-----------------
		
		//SELECT
		
//		select(conn);
//		insert(conn);
//		selectOkulOzetBilgi(conn);
//		update(conn);
//		delete(conn,407);
		select(conn,"Ayşe");
		
		//-----------------
		
		//VERİTABANI KAPATMA 
		try {
			conn.close();
			System.out.println("Connection closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
