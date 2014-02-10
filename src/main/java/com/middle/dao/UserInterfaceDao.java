package com.middle.dao;

import java.rmi.RemoteException;

import javax.ejb.Remote;

import com.middle.domain.User;

@Remote
public interface UserInterfaceDao {
	
	public void createUser(User u);

}
