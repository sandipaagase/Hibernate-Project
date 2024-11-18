package com.tka.nov14;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration cfg= new Configuration();
		cfg.configure();
		
			
		
			cfg.addAnnotatedClass(Candidate.class);
			SessionFactory factory=cfg.buildSessionFactory();
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			Candidate candidate = new Candidate(5,"dev","bjp","nagpur west","delhi","male",58);
			
			session.update(candidate);
			tx.commit();
			session.close();


	}

}
