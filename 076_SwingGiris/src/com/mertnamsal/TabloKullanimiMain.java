package com.mertnamsal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TabloKullanimiMain {

	private JFrame frmBenimIlkUygulamam;
	private JTable table;
	private JTextField textFieldAd;
	private JTextField textFieldSoyad;
	private JTextField textFieldId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabloKullanimiMain window = new TabloKullanimiMain();
					window.frmBenimIlkUygulamam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TabloKullanimiMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frmBenimIlkUygulamam = new JFrame();
		frmBenimIlkUygulamam.setTitle("Benim ilk uygulamam");
		frmBenimIlkUygulamam.setBounds(100, 100, 922, 565);
		frmBenimIlkUygulamam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBenimIlkUygulamam.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(126, 195, 688, 274);
		frmBenimIlkUygulamam.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int satir =table.getSelectedRow();
				System.out.println(satir +" satir secildi");

				TableModel model = table.getModel();
				
				textFieldId.setText(model.getValueAt(satir, 0).toString());
				textFieldAd.setText(model.getValueAt(satir, 1).toString());
				textFieldSoyad.setText(model.getValueAt(satir, 2).toString());
				
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Ad", "Soyad"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("ArrayList'den bilgi çek");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Bir array list oluşturup içine user nesneleri ekleyeceğim
				//Daha sonra bu arraylistin içeriğini table'a yerleştireceğim.
				ArrayList<User> list = new ArrayList<>();
				User user1 = new User(1,"John","Nash");
				User user2 = new User(2,"Smith","Watson");
				User user3 = new User(3,"Alfred","Rock");
				list.add(user1);
				list.add(user2);
				list.add(user3);
				
				//Table a bu arraylisti insert edeceğim
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				Object[] columns = new Object[3];
				for (int i = 0; i < list.size(); i++) {
					columns[0]= list.get(i).getId();
					columns[1]= list.get(i).getAd();
					columns[2]= list.get(i).getSoyad();
					model.addRow(columns);
				}
				
			}
		});
		btnNewButton.setBounds(51, 492, 140, 23);
		frmBenimIlkUygulamam.getContentPane().add(btnNewButton);
		
		textFieldAd = new JTextField();
		textFieldAd.setBounds(109, 117, 86, 20);
		frmBenimIlkUygulamam.getContentPane().add(textFieldAd);
		textFieldAd.setColumns(10);
		
		textFieldSoyad = new JTextField();
		textFieldSoyad.setColumns(10);
		textFieldSoyad.setBounds(109, 148, 86, 20);
		frmBenimIlkUygulamam.getContentPane().add(textFieldSoyad);
		
		textFieldId = new JTextField();
		textFieldId.setColumns(10);
		textFieldId.setBounds(109, 86, 86, 20);
		frmBenimIlkUygulamam.getContentPane().add(textFieldId);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(53, 89, 46, 14);
		frmBenimIlkUygulamam.getContentPane().add(lblNewLabel);
		
		JLabel lblAd = new JLabel("Ad");
		lblAd.setBounds(51, 120, 46, 14);
		frmBenimIlkUygulamam.getContentPane().add(lblAd);
		
		JLabel lblSoyad = new JLabel("Soyad");
		lblSoyad.setBounds(51, 151, 46, 14);
		frmBenimIlkUygulamam.getContentPane().add(lblSoyad);
		
		JButton btnEkle = new JButton("Kayit Ekle");
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				Object[] columns = new Object[3];
				
					columns[0]= textFieldId.getText();
					columns[1]= textFieldAd.getText();
					columns[2]= textFieldSoyad.getText();
					model.addRow(columns);
				
			}
		});
		btnEkle.setBounds(227, 116, 89, 23);
		frmBenimIlkUygulamam.getContentPane().add(btnEkle);
		
		JButton btnSil = new JButton("Kayit Sil");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel(); //normal table model le silme yapılmaz
				if(table.getSelectedRow() != -1) {
					//remove selected row
					model.removeRow(table.getSelectedRow());
					textFieldId.setText("");
					textFieldAd.setText("");
					textFieldSoyad.setText("");
					JOptionPane.showMessageDialog(null, "Selected row deleted successfully!"); // Küçük mesaj penceresi oluşturur
				}
			}
		});
		btnSil.setBounds(341, 116, 89, 23);
		frmBenimIlkUygulamam.getContentPane().add(btnSil);
	}
}
