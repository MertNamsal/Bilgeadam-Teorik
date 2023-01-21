package com.mertnamsal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//Echo Server yazılımı yazalım
public class MainServer {

	//Connection'ı ayrı yapan özellikler
	//1-Host IP  kendi serverımızın IP si
	//2-Local Port   5000 verdiğimiz
	//3-Remote IP     Başka pc den bağlarnırsak ip farklı olabilir local host oldugu için aynı
	//4-Remote Port    4 tane ayrı client oluşturduğumuzu düşün bunrın ayrı ayrı portları oluyor ( hepsi 5000 e gider ama kendi portları farklı)
	public static void main(String[] args) {
		
		System.out.println("Server yazılımı başladı..");
		try(ServerSocket serverSocket = new ServerSocket(5000)){
			Socket socket =serverSocket.accept();  //Burada serversocket bağlantı ekler. Bağlantı kurulduğunda yeni bir socket( iletişim)
													// oluşturulup yeni oluşturulan socket  üzerinden haberleşilir.
													//
													//Yani serverSocket.accept() bağlantı kurulana kadar bekler, client ile bağlantı
													//kurulunca bir haberleşme socketi oluşturur ve return eder.
													//Biz bu yeni oluşturulan socket üzerinden veri gönderir ve alırız.
			System.out.println("Client connected...");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
			
			
			while(true) {
				String echoString = reader.readLine();
				if(echoString.equalsIgnoreCase("exit")) {
					System.out.println("Server exit..");
					break;
				}
				writer.println("Echo from server: "+echoString);
				
			}
		} catch(Exception e){
			System.out.println("Server exception : "+e.getMessage());
		}
	}
}
