package br.com.sistec.test;

import java.sql.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.junit.Test;

import br.com.sistec.dao.EquipamentoDAO;
import br.com.sistec.domain.Equipamento;
import br.com.sistec.domain.Usuario;
import br.com.sistec.util.HibernateUtil;

public class EquipamentoDAOTest {
	
	
	@Test
	public void inserir(){
		
		Equipamento equipamento = new Equipamento();
		
		equipamento.setDescricao("123");
		equipamento.setNome("Ivan");
	
		 EquipamentoDAO equipamentoSalvar = new EquipamentoDAO();
		 
		 equipamentoSalvar.salvar(equipamento);
		 
	}
	
		
		
	}
	
	

