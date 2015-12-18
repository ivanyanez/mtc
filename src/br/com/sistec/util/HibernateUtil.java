package br.com.sistec.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import br.com.sistec.bean.UsuarioBean;
import br.com.sistec.domain.Cargo;
import br.com.sistec.domain.Descarte;
import br.com.sistec.domain.Equipamento;
import br.com.sistec.domain.Usuario;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {

			Configuration configuration = new Configuration();
			
			configuration.addAnnotatedClass(Usuario.class);
			configuration.addAnnotatedClass(Equipamento.class);
			configuration.addAnnotatedClass(Cargo.class);
			configuration.addAnnotatedClass(Descarte.class);


			
			configuration.configure();

			ServiceRegistry serviceregistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();

			SessionFactory sessionFactory = configuration
					.buildSessionFactory(serviceregistry);

			return sessionFactory;

		}

		catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
	
	
}
