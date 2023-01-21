package com.mertnamsal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


// JPQL (Java Persistance Query Language) ve HQL (Hibernate Query Language) 
// JPQL : Java Persistance Query Language
// HQL  : Hibernate Query Language

/*
 * NamedQuery ->
 * name = kullanabilmek için ad giriyorsunuz
 * query = tabloya yapıalcak sorguyu giriyorsunuz (JPQL veya HQL olabilir)
 * 
 * Avantajı NativeSQL'e göre: Cache'e alır, aynı sorgu veritabanında hiç bir değişiklik olmadan gelirse cahce'den önceki sorgu sonucunu alır ve size geri döner
 * Nadir ve sık değişiklik yapılmayan çok yüksek maliyetli sorgularda kullanılabilir. (Aydan aya güncellenen bir tablo varsa kullanılabilir)
 * Ancak hergün güncellenen verilerde kullanılmaz. Yani özel durumlarda kullanılır, hez zaman ihtiyaç duyulmaz.
 */

@NamedQueries({
	@NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),    // JPQL => select * from student
	@NamedQuery(name = "Student.findById", query = "SELECT s FROM Student s WHERE s.id = :id")   // JPQL
	
})
@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	@Column(name = "first_name")
	private String firstName;	
	private String lastName;
	private String email;
	
	
	// Entity sınıflaırmızda mutlaka bir tane boş cosntructor olmalı
	public Student() {
		super();
	}

	public Student(int id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public Student(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
	
	
	

}
