package com.tka.nov14;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration cfg= new Configuration();
	cfg.configure();
	
		
	
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Candidate object=session.load(Candidate.class,2);
		System.out.println(object);
		
	}

}
