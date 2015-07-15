package br.com.sistec.test;




import java.util.List;

import org.hibernate.SessionFactory;


import br.com.sistec.dao.GenericDAOImpl;
import br.com.sistec.domain.Usuario;
import br.com.sistec.service.GenericService;
import br.com.sistec.service.GenericServiceImpl;
import br.com.sistec.util.HibernateUtil;

public class UsuarioDAOTest {
	
		public static void main(String[] args) {
			
		


	GenericService<Usuario> usuarios = new GenericServiceImpl<Usuario>(
			Usuario.class, HibernateUtil.getSessionFactory());
	
	

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
	
	}



	
