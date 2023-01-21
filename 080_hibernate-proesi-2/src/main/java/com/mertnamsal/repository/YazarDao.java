package com.mertnamsal.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mertnamsal.entity.Yazar;
import com.mertnamsal.utils.HibernateUtil;

public class YazarDao {

	public List<Yazar> getAll() {
		Transaction transaction = null;
		List<Yazar> list = null;								
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {			
			// start transaction
			transaction = session.beginTransaction();			
			//get Ogretmen objects
			list = session.createQuery("select yazar from Yazar yazar").list();				
			// commit transaction
			transaction.commit();						
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}			
		}
		
		return list;
	}

}
