package com.mertnamsal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("trying to connect...");
		
		String adres = "jdbc:postgresql://localhost:5432/dbtest";	
		String kullaniciadi = "postgres";
		String sifre = "21wvtmykx";
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(adres, kullaniciadi,sifre);
			
			System.out.println("Connection established...");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		try {
			conn.close();
			System.out.println("Connection closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
