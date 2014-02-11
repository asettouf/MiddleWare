package com.middle.controller;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.middle.dao.UserDao;
import com.middle.domain.User;

@Stateful
@Path("users")
public class UserController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private UserDao udao;
	
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}

	
	public void createUser(User u){
		udao.createUser(u);
	}
	
	@GET
	@Produces("text/html")
	public User findUser(long id){
		return udao.findUser(1);
	}
}
