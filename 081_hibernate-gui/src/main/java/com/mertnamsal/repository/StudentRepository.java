package com.mertnamsal.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mertnamsal.entity.Student;
import com.mertnamsal.utils.HibernateUtil;

public class StudentRepository {

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
		
		return list;	}

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
	public void delete(int id) throws Exception {
		Transaction transaction = null;
		Student studentTemp = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {			
			// start transaction
			transaction = session.beginTransaction();			
			// get object
			studentTemp = session.get(Student.class, id);			
			// delete Student
			session.delete(studentTemp);
			// commit transaction
			transaction.commit();					
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw new Exception("silme başarısız!");
		}			
		
		
	}

	public List<Student> getByName(String firstName) throws Exception {
		Transaction transaction = null;
		List<Student> list = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start transaction
			transaction = session.beginTransaction();			
			//get  objects
			list = session.createQuery("Select student from Student as student where student.firstName = '"+firstName+"'", Student.class).list();    			
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

}
