package br.com.sistec.service;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;

import br.com.sistec.dao.GenericDAO;
import br.com.sistec.dao.GenericDAOImpl;

public class GenericServiceImpl<T> implements GenericService<T> {

	private GenericDAO<T> dao;
	private Class<T> cl;

	public GenericServiceImpl(Class<T> cl, SessionFactory sessionFactory) {
		this.cl = cl;
		dao = new GenericDAOImpl<T>(cl, sessionFactory);
	}

	@Override
	public T save(T object) {
		return (T) dao.save(object);
	}
	


	@Override
	public T get(Class<T> cl, Long id) {
		//LOGGER.trace("STARTED - get");
		return (T) dao.get(cl, id);
	}

	
	@Override
	public void update(T object) {
		dao.update(object);
	}

	
	@Override
	public void delete(T object) {
	    dao.delete(object);
	}
	
	
	
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public List<T> query(String hsql, Map<String, Object> params) {
		return (List<T>)dao.query(hsql, params);
	}

	@Override
	public List<T> getAll() {
		return query("from "+cl.getName(), null);
	}


	
	
}
