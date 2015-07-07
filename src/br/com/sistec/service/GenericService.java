package br.com.sistec.service;

import java.util.List;

import br.com.sistec.dao.GenericDAO;

public interface GenericService<T> extends GenericDAO<T> {
	
	  List<T> getAll();
	  void deleteAll();

}
