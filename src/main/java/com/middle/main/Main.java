package com.middle.main;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.middle.domain.Label;

public class Main {
	
	@PersistenceContext
	private static EntityManager em;

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props=new Properties();
		props.setProperty("openjpa.ConnectionURL", "jdbc:mysql://localhost/middleware");
		props.setProperty("openjpa.ConnectionDriverName", "com.mysql.jdbc.Driver");
		props.setProperty("openjpa.jdbc.SynchronizeMappings", "buildSchema");
		props.setProperty("openjpa.ConnectionUserName", "root");
		props.setProperty("openjpa.ConnectionPassword", "blackboner69");
		System.out.println(System.getProperties());
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("toto");
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Label l=new Label();
		l.setLabel("test");
		
		em.persist(l);
		em.getTransaction().commit();
		//System.out.println("yeah");

	}

}
