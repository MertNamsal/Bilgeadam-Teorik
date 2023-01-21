package com.mertnamsal.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.mertnamsal.entity.Student;



public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			try {
				//Hibernate configuration nesnesi oluşturulur.
				Configuration configuration = new Configuration();
				
				//Hibernate settings nesnesi oluşturulur (hibernate.cfg.xml)
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "org.postgresql.Driver");
				settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/dbtest");
				settings.put(Environment.USER, "postgres");
				settings.put(Environment.PASS, "21wvtmykx");
				
				settings.put(Environment.HBM2DDL_AUTO, "update");   //create update
					//create -> bu sınıfta belirtilen ORM tablolarını siler(içeriğiyle beraber) ve  yeniden oluşturur.
					//Test amaçlı çalışmalarda bu şekilde kullanılabilir.
					//update -> tablo yoksa oluşturur, varsa silmez.İçeriğini günceller.
				
				settings.put(Environment.SHOW_SQL,"true"); //Hibernate üzerinden VT'ye giden SQL komutlarını görmemize yarar,false yaparsanız göremezsiniz.
				settings.put(Environment.FORMAT_SQL,"true");//Hibernate üzerinden VT'ye giden SQL komutlarının bizlerin anlayacağı basitlikte düzenler.
				
				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Student.class);

				
				
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
				
				//Session factory nesnesi üretiliyor..
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch(Exception e) {
				
			}
			
			
		}
		return sessionFactory;
	}
}

