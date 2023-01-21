package com.mertnamsal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class Main {
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		String username = "";
		String password = "";
		Connection conn = veritabaninaBaglan();
		do {
			System.out.println("Enter username");
			username = scan.nextLine();
			System.out.println("Enter password");
			password = scan.nextLine();
		} while (!verifyUsernamePassword(username, DigestUtils.sha256Hex(password)));
		
		System.out.println("Sisteme hoşgeldiniz...");
		
		int secim = 9;
		
		
		
		do {
			System.out.println("Öğrenci bilgi sitemin hoşgeldiniz");
			System.out.println("---------------------------------");
			System.out.println("1-Yeni Kayıt");
			System.out.println("2-Silme");
			System.out.println("3-Güncelleme");
			System.out.println("4-Tüm öğrencileri listele");
			System.out.println("5-Kız öğrencileri listele");
			System.out.println("6-Erkek öğrencileri listele");
			System.out.println("7-Tüm sınav ortalamaları 50'nin üzerinde olan öğrencileri listele");
			System.out.println("8-Belirli bir ilde yaşayan öğrencileri listele");
			System.out.println("9-Çıkış");
			
			secim = scan.nextInt();
			
			switch (secim) {
			case 1:
				yeniKayit(conn,scan);
				break;
			case 2:
				delete(conn,scan);
				break;
			case 3:
				update(conn,scan);
				break;
			case 4:
				ogrencileriListele(conn);
				break;
			case 5:
				ogrencileriListele(conn, "K");
				break;
			case 6:
				ogrencileriListele(conn, "E");
				break;
			case 7:
				ogrencileriListele50üstü(conn,scan);
				break;
			case 8:
				ogrencileriSehireGoreListele(conn, scan);
				break;
	
			default:
				break;
			}
		}while(secim != 9);
		
		//Veritabanı bağlantısı kapatma
		veritabaniBaglantisiKapat(conn);
		
		
	}
	
	public static void veritabaniBaglantisiKapat(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
				System.out.println("VT bağlantısı kapatıldı, hoşçakalın");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Veritabanı bağlantısı kapatılırken hata oluştu");
			}
		}
	}
	
	public static Connection veritabaninaBaglan() {
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
		return conn;
	}
	
	public static void ogrencileriListele(Connection conn) {
		String sqlkomut ="select * from ogrenci";
		 
		//VERİTABANI BAĞLANMA
		try {
			PreparedStatement prp = conn.prepareCall(sqlkomut);
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
				
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void ogrencileriListele(Connection conn,String cinsiyet) {
		String sqlkomut ="select * from ogrenci where cinsiyet ='"+cinsiyet+"'";
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
				
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	public static String ogrencileriListele(Connection conn,int ogrno) {
		String sqlkomut ="select * from ogrenci where ogrencino = "+ogrno;
		PreparedStatement prp;
		String isleniyormu ="OgrenciYok";
		String sonuc = "";
		//VERİTABANI BAĞLANMA
		try {
			prp = conn.prepareCall(sqlkomut);
			ResultSet rs = prp.executeQuery();
			
			if(rs.next()) {
				isleniyormu = rs.getString("isleniyormu");
				if(isleniyormu.equalsIgnoreCase("E")) {
					sonuc = "Baska bir islem yapılmaktadır, daha sonra deneyin";
				}else if (isleniyormu.equalsIgnoreCase("H")){
					isleniyormuSutununuGuncelle(conn, "E", ogrno);
					String sqlkomutUpdate = "update ogrenci set isleniyormu = 'E' where ogrencino = "+ogrno;
					PreparedStatement prpUpdate;
					prpUpdate = conn.prepareCall(sqlkomutUpdate);
					prpUpdate.executeUpdate();
					sonuc ="olumlu";
				}
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
		return isleniyormu;
	}
	
	public static void ogrencileriListele50üstü(Connection conn,Scanner scan) {
		
		System.out.println("Hangi not ortalaması üstündeki öğrencileri görmek istersiniz ?");
		int cevap = scan.nextInt();
		String sqlkomut ="select * from ogrenci where (sinavnotu1+sinavnotu2+finalnotu)/3 >"+cevap;
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
				
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void ogrencileriSehireGoreListele(Connection conn,Scanner scan) {
		
		System.out.println("Hangi ilde yaşayan öğrencileri görmek istersiniz ?");
		int sehir = scan.nextInt();
		String sqlkomut ="select * from ogrenci where ogrencino in (select ogrencino from adres where sehir = "+sehir+")";
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
				
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	
	public static void yeniKayit(Connection conn, Scanner scan) {
		
		scan.nextLine();
		
		System.out.print("Lütfen öğrenci no giriniz: ");
		int ogrno = scan.nextInt();
		scan.nextLine(); // hata önlemek için
		
		System.out.print("Lütfen öğrenci adı giriniz: ");
		String ad = scan.nextLine();
		
		System.out.print("Lütfen öğrenci soyad giriniz: ");
		String soyad = scan.nextLine();
		
		System.out.print("Lütfen öğrenci dogum tarihi giriniz: ");
		String dogumtarihi = scan.nextLine();
		Date dt = Date.valueOf(dogumtarihi);
		
		System.out.print("Lütfen öğrenci cinsiyet giriniz: ");
		String cins = scan.nextLine();
		
		
		String sqlkomut = "insert into ogrenci(ogrencino,ad,soyad,dogumtarihi,cinsiyet) values(?,?,?,?,?)";
		
		try {
			PreparedStatement prp= conn.prepareCall(sqlkomut);
			prp.setInt(1, ogrno);
			prp.setString(2,ad);
			prp.setString(3,soyad);
			prp.setDate(4,dt);
			prp.setString(5,cins);
			prp.executeUpdate();   //Query'yi veritabanına gönder
			System.out.println("Kayıt işlemi başarılı");
		} catch (SQLException e1) {
			e1.printStackTrace();
			System.out.println("Kayıt işlemi başarısız");
		}
		
		
	}
	
	public static void delete(Connection conn,Scanner scan) {
		
		System.out.print("Lütfen silincek öğrencinin nosunu giriniz: ");
		int ogrno = scan.nextInt();

		
		String sqlkomut ="delete from ogrenci where ogrencino ="+ogrno;
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
	
	public static void update(Connection conn,Scanner scan) {
		
		System.out.print("Lütfen bilgileri güncellenecek kişinin öğrencino sunu giriniz: ");
		int ogrno = scan.nextInt();
		
		scan.nextLine(); // hata önlemek için
		
		//Öncelikle güncelleme yapılacak öğrenci ile ilgili halihazırda mevcut bir güncelleme işlemi var mı kontrol et
		//eğer varsa (yani başka bir kullanıcı bu öğrencinin bilgilerini güncelliyorsa) güncelleme yapılmasına izin verme 
		//( daha sonra güncelleyen msj ver)
		String sonuc = ogrencileriListele(conn, ogrno);
		if(!sonuc.contentEquals("olumlu")) {
			return;
		}
		
		System.out.print("Lütfen öğrenci adı giriniz: ");
		String ad = scan.nextLine();
		
		System.out.print("Lütfen öğrenci soyad giriniz: ");
		String soyad = scan.nextLine();
		
		System.out.print("Lütfen öğrenci dogum tarihi giriniz: ");
		String dogumtarihi = scan.nextLine();
		Date dt = Date.valueOf(dogumtarihi);
		
		System.out.print("Lütfen öğrenci cinsiyet giriniz: ");
		String cins = scan.nextLine();
		
		
		
		String sqlkomut ="update ogrenci set ad = ?,soyad = ?,dogumtarihi= ?,cinsiyet= ? where ogrencino = ?";
		PreparedStatement prp;
		
		try {
			prp=conn.prepareCall(sqlkomut);
			prp.setString(1, ad);
			prp.setString(2,soyad);
			prp.setDate(3,dt);
			prp.setString(4,cins);
			prp.setInt(5,ogrno);
			prp.executeUpdate();   //Query'yi veritabanına gönder
			
			prp.executeUpdate(); 
			System.out.println("Güncelleme işlemi başarılı");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Güncelleme işlemi başarısız");
		}
		
		//isleniyormu sütununu tekrar 'H' şeklinde değiştirelim
		isleniyormuSutununuGuncelle(conn, "H", ogrno);
		
	}
	
	public static void isleniyormuSutununuGuncelle(Connection conn,String durum,int ogrno) {
		String sqlkomutUpdate = "update ogrenci set isleniyormu = '"+durum+"' where ogrencino = "+ogrno;
		PreparedStatement prpUpdate;
		try {
			prpUpdate = conn.prepareCall(sqlkomutUpdate);
			prpUpdate.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	private static boolean verifyUsernamePassword(String username, String password) {
		boolean usernamePasswordCiftiMevcutMu = false;
		
		String adres = "jdbc:postgresql://localhost:5432/dbtest"; 
		String kullaniciadi = "postgres";
		String sifre = "21wvtmykx";

		Connection conn = null;

		try {
			conn = DriverManager.getConnection(adres, kullaniciadi, sifre);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//Sleect and control
		String sql = "select username,password from users where username = '"+username+"' and password = '"+password+"'";
		PreparedStatement prp;
		
		try {
			prp=conn.prepareCall(sql);
			ResultSet rs = prp.executeQuery();
			
			if(rs.next()) {
				usernamePasswordCiftiMevcutMu=true;
			}else {
				System.out.println("Kullanıcı bulunamadı, tekrar deneyin");
				usernamePasswordCiftiMevcutMu=false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return usernamePasswordCiftiMevcutMu;
	}
}





		//hash a String with SHA-256 bit algorithm
		/*
		String s = DigestUtils.sha256Hex("123");
		System.out.println("Ali'nin şifresi 123'ün SHA256 ile hashlenmiş hali "+s);
		
		String bs = DigestUtils.sha256Hex("321");
		System.out.println("Veli'nin şifresi 321'ün SHA256 ile hashlenmiş hali "+bs);
		*/