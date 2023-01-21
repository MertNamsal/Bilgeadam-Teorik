package com.mertnamsal.view;

import java.awt.EventQueue;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Gui_i18N_Örnek {

	private JFrame frame;
	private JButton btnHello;
	private JLabel lblBye;
	private JLabel lblDate;
	private JComboBox comboBox;
	private JButton button;
	private JComboBox comboBoxLang;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_i18N_Örnek window = new Gui_i18N_Örnek();
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
	public Gui_i18N_Örnek() {
		initialize();
		
		Locale.setDefault(new Locale("tr","TR"));
		i18n();
	}

	private void i18n() {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("com/mertnamsal/config/resource_bundle");
		btnHello.setText(resourceBundle.getString("word1"));
		lblBye.setText(resourceBundle.getString("word2"));
		
		//Tarih saat bilgisini label'a ekle
		Date now = new Date();
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG, Locale.getDefault());
		System.out.println(df.format(now));
		lblDate.setText(df.format(now));
		comboBox.removeAllItems();
		comboBox.addItem(resourceBundle.getString("wordilk"));
		comboBox.addItem(resourceBundle.getString("wordyaz"));
		comboBox.addItem(resourceBundle.getString("wordson"));
		comboBox.addItem(resourceBundle.getString("wordkis"));
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 798, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnHello = new JButton("New button");
		btnHello.setBounds(192, 183, 177, 23);
		frame.getContentPane().add(btnHello);
		
		lblBye = new JLabel("New label");
		lblBye.setBounds(422, 187, 131, 14);
		frame.getContentPane().add(lblBye);
		
		lblDate = new JLabel("New label");
		lblDate.setBounds(567, 35, 168, 14);
		frame.getContentPane().add(lblDate);
		
		comboBox = new JComboBox();
		comboBox.setBounds(346, 259, 142, 22);
		frame.getContentPane().add(comboBox);
		
		button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Locale.setDefault(new Locale("en","EN"));
//				i18n();
			}
		});
		button.setBounds(656, 379, 89, 23);
		frame.getContentPane().add(button);
		
		comboBoxLang = new JComboBox();
		comboBoxLang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxLang.getSelectedItem().toString().equalsIgnoreCase("English")) {
					Locale.setDefault(new Locale("en","EN"));
					i18n();
				} else if(comboBoxLang.getSelectedItem().toString().equalsIgnoreCase("French")) {
					Locale.setDefault(new Locale("fr","FR"));
					i18n();
				} else if(comboBoxLang.getSelectedItem().toString().equalsIgnoreCase("Turkish")) {
					Locale.setDefault(new Locale("tr","TR"));
					i18n();
				}
			}
		});
		comboBoxLang.setModel(new DefaultComboBoxModel(new String[] {"Turkish", "English", "French"}));
		comboBoxLang.setBounds(594, 246, 141, 22);
		frame.getContentPane().add(comboBoxLang);
	}
}
