package com.middle.client;

import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.Remote;
@Remote
public interface UserInterface {
	
	 public List<com.middle.domain.User> findAllUser();
	 public com.middle.domain.User findUserById(long id);
	 public void createUser(com.middle.domain.User user) throws RemoteException;
	 public String fuck();

}
