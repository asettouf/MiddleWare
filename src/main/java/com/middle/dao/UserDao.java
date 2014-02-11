package com.middle.dao;

import java.io.Serializable;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.PathParam;

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

	@Override
	public User findUser(@PathParam("id") long id) {
		// TODO Auto-generated method stub
		User user=em.find(User.class,id);
		if (user==null)
			return null;
		return user;
		
	}
	


}
