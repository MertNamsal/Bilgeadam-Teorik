package com.mertnamsal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MainClient {

	public static void main(String[] args) {
		
		try(Socket socket = new Socket("localhost",5000)){
			
			//socket üzerinden okuma ve yazma yapabilmek için bir reader ve 1 writer nesnesi oluşturuyoruz
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
			
			Scanner scan = new Scanner(System.in);
			String echoString;
			String response;
			
			do {
				System.out.println("Lütfen gönderilecek metni yazınız :");
				echoString = scan.nextLine();
				writer.println(echoString);
				if(!echoString.equalsIgnoreCase("exit")) {
					response = reader.readLine();
					System.out.println(response);
				}
				
			} while (!echoString.equalsIgnoreCase("exit"));
				
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
