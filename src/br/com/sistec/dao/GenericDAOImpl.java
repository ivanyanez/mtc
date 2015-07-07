package br.com.sistec.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.sistec.util.HibernateUtil;


	
	public class GenericDAOImpl<T> implements GenericDAO<T> {
		
		
		private SessionFactory sessionFactory;

		public GenericDAOImpl(Class<T> cl, SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
			if (sessionFactory == null)
				throw new RuntimeException("Session factory is null!!!");
		}

	
		@Override
		public void update(T object) {
			
		
}


		@Override
		public T get(Class<T> cl, Integer id) {
			// TODO Auto-generated method stub
			return null;
		}


		
		 @Override
		    public T save(T object) {
		        Session session = HibernateUtil.getSessionFactory().openSession();
		        session.beginTransaction();

		        try {
		            session.persist(object);
		            session.getTransaction().commit();
		        } catch (HibernateException e) {
		            session.getTransaction().rollback();
		            throw e;
		        } finally {
		            session.close();
		        }
				return object;
		    }
		/*
		@Override
		 public T save(T object){
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.save(object);
			session.getTransaction().commit();
			return object;
		}*/


		@Override
		public void delete(T object) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public List<T> query(String hsql, Map<String, Object> params) {
			// TODO Auto-generated method stub
			return null;
		}
	}