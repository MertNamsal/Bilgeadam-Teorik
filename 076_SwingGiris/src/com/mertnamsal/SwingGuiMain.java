package com.mertnamsal;

import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

public class SwingGuiMain {

	private JFrame frame;
	private JTextField textFieldAd;
	private JTextField textFieldSoyad;
	private JButton btnAdSoyadOlustur;
	private JTextField textFieldAdSoyad;
	private JTextField textFieldOgrenciNo;
	private JTextField textFieldSayi1;
	private JTextField textFieldSayi2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnSayilariCarp;
	private JTextField textFieldCarpim;
	private JTextField textFieldMevsim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingGuiMain window = new SwingGuiMain();
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
	public SwingGuiMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 912, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldAd = new JTextField();
		textFieldAd.setBounds(98, 104, 161, 20);
		frame.getContentPane().add(textFieldAd);
		textFieldAd.setColumns(10);
		
		textFieldSoyad = new JTextField();
		textFieldSoyad.setBounds(98, 154, 161, 20);
		frame.getContentPane().add(textFieldSoyad);
		textFieldSoyad.setColumns(10);
		
		btnAdSoyadOlustur = new JButton("Metni Birleştir");
		btnAdSoyadOlustur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String adSoyad =textFieldOgrenciNo.getText()+" "+ textFieldAd.getText()+" "+textFieldSoyad.getText();
				textFieldAdSoyad.setText(adSoyad);
			}
		});
		btnAdSoyadOlustur.setBounds(45, 197, 169, 23);
		frame.getContentPane().add(btnAdSoyadOlustur);
		
		textFieldAdSoyad = new JTextField();
		textFieldAdSoyad.setBounds(242, 198, 210, 20);
		frame.getContentPane().add(textFieldAdSoyad);
		textFieldAdSoyad.setColumns(10);
		
		textFieldOgrenciNo = new JTextField();
		textFieldOgrenciNo.setBounds(98, 58, 86, 20);
		frame.getContentPane().add(textFieldOgrenciNo);
		textFieldOgrenciNo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Öğrenci No:");
		lblNewLabel.setBounds(22, 61, 84, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ad :");
		lblNewLabel_1.setBounds(22, 107, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Soyad");
		lblNewLabel_2.setBounds(22, 157, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textFieldSayi1 = new JTextField();
		textFieldSayi1.setBounds(570, 11, 86, 20);
		frame.getContentPane().add(textFieldSayi1);
		textFieldSayi1.setColumns(10);
		
		textFieldSayi2 = new JTextField();
		textFieldSayi2.setBounds(570, 58, 86, 20);
		frame.getContentPane().add(textFieldSayi2);
		textFieldSayi2.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Sayı1");
		lblNewLabel_3.setBounds(514, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Sayı2");
		lblNewLabel_4.setBounds(514, 50, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		btnSayilariCarp = new JButton("Çarp");
		btnSayilariCarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textFieldSayi1.getText());
				int b = Integer.parseInt(textFieldSayi2.getText());
				int txtcarpim = a*b;
				textFieldCarpim.setText(String.valueOf(txtcarpim));
			}
		});
		btnSayilariCarp.setBounds(474, 103, 89, 23);
		frame.getContentPane().add(btnSayilariCarp);
		
		textFieldCarpim = new JTextField();
		textFieldCarpim.setBounds(570, 104, 86, 20);
		frame.getContentPane().add(textFieldCarpim);
		textFieldCarpim.setColumns(10);
		
		JComboBox comboBoxMevsim = new JComboBox();
		comboBoxMevsim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldMevsim.setText(comboBoxMevsim.getSelectedItem().toString());
			}
		});
		comboBoxMevsim.setModel(new DefaultComboBoxModel(new String[] {"İlkbahar", "Yaz", "Sonbahar", "Kış"}));
		comboBoxMevsim.setBounds(98, 329, 161, 31);
		frame.getContentPane().add(comboBoxMevsim);
		
		JLabel lblNewLabel_5 = new JLabel("Mevsim :");
		lblNewLabel_5.setBounds(22, 329, 86, 31);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblMevsim = new JLabel("ilkbahar");
		lblMevsim.setBounds(306, 379, 59, 14);
		frame.getContentPane().add(lblMevsim);
		
		JButton btnSec = new JButton("Seç");
		btnSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSec.setBounds(287, 333, 89, 23);
		frame.getContentPane().add(btnSec);
		
		JLabel lblNewLabel_6 = new JLabel("Seçiminiz :");
		lblNewLabel_6.setBounds(210, 379, 86, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textFieldMevsim = new JTextField();
		textFieldMevsim.setBounds(422, 373, 86, 20);
		frame.getContentPane().add(textFieldMevsim);
		textFieldMevsim.setColumns(10);
		
		textFieldMevsim.setText(comboBoxMevsim.getSelectedItem().toString());
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(679, 107, 161, 121);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Merhaba");
			}
		});
		btnNewButton.setBounds(527, 245, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(648, 239, 190, 92);
		frame.getContentPane().add(scrollPane);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				textArea.setText(String.valueOf(slider.getValue()));
			}
		});
		slider.setMaximum(1000);
		slider.setBounds(671, 390, 169, 15);
		frame.getContentPane().add(slider);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(652, 239, 188, 90);
		frame.getContentPane().add(editorPane);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(String.valueOf(slider.getValue()));
			}
		});
		btnNewButton_1.setBounds(543, 372, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblIcon = new JLabel("New label");
		lblIcon.setBounds(332, 31, 72, 33);
		frame.getContentPane().add(lblIcon);
		ImageIcon imageIcon = new ImageIcon();
		lblIcon.setIcon(imageIcon);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Testttt");
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(SwingGuiMain.class.getResource("/com/mertnamsal/resources/MicrosoftTeams-image (2).png")));
		btnNewButton_2.setBounds(537, 279, 46, 41);
		frame.getContentPane().add(btnNewButton_2);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(55, 231, 401, 84);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Müşteri Kayıt", null, panel, null);
		panel.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3.setBounds(29, 22, 89, 23);
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Sipariş Kayıt", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Sipariş ekle");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_4.setBounds(238, 11, 89, 23);
		panel_1.add(btnNewButton_4);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(39, 15, 126, 30);
		panel_1.add(textArea_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Adres Kayıt", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Kampanya Kayıt", null, panel_3, null);
		panel_3.setLayout(null);
		
	}
}
