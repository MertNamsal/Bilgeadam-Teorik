package com.mertnamsal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DatabaseApplication {

	private JFrame frame;
	private JTable table;
	private JTextField textFieldID;
	private JTextField textFieldAd;
	private JTextField textFieldSoyad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatabaseApplication window = new DatabaseApplication();
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
	public DatabaseApplication() {
		initialize();
		veritabanindanBilgileriCekVeGoster();
		
		ModalDialog md = new ModalDialog(frame,"Modal Pencere",true);
		md.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1074, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(100, 224, 608, 266);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int satir =table.getSelectedRow();

				TableModel model = table.getModel();
				
				textFieldID.setText(model.getValueAt(satir, 0).toString());
				textFieldAd.setText(model.getValueAt(satir, 1).toString());
				textFieldSoyad.setText(model.getValueAt(satir, 2).toString());
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Ad", "Soyad"
			}
		));
		scrollPane.setViewportView(table);
		
		
		JButton btnVtBilgiCek = new JButton("VT Bilgilerini Getir");
		btnVtBilgiCek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				veritabanindanBilgileriCekVeGoster();

				
			}
		});
		btnVtBilgiCek.setBounds(532, 181, 150, 23);
		frame.getContentPane().add(btnVtBilgiCek);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(692, 44, 86, 20);
		frame.getContentPane().add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldAd = new JTextField();
		textFieldAd.setColumns(10);
		textFieldAd.setBounds(692, 87, 86, 20);
		frame.getContentPane().add(textFieldAd);
		
		textFieldSoyad = new JTextField();
		textFieldSoyad.setColumns(10);
		textFieldSoyad.setBounds(692, 131, 86, 20);
		frame.getContentPane().add(textFieldSoyad);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(588, 47, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAd = new JLabel("Ad:");
		lblAd.setBounds(588, 90, 46, 14);
		frame.getContentPane().add(lblAd);
		
		JLabel lblSoyad = new JLabel("Soyad:");
		lblSoyad.setBounds(588, 134, 46, 14);
		frame.getContentPane().add(lblSoyad);
		
		JButton btnKayitSil = new JButton("Kayıt Sil");
		btnKayitSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = veriTabaninaBaglan();
				delete(conn);
				veritabanindanBilgileriCekVeGoster();
			}
		});
		btnKayitSil.setBounds(692, 181, 89, 23);
		frame.getContentPane().add(btnKayitSil);
		
		JButton btnEkle = new JButton("Kayıt Ekle");
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = veriTabaninaBaglan();
				insert(conn);
				veritabanindanBilgileriCekVeGoster();
				
			}
		});
		btnEkle.setBounds(801, 181, 89, 23);
		frame.getContentPane().add(btnEkle);
		
		JButton btnGuncelle = new JButton("Kayıt Güncelle");
		btnGuncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = veriTabaninaBaglan();

				update(conn);
				veritabanindanBilgileriCekVeGoster();
			}
		});
		btnGuncelle.setBounds(905, 181, 89, 23);
		frame.getContentPane().add(btnGuncelle);
		
		JButton btnSorgula = new JButton("ID Sorgula");
		btnSorgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idSorgula();
			}
		});
		btnSorgula.setBounds(852, 43, 109, 23);
		frame.getContentPane().add(btnSorgula);
		
		JButton btnAdSorgula = new JButton("Ad Sorgula");
		btnAdSorgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adSorgula();
			}
		});
		btnAdSorgula.setBounds(852, 77, 109, 23);
		frame.getContentPane().add(btnAdSorgula);
		
		
		
		JButton btnNewButton = new JButton("Yeni Pencere Ac");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EkPencere frame = new EkPencere();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(854, 448, 140, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modal Pencere Aç");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModalDialog md = new ModalDialog(frame,"Modal Pencere",true);
				md.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(852, 482, 142, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnSoyadSorgula = new JButton("Soyad Sorgula");
		btnSoyadSorgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soyadSorgula();
			}
		});
		btnSoyadSorgula.setBounds(852, 111, 109, 23);
		frame.getContentPane().add(btnSoyadSorgula);
		
	}
	
	public void idSorgula() {
		
		String sqlKomut = "select * from persons where id = " + textFieldID.getText();
		sorgulamaYapTabloyuGuncelle(sqlKomut);	
	}
	
	
	public void soyadSorgula() {

		String sqlKomut = "select * from persons where soyad ilike '" + textFieldSoyad.getText() + "%'";
		sorgulamaYapTabloyuGuncelle(sqlKomut);			
	}
	
	
	public void adSorgula() {
		
		String sqlKomut = "select * from persons where ad ilike '" + textFieldAd.getText() + "%'";
		sorgulamaYapTabloyuGuncelle(sqlKomut);		
	}
	
	public void veritabanindanBilgileriCekVeGoster() {
		ArrayList<User> list = veriTabanindanVeriCek();
		
		
		//Table a bu arraylisti insert edeceğim
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		//Her bilgileri getir butonuna tıklandığında tablonun içeriği temizlenir
		model.setRowCount(0); //TABLO İÇERİĞİNİ SIFIRLAR
		
		Object[] columns = new Object[3];
		for (int i = 0; i < list.size(); i++) {
			columns[0]= list.get(i).getId();
			columns[1]= list.get(i).getAd();
			columns[2]= list.get(i).getSoyad();
			model.addRow(columns);
		}
	}
	
	public void sorgulamaYapTabloyuGuncelle(String sqlKomut) {
		
		ArrayList<User> list = veriTabanindanVeriCek(sqlKomut);
		
		// Table'a bu arrayllisti insert edeceğim..
		DefaultTableModel model = (DefaultTableModel) table.getModel();		
		
		// Her bilgileri getir butonuna tıklandığında Tablonun içeriği temizlenir
		model.setRowCount(0);    // TABLO İÇERİĞİNİ SIFIRLAR				
		
		Object[] columns = new Object[3];
		for (int i=0;i<list.size();i++) {
			columns[0] = list.get(i).getId();
			columns[1] = list.get(i).getAd();
			columns[2] = list.get(i).getSoyad();
			model.addRow(columns);
		}
	}
	
	

	
	public void veritabanindanBilgileriCekveGoster() {
		ArrayList<User> list = veriTabanindanVeriCek();
		
		// Table'a bu arrayllisti insert edeceğim..
		DefaultTableModel model = (DefaultTableModel) table.getModel();		
		
		// Her bilgileri getir butonuna tıklandığında Tablonun içeriği temizlenir
		model.setRowCount(0);    // TABLO İÇERİĞİNİ SIFIRLAR				
		
		Object[] columns = new Object[3];
		for (int i=0;i<list.size();i++) {
			columns[0] = list.get(i).getId();
			columns[1] = list.get(i).getAd();
			columns[2] = list.get(i).getSoyad();
			model.addRow(columns);
		}
	}
	
	public static ArrayList<User> veriTabanindanVeriCek(){
		ArrayList<User> list = new ArrayList<>();
		Connection conn = veriTabaninaBaglan();
		
		//Verileri VT'den çek ve arrayliste doldur
		String sqlKomut = "select * from persons";
		PreparedStatement prp;
		
		try {
			prp = conn.prepareCall(sqlKomut);
			ResultSet rs = prp.executeQuery();
			while(rs.next()) {
				User u = new User(rs.getInt("id"),rs.getString("ad"),rs.getString("soyad"));
				list.add(u);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return list;
	}
	
public static ArrayList<User> veriTabanindanVeriCek(String id) {
		
		ArrayList<User> list = new ArrayList<>();
		Connection conn = veriTabaninaBaglan();
		
		// Verileri VT'den cek ve arrayliste doldur..
		String sqlKomut = "select * from persons where id = " + id;
		PreparedStatement prp;
				
		try {
			prp = conn.prepareCall(sqlKomut);
			ResultSet rs = prp.executeQuery();
			
			while (rs.next())
			{
				User u = new User(rs.getInt("id"), rs.getString("ad"), rs.getString("soyad"));
				list.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}		
		
		return list;
	}
	
	
	
	private void update(Connection conn) {
		
		String sql = "update persons set ad='"+textFieldAd.getText()+"', soyad= '"+textFieldSoyad.getText()+"' where id ="+textFieldID.getText();
		
		int sonuc =0;
		
		try {
			PreparedStatement prp= conn.prepareCall(sql);
			sonuc =prp.executeUpdate();
			
			if(sonuc == 0 ) {
				JOptionPane.showMessageDialog(null,textFieldID.getText()+" numaralı personel mevcut değil!");
				textFieldID.setText("");
				textFieldAd.setText("");
				textFieldSoyad.setText("");
			}else {
				JOptionPane.showMessageDialog(null,textFieldID.getText()+" numaralı personel Güncellendi");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	private void delete(Connection conn) {
		String sql = "delete from persons where id ="+textFieldID.getText();
		
		try {
			PreparedStatement prp= conn.prepareCall(sql);
			prp.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	private void insert(Connection conn) {
		String sql = "insert into persons values("+textFieldID.getText()+",'"+textFieldAd.getText()+"','"+textFieldSoyad.getText()+"')";
		
		try {
			PreparedStatement prp =conn.prepareStatement(sql);
			prp.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection veriTabaninaBaglan() {
		System.out.println("trying to connect...");
		String adres = "jdbc:postgresql://localhost:5432/dbtest"; // localhost : 127.0.0.1 her bilgisayarda local IP olarak tanımlıdır. WAN -> IP servis saglayıcı tarafından verilen
		String kullaniciadi = "postgres";
		String sifre = "21wvtmykx";

		Connection conn = null;

		try {
			conn = DriverManager.getConnection(adres, kullaniciadi, sifre);

			System.out.println("Connection established...");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		return conn;
	}
}
