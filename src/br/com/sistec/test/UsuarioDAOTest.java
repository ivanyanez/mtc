package br.com.sistec.test;




import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import org.hibernate.SessionFactory;
import org.junit.Test;

import br.com.sistec.dao.GenericDAOImpl;
import br.com.sistec.dao.UsuarioDAO;
import br.com.sistec.domain.Cargo;
import br.com.sistec.domain.Descarte;
import br.com.sistec.domain.Usuario;
import br.com.sistec.service.GenericService;
import br.com.sistec.service.GenericServiceImpl;
import br.com.sistec.util.HibernateUtil;

public class UsuarioDAOTest {
	
		
			
			@Test
			public void inserir(){
				
				Usuario usuario = new Usuario();
				
				usuario.setLastname("jjj33");
				usuario.setRa("23232");
				usuario.setSenha("55454");
				usuario.setTelefone(3285);
				usuario.setTipousuario("5");
				usuario.setUsuario("nome");
				
				usuario.setEmail("ffsa");
				
				UsuarioDAO usuariodao = new UsuarioDAO();	
			
				usuariodao.inserir(usuario);
				
			}
			
			
			
/*

	GenericService<Usuario> usuarios = new GenericServiceImpl<Usuario>(
			Usuario.class, HibernateUtil.getSessionFactory());
	
	GenericService<Cargo> car = new GenericServiceImpl<Cargo>(
			Cargo.class, HibernateUtil.getSessionFactory());
	
	GenericService<Descarte> descar = new GenericServiceImpl<Descarte>(
			Descarte.class, HibernateUtil.getSessionFactory());
	
	
	
	 Descarte descarte = new Descarte();
	 
	 
	 descarte.setDescricao("Um Dois tres");
	 descarte.setData(new Date());
	 
	 descar.save(descarte);
	
	*/
	/*
	Cargo carg = new Cargo();
	
	carg.setTitulo("123");
	car.save(carg);
*/
	
	/*
	
	Usuario usu = new Usuario();
	
	usu.setUsuario("Ligia");
	usu.setSenha("123");
	usu.setEmail("ligia.nina.sjc@hotmail.com");
	usu.setLastname("Tavares Cirino Silva");
	usu.setTelefone(32074961);
	usu.setRa("asdfg15454");
	usu.setTipousuario("teacher");
	usuarios.save(usu);
	
	
	List<Usuario> usuario = usuarios.getAll();
	if (usuario != null) {
		for (Usuario u : usuario) {
			
			System.out.println(u.getUsuario().toString());
			System.out.println(u.getSenha().toString());
		}
	}

	
           
		}	
	
	/*
	usuarios.delete(usuarios.get(Usuario.class, (long) (3)));
	*/
	
	
/*
		private static Calendar Date() {
			// TODO Auto-generated method stub
			return null;
		}

	*/
	
	
}




	
