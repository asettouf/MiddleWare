package com.middle.controller;

import java.rmi.RemoteException;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.middle.dao.UserDao;
import com.middle.domain.User;

@Stateless
public class UserController {

	@EJB
	private UserDao udao;
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}

	public void createUser(User u){
		try {
			udao.createUser(u);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
