package com.middle.dao;

import java.io.Serializable;
import java.rmi.RemoteException;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.middle.domain.User;

@Stateful
public class UserDao implements UserInterfaceDao, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(name="toto")
	private EntityManager em;
	

	public UserDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createUser(User u)  {
		
		em.persist(u);
		
		
		// TODO Auto-generated method stub
		
	}
	


}
