package com.middle.client;

import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;




@Stateful
@EJB(name="java:global/UserBean",beanInterface=UserInterface.class)
public class User implements UserInterface {
	

    /**
	 * 
	 */

	EntityManager em;
	
	
	public User() throws RemoteException{
		// TODO Auto-generated constructor stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("toto");
		this.em=emf.createEntityManager();
		
	}


	
	public String fuck(){
		return "fuck you";
	}
    public List<com.middle.domain.User> findAllUser(){
    	Query q=em.createQuery("SELECT * FROM user");
    	return q.getResultList();
    	
    }
    

    
    public com.middle.domain.User findUserById(long id){
    	return em.find(com.middle.domain.User.class, id);
    }
    

    public void createUser(com.middle.domain.User user) throws RemoteException{
    	em.persist(user);
    }
	
    
}
