package com.mertnamsal;

import java.io.IOException;
import java.net.ServerSocket;

public class MainMultiThreadedServer {
	
	public static int counter = 1;
	
	public static void main(String[] args) {
		System.out.println("Server yazılımı başladı...");
		
		try(ServerSocket serverSocket = new ServerSocket(5000)){
			
			while(true) {
				new Echoer(serverSocket.accept(),counter++).start();
			}
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
