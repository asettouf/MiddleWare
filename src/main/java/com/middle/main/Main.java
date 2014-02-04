package com.middle.main;

import javax.ejb.embeddable.EJBContainer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.middle.domain.Release;

public class Main {
	
	@PersistenceContext
	private static EntityManager em;

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("toto",System.getProperties());
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Release r=new Release();
		r.setReleaseNumber(1);
		
		em.persist(r);
		em.getTransaction().commit();
		//System.out.println("yeah");

	}

}
