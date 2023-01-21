package com.mertnamsal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.commons.codec.digest.DigestUtils;

import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ModalDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldKullaniciAdi;
	private JTextField textFieldSifre;
	private JLabel lblMesaj;


	
	
	
	public boolean verifyUsernamePassword(Connection conn, String username, String password) {

		boolean usernamePasswordCiftiMevcutMu = false;
		System.out.println("trying to connect...");
		String url = "jdbc:postgresql://localhost:5432/dbtest"; // localhost : 127.0.0.1 her bilgisayarda local IP
																// olarak tanımlıdır. WAN -> IP servis sağlayıcı
																// tarafından verilir.
		String kullaniciadi = "postgres";
		String sifre = "21wvtmykx";

		// Select and Control
		String sqlkomut = "select username, password from users where username = '" + username + "' and password = '"
				+ password + "'";
		PreparedStatement prp;

		try {
			prp = conn.prepareCall(sqlkomut);
			ResultSet rs = prp.executeQuery();

			if (rs.next()) {
				usernamePasswordCiftiMevcutMu = true;
				lblMesaj.setText("");
				JOptionPane.showMessageDialog(null, "Merhaba " + username + " sisteme hoşgeldiniz!" );				
			} else {
				//JOptionPane.showMessageDialog(null, "Kullanıcı veya şifre hatalı");
				lblMesaj.setText("Kullanıcı veya şifre hatalı");
				usernamePasswordCiftiMevcutMu = false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usernamePasswordCiftiMevcutMu;
	}
	
	
	public Connection veritabaninaBaglan() {

		//
		// VERİTABANINA BAĞLANMA İŞLEMİ
		//
		System.out.println("trying to connect...");
		String url = "jdbc:postgresql://localhost:5432/dbtest"; // localhost : 127.0.0.1 her bilgisayarda local IP
																// olarak tanımlıdır. WAN -> IP servis sağlayıcı
																// tarafından verilir.
		String kullaniciadi = "postgres";
		String sifre = "21wvtmykx";
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, kullaniciadi, sifre);
			System.out.println("Connection established....");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public void veritabaniBaglantisiniKapat(Connection conn) {	
		if (conn != null) {
			try {
				conn.close();
				System.out.println("VT bağlantısı kapatıldı, hoşçakalın...");
			} catch (SQLException e) { 
				e.printStackTrace();
				System.err.println("VT bağlantısı kapatılırken hata oluştu..");
			}
		}
	}
	
	
	/**
	 * Create the dialog.
	 */
	public ModalDialog(JFrame mainFrame, String title, boolean modal) {
		super(mainFrame, title, modal);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// Kullanıcı - Şifre kontrolü yapacaksınız
					// ...
					Connection conn = veritabaninaBaglan();
					boolean sonuc = verifyUsernamePassword(conn, textFieldKullaniciAdi.getText(), DigestUtils.sha256Hex(textFieldSifre.getText())); 
					
					// Eğer Kulalnıcı adı ve şifre kombinasyonu doğru girildiyse program ana ekran açılsın
					if (sonuc) {
						veritabaniBaglantisiniKapat(conn);
						dispose();						
					}
					else {
						textFieldKullaniciAdi.setText("");
						textFieldSifre.setText("");
					}
										
				}
			});
			btnLogin.setBounds(204, 178, 89, 23);
			contentPanel.add(btnLogin);
		}
		{
			textFieldKullaniciAdi = new JTextField();
			textFieldKullaniciAdi.setBounds(204, 70, 86, 20);
			contentPanel.add(textFieldKullaniciAdi);
			textFieldKullaniciAdi.setColumns(10);
		}
		
		JLabel lblNewLabel = new JLabel("Kullanıcı Adı:");
		lblNewLabel.setBounds(111, 73, 83, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Şifre:");
		lblNewLabel_1.setBounds(111, 110, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		textFieldSifre = new JTextField();
		textFieldSifre.setBounds(204, 107, 86, 20);
		contentPanel.add(textFieldSifre);
		textFieldSifre.setColumns(10);
		{
			lblMesaj = new JLabel("");
			lblMesaj.setBounds(134, 138, 219, 29);
			contentPanel.add(lblMesaj);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//mainFrame.dispose();
						System.exit(ABORT);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
