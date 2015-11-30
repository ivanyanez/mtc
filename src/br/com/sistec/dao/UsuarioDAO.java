package br.com.sistec.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import br.com.sistec.domain.Usuario;
import br.com.sistec.util.HibernateUtil;

public class UsuarioDAO {
	
	
	public void inserir (Usuario usuario){
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();

	        try {
	            session.persist(usuario);
	            session.getTransaction().commit();
	        } catch (HibernateException e) {
	            session.getTransaction().rollback();
	            throw e;
	        } finally {
	            session.close();
	        }
	    }
		
		
		
	}


