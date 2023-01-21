package com.mertnamsal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterOrnek {
	
	public static void main(String[] args) {
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt"))) {
			
			writer.write("Özgür Öz, 443\n");
			writer.write("Ali Kaya, 333\n");
			writer.flush(); // flush opsiyoneldir. yazarsak şuana kadar olanları bufferda o ana kadar biriken veriler stream e yazılır
			//siz flush kullanmazsınız buffer belli bir doluluga gelince veya belirli bir zaman periyodunda otomatik java flushlar.
			writer.write("Fatma Kaya, 325\n");
			
		} catch (IOException e) {
			System.out.println("I/O exception aldık");
		}
	}
}
