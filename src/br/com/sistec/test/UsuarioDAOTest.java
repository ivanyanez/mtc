package br.com.sistec.test;




import org.hibernate.SessionFactory;

import br.com.sistec.domain.Usuario;
import br.com.sistec.service.GenericService;
import br.com.sistec.service.GenericServiceImpl;
import br.com.sistec.util.HibernateUtil;

public class UsuarioDAOTest {
	
		public static void main(String[] args) {
			
		


	GenericService<Usuario> usuarios = new GenericServiceImpl<Usuario>(
			Usuario.class, HibernateUtil.getSessionFactory());
	
		Usuario usu = new Usuario();
		
		
		usu.setUsuario("Ivan");
		usu.setSenha("123");
		usu.setUsuario("Caio");
		usu.setSenha("321");
		usu.setUsuario("Ligia");
		usu.setSenha("3221");
		usuarios.save(usu);
		
		
	
		
			
           
		}	
		
	}


	
