package com.mertnamsal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoer extends Thread {

	private Socket socket;
	private int threadID;
	
	public Echoer(Socket socket,int id) {
		this.socket=socket;
		this.threadID=id;
	}
	
	@Override
	public void run() {
		System.out.println("Server bir client'e bağlandı ve haberleşime başladı...");
		
		try {
			PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String echoString = reader.readLine();
				if(echoString.equalsIgnoreCase("exit")) {
					System.out.println("Server-thread exit..");
					break;
				}
				System.out.println("Thread ID: "+this.threadID+" "+echoString);
				writer.println("Echo from server: "+echoString);		
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(socket!=null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
