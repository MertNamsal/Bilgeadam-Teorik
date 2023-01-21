package com.mertnamsal.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.mertnamsal.entity.Student;
import com.mertnamsal.utils.HibernateUtil;

public class StudentDao {

	public void save(Student student) throws Exception {
		Transaction transaction = null;		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {			
			// start transaction
			transaction = session.beginTransaction();			
			// save  object
			session.save(student);			
			// commit transaction
			transaction.commit();					
			
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw new Exception("kayıt başarısız!");
		}
		
	}
	
	
	public void update(Student student) throws Exception {
		Transaction transaction = null;		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {			
			// start transaction
			transaction = session.beginTransaction();			
			// update  object
			session.update(student);			
			// commit transaction
			transaction.commit();					
			
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw new Exception("kayıt başarısız!");
		}
		
	}


	public List<Student> getAll() throws Exception {
		Transaction transaction = null;
		List<Student> list = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start transaction
			transaction = session.beginTransaction();			
			//get  objects
			list = session.createQuery("from Student", Student.class).list();			
			// commit transaction
			transaction.commit();							
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw new Exception("kayıt başarısız!");
		}
		
		return list;
	}


	public Student getById(int id) throws Exception {
		Transaction transaction = null;
		Student student = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {			
			// start transaction
			transaction = session.beginTransaction();			
			// get  object
			student = session.get(Student.class, id);			
			// commit transaction
			transaction.commit();									
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw new Exception("kayıt başarısız!");
		}
		
		return student;
	}


	public void deleteById(int id) throws Exception {
		Transaction transaction = null;
		Student student = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {			
			// start transaction
			transaction = session.beginTransaction();			
			// get object
			student = session.get(Student.class, id);			
			// delete Student
			session.delete(student);
			// commit transaction
			transaction.commit();					
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw new Exception("kayıt başarısız!");
		}			
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Student> nativeSQLQueryOrnek1() {			
		EntityManager entityManager = HibernateUtil.getSessionFactory().createEntityManager(); 
		List<Student> list = entityManager.createNativeQuery("select id, first_name, lastname, email from student", Student.class).getResultList();
		return list;
	}

	
	public void nativeSQLQueryOrnek2() {		
		EntityManager entityManager = HibernateUtil.getSessionFactory().createEntityManager(); 
		List<Object[]> list = entityManager.createNativeQuery("select id, first_name, lastname, email from student").getResultList();
		for (Object[] element : list) {
			System.out.println("ID: "
							+ element[0]
							+ " First name: "
							+ element[1]
							+ " Last name: "
							+ element[2]
							+ " email: "
							+ element[3]);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void nativeSQLQueryOrnek3() {		
		EntityManager entityManager = HibernateUtil.getSessionFactory().createEntityManager(); 
		List<Object[]> list = entityManager.createNativeQuery("select id, first_name, lastname, email from student where id in (select ogrenciid from notlar where durum = 'kaldı')").getResultList();
		for (Object[] element : list) {
			System.out.println("ID: "
							+ element[0]
							+ " First name: "
							+ element[1]
							+ " Last name: "
							+ element[2]
							+ " email: "
							+ element[3]);
		}
	}
	
	
	// Soru:
	// notlar tablosuyla inner join yapın, sınıfta kalan öğrencilerin id, ad ve not1 bilgilierini ekrana yazıdırn.
	@SuppressWarnings("unchecked")
	public void nativeSQLQueryOrnek4() {		
		EntityManager entityManager = HibernateUtil.getSessionFactory().createEntityManager(); 
		List<Object[]> list = entityManager.createNativeQuery("select student.id, student.first_name, notlar.not1 from student " +
														      "join notlar " +
														      "on student.id = notlar.ogrenciid " +
															  "where notlar.durum = 'kaldı'").getResultList();
		for (Object[] element : list) {
			System.out.println("ID: "
							+ element[0]
							+ " Ad: "
							+ element[1]
							+ " Not1: "
							+ element[2]);
		}
	}


	public void namedQueryFindAllStudents() {				
		Session session = HibernateUtil.getSessionFactory().openSession();
		EntityManager entityManager = session.getEntityManagerFactory().createEntityManager();
		
		TypedQuery<Student> query = entityManager.createNamedQuery("Student.findAll", Student.class);
		List<Student> list = query.getResultList();
		list.forEach(System.out::println);		
	}


	public void namedQueryFindById() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		EntityManager entityManager = session.getEntityManagerFactory().createEntityManager();
		
		TypedQuery<Student> query = entityManager.createNamedQuery("Student.findById", Student.class);
		query.setParameter("id", 2);
		List<Student> list = query.getResultList();
		list.forEach(System.out::println);				
	}

}
