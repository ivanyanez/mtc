package br.com.sistec.dao;

      	import java.util.List;
import java.util.Map;

import br.com.sistec.domain.Usuario;

	    
	public interface GenericDAO<T> {
	        public T get(Class<T> cl, Long id);
			public T save(T object);
			public void update(T object);
			public void delete(T object);
			public List<T> query(String hsql, Map<String, Object> params);
	

	}


