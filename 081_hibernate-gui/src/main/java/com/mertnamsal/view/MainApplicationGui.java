package com.mertnamsal.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.mertnamsal.entity.Student;
import com.mertnamsal.service.StudentService;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainApplicationGui {

	private JFrame frame;
	private JTable table;
	private StudentService studentService;
	private JTextField textFieldId;
	private JTextField textFieldEmail;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApplicationGui window = new MainApplicationGui();
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
	public MainApplicationGui() {
		initialize();
		
		studentService = new StudentService();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 948, 561);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(123, 185, 745, 287);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int satir = table.getSelectedRow(); 
				//System.out.println("Tabloya tıklandı, " + satir + ". satır seçildi...");				
				TableModel model = table.getModel();								
				textFieldId.setText(model.getValueAt(satir, 0).toString());
				textFieldEmail.setText(model.getValueAt(satir, 1).toString());
				textFieldFirstName.setText(model.getValueAt(satir, 2).toString());			
				textFieldLastName.setText(model.getValueAt(satir, 3).toString());
				
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "email", "First name", "Last name"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnGetAll = new JButton("Get All");
		btnGetAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<Student> list = studentService.getAll();				
				tabloyuDoldur(list);
				
			}
		});
		btnGetAll.setBounds(766, 85, 102, 23);
		frame.getContentPane().add(btnGetAll);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(258, 51, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("email:");
		lblNewLabel_1.setBounds(259, 89, 74, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("First name:");
		lblNewLabel_2.setBounds(259, 115, 74, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Last name:");
		lblNewLabel_3.setBounds(259, 151, 74, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student student = new Student(textFieldFirstName.getText(), textFieldLastName.getText(), textFieldEmail.getText());
				studentService.save(student);
				List<Student> list = studentService.getAll();	
				tabloyuDoldur(list);
			}
		});
		btnSave.setBounds(622, 85, 89, 23);
		frame.getContentPane().add(btnSave);
		
		textFieldId = new JTextField();
		textFieldId.setEditable(false);
		textFieldId.setBounds(332, 48, 102, 20);
		frame.getContentPane().add(textFieldId);
		textFieldId.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(332, 86, 102, 20);
		frame.getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setBounds(332, 112, 102, 20);
		frame.getContentPane().add(textFieldFirstName);
		textFieldFirstName.setColumns(10);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setBounds(332, 148, 102, 20);
		frame.getContentPane().add(textFieldLastName);
		textFieldLastName.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentService.update(textFieldId.getText(), textFieldEmail.getText(), textFieldFirstName.getText(), textFieldLastName.getText());
				List<Student> list = studentService.getAll();	
				tabloyuDoldur(list);
			}
		});
		btnUpdate.setBounds(622, 131, 89, 23);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentService.delete(textFieldId.getText());
				List<Student> list = studentService.getAll();	
				tabloyuDoldur(list);
				textFieldlariBosalt();
			}

			
		});
		btnDelete.setBounds(767, 131, 101, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnNewButton = new JButton("Sorgula");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<Student> list = studentService.getByName(textFieldFirstName.getText());				
				tabloyuDoldur(list);
				
			}
		});
		btnNewButton.setBounds(444, 111, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
	
	
	public void tabloyuDoldur(List<Student> list) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0); // Tablonun içeriğini temizler.
		Object[] columns = new Object[4];
		for (int i=0;i<list.size();i++) {
			columns[0] = list.get(i).getId();
			columns[1] = list.get(i).getEmail();
			columns[2] = list.get(i).getFirstName();
			columns[3] = list.get(i).getLastName();
			model.addRow(columns);
		}		
	}
	
	private void textFieldlariBosalt() {
		textFieldId.setText("");
		textFieldEmail.setText("");
		textFieldFirstName.setText("");
		textFieldLastName.setText("");
		
	}
	
}