package br.com.sistec.test;

import java.sql.Date;
import java.time.LocalDate;

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
		
		
		LocalDate agora = LocalDate.now();
		
		Equipamento equipamento = new Equipamento();
		
		equipamento.setNome("Parquimentro");
		
		
		 EquipamentoDAO equipamentoSalvar = new EquipamentoDAO();
		 
		 equipamentoSalvar.inserir(equipamento);
		 
	}
	
		
		
	}
	
	

