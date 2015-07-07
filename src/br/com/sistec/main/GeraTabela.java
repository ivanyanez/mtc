package br.com.sistec.main;

import org.junit.Test;

import br.com.sistec.util.HibernateUtil;

public class GeraTabela {

	
	@Test
	public void geraTabela(){
	
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();
	}

}
