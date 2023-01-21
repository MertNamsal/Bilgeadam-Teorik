package com.mertnamsal;

import java.awt.EventQueue;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;

public class Server {

	private JFrame frmUdpServer;
	private JEditorPane editorPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server window = new Server();
					window.frmUdpServer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Server() {
		initialize();
		
		// THREAd OLUŞTURALIM - TOPLAMA SERVİS THREADİ
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread çalışıyor");
				runServer();				
			}
		}); 
		
		// THREAd OLUŞTURALIM - CARPMA SERVİS THREADİ
				Thread thread2 = new Thread(new Runnable() {
					
					@Override
					public void run() {
						System.out.println("Thread çalışıyor");
						runServer2();				
					}
				}); 
		
		thread1.start();
		thread2.start();
	}

	

	protected void runServer() {
		try {
			DatagramSocket socket = new DatagramSocket(5000);
			
			while(true) {
				byte[] buffer = new byte[50];
				DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
				socket.receive(packet);
				String receivedText = new String(buffer, 0, packet.getLength()); 
				System.out.println("Text received is : " + receivedText);
				editorPane.setText(editorPane.getText() + "\n" + receivedText);
				
				//Toplama
				String[] sayilar = receivedText.split("\\+");
				int toplam = 0;
				
				for(int i=0;i<sayilar.length;i++) {
					toplam += Integer.parseInt(sayilar[i].trim());
				}
				String returnString = receivedText+ " = "+String.valueOf(toplam);
				
				// Echo yapalım.. (Yani echo mesajımızı karşı taarfa gönderelim)
				//String returnString = "echo: " + receivedText;
				byte[] buffer2 = returnString.getBytes();
				InetAddress address = packet.getAddress();
				int port = packet.getPort();
				packet = new DatagramPacket(buffer2, buffer2.length, address, port);
				socket.send(packet);
				
				System.out.println("packet port: " + port + "  address: " + address);
				//System.out.println("Localport: " + socket.getLocalPort() + " Port: " + socket.getPort() + "\n");
			}
					
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	protected void runServer2() {
		try {
			DatagramSocket socket = new DatagramSocket(5001);
			
			while(true) {
				byte[] buffer = new byte[50];
				DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
				socket.receive(packet);
				String receivedText = new String(buffer, 0, packet.getLength()); 
				System.out.println("Text received is : " + receivedText);
				editorPane.setText(editorPane.getText() + "\n" + receivedText);
				
				//Carpma
				String[] sayilar = receivedText.split("\\*");
				int carpim = 1;
				
				for(int i=0;i<sayilar.length;i++) {
					carpim *= Integer.parseInt(sayilar[i].trim());
				}
				String returnString = receivedText+ " = "+String.valueOf(carpim);
				
				// Echo yapalım.. (Yani echo mesajımızı karşı taarfa gönderelim)
				//String returnString = "echo: " + receivedText;
				byte[] buffer2 = returnString.getBytes();
				InetAddress address = packet.getAddress();
				int port = packet.getPort();
				packet = new DatagramPacket(buffer2, buffer2.length, address, port);
				socket.send(packet);
				
				System.out.println("packet port: " + port + "  address: " + address);
				//System.out.println("Localport: " + socket.getLocalPort() + " Port: " + socket.getPort() + "\n");
			}
					
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUdpServer = new JFrame();
		frmUdpServer.setTitle("UDP Server");
		frmUdpServer.setBounds(100, 100, 733, 488);
		frmUdpServer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUdpServer.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(153, 158, 440, 194);
		frmUdpServer.getContentPane().add(scrollPane);
		
		editorPane = new JEditorPane();
		scrollPane.setViewportView(editorPane);
		
	}

}