package com.mertnamsal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginMain {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String username = "";
		String password = "";
		
		do {
			System.out.println("Enter username");
			username = scan.nextLine();
			System.out.println("Enter password");
			password = scan.nextLine();
		} while (!verifyUsernamePassword(username,password));
		
		System.out.println("Sisteme hoşgeldiniz...");
	}

	private static boolean verifyUsernamePassword(String username, String password) {
		boolean usernamePasswordCiftiMevcutMu = false;
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
