package com.mertnamsal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main2 {

	public static void main(String[] args) {
		
		System.out.println(findKeyword("Psikobiyolojik","https://ahmetdoganca.com/blog/"));
	}
	
	private static boolean findKeyword(String keyword, String url_) {
		boolean found = false;
		
		BufferedReader inputStream=null;
		try {
			
			URL url = new URL(url_);
			URLConnection urlConnection = url.openConnection();
			urlConnection.connect();
			
			inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line ="";
			while(line != null) {
				line = inputStream.readLine();
				
				if(line != null && line.contains(keyword)) {
					found = true;
					break;
				}
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return found;
	}
}
