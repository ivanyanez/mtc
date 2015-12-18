package br.com.sistec.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import br.com.sistec.domain.Cargo;
import br.com.sistec.domain.Equipamento;
import br.com.sistec.util.HibernateUtil;

public class CargoDAO {
	
	public void inserir (Cargo cargo){
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();

	        try {
	            session.persist(cargo);
	            session.getTransaction().commit();
	        } catch (HibernateException e) {
	            session.getTransaction().rollback();
	            throw e;
	        } finally {
	            session.close();
	        }
	    }

}

}
