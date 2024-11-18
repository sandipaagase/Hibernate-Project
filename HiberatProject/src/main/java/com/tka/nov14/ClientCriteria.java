package com.tka.nov14;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class ClientCriteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg= new Configuration();
		cfg.configure();
		
			
		
			cfg.addAnnotatedClass(Candidate.class);
			SessionFactory factory=cfg.buildSessionFactory();
			Session session=factory.openSession();
			
			
			//selct * from candidate
			Criteria criteria=session.createCriteria(Candidate.class);
			
			//where age >20
			criteria.add(Restrictions.gt("age",20 ));
			//criteria.add(Restrictions.like("partyname", "bjp"));
			List <Candidate>listofcandidate = criteria.list();
			for(Candidate candidate:listofcandidate) {
			System.out.println(candidate);
		
	}
	}


}