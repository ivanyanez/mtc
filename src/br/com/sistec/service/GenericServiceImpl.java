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
	public T get(Class<T> cl, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(T object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(T object) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<T> query(String hsql, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	
	
}
