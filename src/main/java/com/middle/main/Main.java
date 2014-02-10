package com.middle.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.openjpa.persistence.Persistent;

import com.middle.dao.UserDao;
import com.middle.dao.UserInterfaceDao;
import com.middle.domain.Style;
import com.middle.domain.User;

public class Main {
	
	@Persistent
	private static  EntityManager em;

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Properties props=new Properties();
		props.setProperty("openjpa.ConnectionURL", "jdbc:mysql://localhost/middleware");
		props.setProperty("openjpa.ConnectionDriverName", "com.mysql.jdbc.Driver");
		props.setProperty("openjpa.jdbc.SynchronizeMappings", "buildSchema");
		props.setProperty("openjpa.ConnectionUserName", "root");
		props.setProperty("openjpa.ConnectionPassword", "blackboner69");
		System.out.println(System.getProperties());
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("toto");
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Release r=new Release(15);
		Style s=new Style("yolo");
		Track t=new Track(r, s, "yolo 4 life");
		em.persist(r);
		em.persist(s);
		em.persist(t);
		em.getTransaction().commit();
		//System.out.println("yeah");
		
		ClientMid test=new ClientMid();
		Collection<User>toto=test.getAllUsers();
		if (toto==null){
			System.out.println("perhaps");
		}*/
	

	}

}
