package com.mertnamsal.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Türkçe: ---");
		Locale.setDefault(new Locale("tr","TR"));
		ResourceBundle resourceBundle = ResourceBundle.getBundle("com/mertnamsal/config/resource_bundle");
		System.out.println(resourceBundle.getString("language")+" : "+resourceBundle.getString("word1") + " & "+resourceBundle.getString("word2"));
		
		Locale.setDefault(new Locale("fr","FR"));
		resourceBundle = ResourceBundle.getBundle("com/mertnamsal/config/resource_bundle");
		System.out.println(resourceBundle.getString("language")+" : "+resourceBundle.getString("word1") + " & "+resourceBundle.getString("word2"));
		
		Locale.setDefault(new Locale("en","EN"));
		resourceBundle = ResourceBundle.getBundle("com/mertnamsal/config/resource_bundle");
		System.out.println(resourceBundle.getString("language")+" : "+resourceBundle.getString("word1") + " & "+resourceBundle.getString("word2"));
		
		Locale.setDefault(new Locale("fr","FR"));
		resourceBundle = ResourceBundle.getBundle("com/mertnamsal/config/resource_bundle");
		System.out.println(resourceBundle.getString("language")+" : "+resourceBundle.getString("word1") + " & "+resourceBundle.getString("word2"));
	}
}
