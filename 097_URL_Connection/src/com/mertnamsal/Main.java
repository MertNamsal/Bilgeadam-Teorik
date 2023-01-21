package com.mertnamsal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main {

	public static void main(String[] args) {
		BufferedReader inputStream=null;
		try {
			
			URL url = new URL("https://www.ahmetturanalgin.com/blog-1");
			URLConnection urlConnection = url.openConnection();
			urlConnection.connect();
			
			inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line ="";
			while(line != null) {
				line = inputStream.readLine();
				System.out.println(line);
			}
			
		} catch (Exception e) {
		}finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
