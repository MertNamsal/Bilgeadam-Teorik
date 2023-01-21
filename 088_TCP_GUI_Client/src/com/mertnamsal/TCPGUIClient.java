package com.mertnamsal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class TCPGUIClient {

	private JFrame frame;
	private JTextField textField;
	private JEditorPane editorPane;
	private Socket socket;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TCPGUIClient window = new TCPGUIClient();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TCPGUIClient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 787, 517);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(204, 201, 213, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Send");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesajGonder(textField.getText());
				
			}
		});
		btnNewButton.setBounds(491, 206, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(204, 314, 334, 121);
		frame.getContentPane().add(scrollPane);

		editorPane = new JEditorPane();
		scrollPane.setViewportView(editorPane);
		
		JButton btnConnectServer = new JButton("Connect to Server");
		btnConnectServer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					socket = new Socket("localhost",5000);
					
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnConnectServer.setBounds(454, 38, 126, 23);
		frame.getContentPane().add(btnConnectServer);
		
		JButton btnCloseConnection = new JButton("Close Connection");
		btnCloseConnection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					mesajGonder("exit");
					socket.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnCloseConnection.setBounds(607, 38, 126, 23);
		frame.getContentPane().add(btnCloseConnection);
	}

	protected void mesajGonder(String mesaj) {
		try {
			PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String response;
			writer.println(mesaj);
			
			if(!mesaj.equalsIgnoreCase("exit")) {
				response = reader.readLine();
				editorPane.setText(editorPane.getText()+"\n"+response);
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
