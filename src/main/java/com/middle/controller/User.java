package com.middle.controller;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@LocalBean
@Path("/users")
public class User {
	
    @PersistenceContext(unitName="toto", 
            type=PersistenceContextType.TRANSACTION)
    EntityManager em;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<User> findAllUser(){
    	Query q=em.createQuery("SELECT * FROM user");
    	return q.getResultList();
    	
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("{id}")
    public com.middle.domain.User findUserById(@PathParam("id") long id){
    	return em.find(com.middle.domain.User.class, id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public void createUser(User user){
    	em.persist(user);
    }
	
    
}
