package com.mertnamsal;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

 

public class MainSwingGui {

 

    private JFrame frame;
    private JTextField textField;
    private JCheckBox cboxSosis;
    private JCheckBox cboxMisir; 
    private JCheckBox cboxRus;
    private JLabel lblNewLabel;
    private JLabel lblTl;
    private JLabel lblTl_1;
    private JComboBox comboSosis = new JComboBox();
    private JComboBox comboRus = new JComboBox();
    JLabel lblToplam = new JLabel("0");
    private JComboBox comboBoxLang;
    private JButton btnUcretHesapla;
    private JLabel lblToplamUcret;
    private JButton btnSecimleriYazdir;
    private JLabel lblSadeKumpir;
    
 

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainSwingGui window = new MainSwingGui();
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
    public MainSwingGui() {
        initialize();
        
        Locale.setDefault(new Locale("tr","TR"));
		i18n();
    }
    
   
 

    private void i18n() {
    	ResourceBundle resourceBundle = ResourceBundle.getBundle("config/resource_bundle");
		cboxSosis.setText(resourceBundle.getString("wordsosis"));
		cboxRus.setText(resourceBundle.getString("wordrus"));
		cboxMisir.setText(resourceBundle.getString("wordmisir"));
		btnUcretHesapla.setText(resourceBundle.getString("wordhesapla"));
		lblToplamUcret.setText(resourceBundle.getString("wordtoplam"));
		btnSecimleriYazdir.setText(resourceBundle.getString("wordsecimleriyazdir"));
		lblSadeKumpir.setText(resourceBundle.getString("wordsecimleriyazdir"));
		
		
	}



	/**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1046, 625);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        cboxSosis = new JCheckBox("Sosis");
        cboxMisir = new JCheckBox("Mısır");

        cboxRus = new JCheckBox("Rus salatası");
        cboxRus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                secimlereGoreTextHazirla();
            }
        });
        cboxRus.setBounds(100, 110, 97, 23);
        frame.getContentPane().add(cboxRus);

        cboxMisir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                secimlereGoreTextHazirla();                
            }
        });
        cboxMisir.setBounds(100, 136, 97, 23);
        frame.getContentPane().add(cboxMisir);


        cboxSosis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                secimlereGoreTextHazirla();                
            }
        });

 

        cboxSosis.setBounds(100, 86, 73, 23);
        frame.getContentPane().add(cboxSosis);


        btnSecimleriYazdir = new JButton("Seçimleri yazdır");
        btnSecimleriYazdir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {                
                secimlereGoreTextHazirla();                
            }
        });
        btnSecimleriYazdir.setBounds(69, 552, 147, 23);
        frame.getContentPane().add(btnSecimleriYazdir);

        textField = new JTextField();
        textField.setBounds(235, 553, 262, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        lblNewLabel = new JLabel("(10 TL)");
        lblNewLabel.setBounds(177, 90, 46, 14);
        frame.getContentPane().add(lblNewLabel);
        
        lblTl = new JLabel("(5 TL)");
        lblTl.setBounds(203, 116, 46, 14);
        frame.getContentPane().add(lblTl);
        
        lblTl_1 = new JLabel("(7 TL)");
        lblTl_1.setBounds(203, 140, 46, 14);
        frame.getContentPane().add(lblTl_1);
        
        
        comboSosis.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
        comboSosis.setBounds(311, 87, 32, 20);
        frame.getContentPane().add(comboSosis);
        
        
        comboRus.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
        comboRus.setBounds(311, 110, 32, 23);
        frame.getContentPane().add(comboRus);
        
        JComboBox comboMisir = new JComboBox();
        comboMisir.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
        comboMisir.setBounds(311, 136, 32, 23);
        frame.getContentPane().add(comboMisir);
        
        lblSadeKumpir = new JLabel("SADE KUMPIR (50 TL)");
        lblSadeKumpir.setBounds(88, 32, 295, 28);
        frame.getContentPane().add(lblSadeKumpir);
        
        btnUcretHesapla = new JButton("Toplam Ücreti Hesapla");
        btnUcretHesapla.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int toplam = 50;
        		if(cboxSosis.isSelected()) {
        			toplam+= Integer.parseInt(comboSosis.getSelectedItem().toString())*10;
        		}
        		if(cboxRus.isSelected()) {
        			toplam+= Integer.parseInt(comboRus.getSelectedItem().toString())*5;
        		}
        		if(cboxMisir.isSelected()) {
        			toplam+= Integer.parseInt(comboMisir.getSelectedItem().toString())*7;
        		}
        		lblToplam.setText(String.valueOf(toplam));
        		
        	}
        });
        btnUcretHesapla.setBounds(84, 213, 165, 28);
        frame.getContentPane().add(btnUcretHesapla);
        
        lblToplamUcret = new JLabel("Toplam Ücret :");
        lblToplamUcret.setBounds(88, 272, 95, 23);
        frame.getContentPane().add(lblToplamUcret);
        
        
        lblToplam.setBounds(223, 276, 46, 14);
        frame.getContentPane().add(lblToplam);
        
        JButton btnNewButton_2 = new JButton("New button");
        btnNewButton_2.setIcon(new ImageIcon(MainSwingGui.class.getResource("/com/mertnamsal/resources/png-transparent-baked-potato-fas.png")));
        btnNewButton_2.setBounds(503, 136, 206, 188);
        frame.getContentPane().add(btnNewButton_2);
        
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
        comboBoxLang.setBounds(88, 342, 161, 22);
        frame.getContentPane().add(comboBoxLang);
    }


    public void secimlereGoreTextHazirla() {
        String secim = "";
        if (cboxSosis.isSelected())
        {
            secim = secim + "Sosis";
        
        }
        if (cboxRus.isSelected())
        {                    
            secim = secim + " Rus salatası";

        }
        if (cboxMisir.isSelected())
        {
            secim = secim + " Mısır";
        }
        textField.setText(secim);
    }
}