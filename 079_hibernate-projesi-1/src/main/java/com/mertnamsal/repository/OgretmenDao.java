package com.mertnamsal.repository;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mertnamsal.entities.Ogretmen;
import com.mertnamsal.utils.HibernateUtil;

//Hibernate'de tablo oluşturmak için özel bir komut yoki ilk save(insert) işlemi sırasında
//tablo otomatik oluşturulur.

public class OgretmenDao {

	public void save(Ogretmen ogr) throws Exception {
		Transaction transaction = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			//start transaction
			transaction = session.beginTransaction();
			
			//save Ogretmen object
			session.save(ogr);
			
			//commit transaction
			transaction.commit();

			
		} catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			throw new Exception("Kayıt başarısız");
		}
		
	}

	public void update(Ogretmen ogr) throws Exception {
		
		Transaction transaction = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			//start transaction
			transaction = session.beginTransaction();
			
			//update Ogretmen object
			session.update(ogr);
			
			//commit transaction
			transaction.commit();

			
		} catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			throw new Exception("Update başarısız");
		}
		
	}

	public List<Ogretmen> getAll() throws Exception {
		Transaction transaction = null;
		List<Ogretmen> list = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			//start transaction
			transaction = session.beginTransaction();
			
			//get Ogretmen object
			list =session.createQuery("from Ogretmen",Ogretmen.class).list();
			
			//commit transaction
			transaction.commit();

			
		} catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			throw new Exception("Update başarısız");
		}
		return list;
	}

	public List<Ogretmen> findWithOrder() throws Exception {
		Transaction transaction = null;
		List<Ogretmen> list = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			//start transaction
			transaction = session.beginTransaction();
			
			//get Ogretmen object
			list = session.createQuery("select ogretmen from Ogretmen ogretmen order by soyad").list();	
			
			//commit transaction
			transaction.commit();
	
			
		} catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			throw new Exception("Update başarısız");
		}
		return list;
	}

	public Ogretmen getById(int id) throws Exception {
		Transaction transaction = null;
		Ogretmen ogretmen = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			//start transaction
			transaction = session.beginTransaction();
			
			//get Ogretmen object
			ogretmen = session.get(Ogretmen.class,id);
			
			//commit transaction
			transaction.commit();
		
			
		} catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			throw new Exception("Update başarısız");
		}
		return ogretmen;
	}
	
	public void deleteById(int id) throws Exception {
		Transaction transaction = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			Ogretmen ogretmen = session.get(Ogretmen.class, id);
			session.delete(ogretmen);
			transaction.commit();
			
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			throw new Exception("Update başarısız");
		}
	}
	// Nesneye göre kayıt silme
		// Dikkat: Nesneye göre kayıt silerken sadece primary key'i dikkate alır.
		public void delete(Ogretmen ogretmen) throws Exception {
			Transaction transaction = null;
			
			try(Session session = HibernateUtil.getSessionFactory().openSession()) {			
				// start transaction
				transaction = session.beginTransaction();						
				// delete Ogretmen
				session.delete(ogretmen);
				// commit transaction
				transaction.commit();					
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
				throw new Exception("kayıt başarısız!");
			}			
		}

	
}
