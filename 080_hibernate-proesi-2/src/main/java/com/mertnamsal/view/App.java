package com.mertnamsal.view;

import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

import com.mertnamsal.entity.Dolap;
import com.mertnamsal.entity.Lab;
import com.mertnamsal.entity.Okul;
import com.mertnamsal.entity.Sinif;
import com.mertnamsal.entity.Student;
import com.mertnamsal.repository.OkulDao;
import com.mertnamsal.repository.SinifDao;
import com.mertnamsal.repository.StudentDao;

public class App {

	private static StudentDao studentDao;
	private static SinifDao sinifDao;
	private static OkulDao okulDao;
	
	
	public App() {
		studentDao = new StudentDao();
		sinifDao = new SinifDao();
		okulDao = new OkulDao();
	}


	public void save() {
		Student student = new Student("Zeynep", "Çelik", "zeynepcelik@gmail.com");
		try {
			studentDao.save(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		Student student =  new Student(3, "Aslı", "Çelik", "aslicelik@gmail.com");
		
		try {
			studentDao.update(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void getAll() {
		List<Student> list = null;
		
		try {
			list = studentDao.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Student std : list) {
			System.out.println(std);
		}
		
	}
	
	
	public void getById() {
		Student std = null;
		try {
			std = studentDao.getById(1);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		if (std == null) {
			System.out.println("Kayıt bulunamadı!");
		}
		else
			System.out.println("\n" + std);
	}
	
	
	public void deleteById() {
		try {
			studentDao.deleteById(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void nativeSQLQueryOrnek1() {
		List<Student> list = studentDao.nativeSQLQueryOrnek1();
		for (Student s : list) {
			System.out.println(s);
		}
	}
	
	
	public void nativeSQLQueryOrnek2() {
		studentDao.nativeSQLQueryOrnek2();		
	}

	public void nativeSQLQueryOrnek4() {
		studentDao.nativeSQLQueryOrnek4();		
	}
	
	
	public void namedQueryFindAllStudents() {
		studentDao.namedQueryFindAllStudents();
	}
	
	public void namedQueryFindById() {
		studentDao.namedQueryFindById();
	}
	
	
	public void sinifLabOrnek() {
		Lab lab = new Lab(2, "B Binası 1.kat no:20");
		Sinif sinif = new Sinif(lab, "B binası Zemin kat no:12");
		try {			
			sinifDao.save(sinif);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void sinifLabOrnek2() {
		
		// Soru:
		// 2. bir sınıf oluşturalım ve bu sınıfın labı 2 no'lu lab olsun
		
		Lab lab = new Lab(3, "B Binası 1.kat no:20");
		Sinif sinif = new Sinif(lab, "A binası Zemin kat no:5");
		try {
			sinifDao.save(sinif);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void sinifLabOrnek3() {
		// Soru:
		// 3. bir sınıf oluşturun, ynei bir labı olsun.
		Lab lab = new Lab(4, "B Binası 1.kat no:15");
		Sinif sinif = new Sinif(lab, "C binası Zemin kat no:12");
		try {
			sinifDao.save(sinif);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
	
		App app = new App();
//		app.sinifLabOrnek3();

		Lab lab = new Lab(1, "B Binası 1.kat no:15");
		Dolap dolap1 = new Dolap("A01");
		Dolap dolap2 = new Dolap("A02");
		Dolap dolap3 = new Dolap("A03");
		Okul okul = new Okul("Yahya Kemal Lisesi");
		Sinif sinif = new Sinif("B Binası Zemin kat no:1", Arrays.asList(dolap1, dolap2, dolap3), lab, okul);
		
		
		
		Lab lab2 = new Lab(2, "C Binası 2.kat no:14");
		Dolap dolap4 = new Dolap("B01");
		Dolap dolap5 = new Dolap("B02");
		Sinif sinif2 = new Sinif("C Binası Zemin kat no:5", Arrays.asList(dolap4, dolap5), lab2, okul);
		
		
		try {
			sinifDao.save(sinif);
			sinifDao.save(sinif2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// Okul üzerinden erişme
		List<Okul> okulList = okulDao.getAll();
		
		for (Okul o : okulList) {
			System.out.println(o.getOkulAdi());
			for (Sinif s : o.getSiniflar()) {
				System.out.println(s.getSinifId() + "  "  + s.getLokasyon());
			}
		}
		
		System.out.println("\n\n * * * * * * * * * *\n\n");
		
		// Sınıf üzerinden erişme
		List<Sinif> sinifList = sinifDao.getAll();
		
		for (Sinif s : sinifList) {
			System.out.println(s.getSinifId() + "  " + s.getLokasyon());
			for (Dolap d : s.getDolaplar()) {
				System.out.println(d.getId() + "  "  + d.getDolapno());
			}
		}

	}

}
