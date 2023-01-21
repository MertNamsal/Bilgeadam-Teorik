package com.mertnamsal.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.mertnamsal.entity.Ogrenci;
import com.mertnamsal.entity.Personel;
import com.mertnamsal.service.OgrenciService;
import com.mertnamsal.service.PersonelService;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PersonelIslemleri {

	private JFrame frame;
	private JTable table;
	private PersonelService personelService;
	private OgrenciService ogrenciService;
	private JTextField textFieldId;
	private JTable tableOgrenci;
	private JTextField textFieldOgrenciNo;
	private JTextField textFieldAd;
	private JTextField textFieldSoyad;
	private JTextField textFieldCinsiyet;
	private JTextField textFieldSinavNotu1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonelIslemleri window = new PersonelIslemleri();
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
	public PersonelIslemleri() {
		initialize();
		personelService =  new PersonelService();
		ogrenciService = new OgrenciService();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1033, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 211, 446, 212);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Ad", "Soyad"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnTumKayitlariGetir = new JButton("Tüm kayıtları getir");
		btnTumKayitlariGetir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Personel> list = personelService.getAllPersonel();
				tabloyuDoldur(list);
				
			}
		});
		btnTumKayitlariGetir.setBounds(39, 134, 117, 23);
		frame.getContentPane().add(btnTumKayitlariGetir);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(304, 135, 86, 20);
		frame.getContentPane().add(textFieldId);
		textFieldId.setColumns(10);
		
		JButton btnIdSorgula = new JButton("ID Sorgula");
		btnIdSorgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<Personel> list = personelService.getPersonelById(textFieldId.getText());
				
				if(list == null) {
					JOptionPane.showMessageDialog(null, "Lütfen ID'yi tamsayı olarak giriniz");
				}
				else {
					tabloyuDoldur(list);
				}
			}
		});
		btnIdSorgula.setBounds(422, 134, 89, 23);
		frame.getContentPane().add(btnIdSorgula);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(557, 211, 434, 212);
		frame.getContentPane().add(scrollPane_1);
		
		tableOgrenci = new JTable();
		tableOgrenci.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int satir =tableOgrenci.getSelectedRow();

				TableModel model = tableOgrenci.getModel();
				
				textFieldOgrenciNo.setText(model.getValueAt(satir, 0).toString());
				textFieldAd.setText(model.getValueAt(satir, 1).toString());
				textFieldSoyad.setText(model.getValueAt(satir, 2).toString());
				textFieldCinsiyet.setText(model.getValueAt(satir, 3).toString());
				textFieldSinavNotu1.setText(model.getValueAt(satir, 4).toString());
			}
		});
		tableOgrenci.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Ogr.No", "Ad", "Soyad", "Cinsiyet", "1.Sinav Notu"
			}
		));
		scrollPane_1.setViewportView(tableOgrenci);
		
		JButton btnTumOgrencileriGetir = new JButton("Tum Ogrencileri Getir");
		btnTumOgrencileriGetir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<Ogrenci> list = ogrenciService.getAllOgrenci();
				tabloyuDoldurOgrenci(list);
			}
		});
		btnTumOgrencileriGetir.setBounds(586, 134, 151, 23);
		frame.getContentPane().add(btnTumOgrencileriGetir);
		
		textFieldOgrenciNo = new JTextField();
		textFieldOgrenciNo.setBounds(905, 32, 86, 20);
		frame.getContentPane().add(textFieldOgrenciNo);
		textFieldOgrenciNo.setColumns(10);
		
		textFieldAd = new JTextField();
		textFieldAd.setColumns(10);
		textFieldAd.setBounds(905, 75, 86, 20);
		frame.getContentPane().add(textFieldAd);
		
		textFieldSoyad = new JTextField();
		textFieldSoyad.setColumns(10);
		textFieldSoyad.setBounds(905, 117, 86, 20);
		frame.getContentPane().add(textFieldSoyad);
		
		textFieldCinsiyet = new JTextField();
		textFieldCinsiyet.setColumns(10);
		textFieldCinsiyet.setBounds(905, 150, 86, 20);
		frame.getContentPane().add(textFieldCinsiyet);
		
		textFieldSinavNotu1 = new JTextField();
		textFieldSinavNotu1.setColumns(10);
		textFieldSinavNotu1.setBounds(905, 181, 86, 20);
		frame.getContentPane().add(textFieldSinavNotu1);
		
		JLabel lblNewLabel = new JLabel("Ogrenci No :");
		lblNewLabel.setBounds(807, 35, 88, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAd = new JLabel("Ad :");
		lblAd.setBounds(807, 78, 46, 14);
		frame.getContentPane().add(lblAd);
		
		JLabel lblSoyad = new JLabel("Soyad :");
		lblSoyad.setBounds(807, 120, 46, 14);
		frame.getContentPane().add(lblSoyad);
		
		JLabel lblCinsiyet = new JLabel("Cinsiyet :");
		lblCinsiyet.setBounds(807, 153, 46, 14);
		frame.getContentPane().add(lblCinsiyet);
		
		JLabel lblSnavNotu = new JLabel("Sınav Notu 1 :");
		lblSnavNotu.setBounds(807, 186, 73, 14);
		frame.getContentPane().add(lblSnavNotu);
		
		JButton btnSil = new JButton("Sil");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean sonuc = ogrenciService.kayitSil(textFieldOgrenciNo.getText());
				if(!sonuc) {
					JOptionPane.showMessageDialog(null, "Girilen ogrenci no formatı hatalı!");
				}else {
					ArrayList<Ogrenci> list = ogrenciService.getAllOgrenci();
					tabloyuDoldurOgrenci(list);
					ogrenciBilgileriAlaniniTemizle();
				}
			}
		});
		btnSil.setBounds(648, 168, 89, 23);
		frame.getContentPane().add(btnSil);
		
		JButton btnEkle = new JButton("Ekle");
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ogrenci ogrenci = new Ogrenci(Integer.parseInt(textFieldOgrenciNo.getText()) ,textFieldAd.getText(),textFieldSoyad.getText(),textFieldCinsiyet.getText(),Integer.parseInt(textFieldSinavNotu1.getText()));
				ogrenciService.kayitEkle(ogrenci);
				
			}
		});
		btnEkle.setBounds(648, 100, 89, 23);
		frame.getContentPane().add(btnEkle);
	}
	
	private void ogrenciBilgileriAlaniniTemizle() {
		textFieldOgrenciNo.setText("");
		textFieldAd.setText("");
		textFieldSoyad.setText("");
		textFieldCinsiyet.setText("");
		textFieldSinavNotu1.setText("");
	}
	
	public void tabloyuDoldur(ArrayList<Personel>list) {
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0); // tablonun içeriğini temizler
		Object [] columns = new Object [3];
		for (int i = 0; i < list.size(); i++) {
			columns[0]=list.get(i).getId();
			columns[1]=list.get(i).getAd();
			columns[2]=list.get(i).getSoyad();
			model.addRow(columns);
		}
	}
	public void tabloyuDoldurOgrenci(ArrayList<Ogrenci>list) {
		
		DefaultTableModel model = (DefaultTableModel) tableOgrenci.getModel();
		model.setRowCount(0); // tablonun içeriğini temizler
		Object [] columns = new Object [5];
		for (int i = 0; i < list.size(); i++) {
			columns[0]=list.get(i).getOgrencino();
			columns[1]=list.get(i).getAd();
			columns[2]=list.get(i).getSoyad();
			columns[3]=list.get(i).getCinsiyet();
			columns[4]=list.get(i).getSinavnotu1();
			model.addRow(columns);
		}
	}
}
