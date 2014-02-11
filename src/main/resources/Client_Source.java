package main;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.core.MediaType;

import com.middle.dao.UserInterfaceDao;
import com.middle.domain.User;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		
		
		/*
		ClientConfig cc =new DefaultClientConfig();
		Client c=Client.create(cc);
		WebResource w=c.resource("http://localhost:8080/middleware");
		System.out.println(w.path("users").accept(MediaType.TEXT_PLAIN).get(ClientResponse.class).toString());
		*/
		
		try {
			
		     Properties props = new Properties();

		     props.setProperty("java.naming.factory.initial", 
		                       "com.sun.enterprise.naming.SerialInitContextFactory");

		     props.setProperty("java.naming.factory.url.pkgs", 
		                       "com.sun.enterprise.naming");

		     props.setProperty("java.naming.factory.state",
		                       "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
			Context ic = new InitialContext();

			UserInterfaceDao ui=(UserInterfaceDao) ic.lookup(UserInterfaceDao.class.getName());
			

			ui.createUser(new User("azerty","andre@gmail.com"));
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
