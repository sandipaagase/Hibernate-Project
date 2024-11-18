package com.tka.nov14;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ClientProjection {

    public static void main(String[] args) {
        // Load Hibernate configuration
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Candidate.class);

        // Build SessionFactory and Session
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        try {
            // Create Criteria for Candidate class
            Criteria criteria = session.createCriteria(Candidate.class);

            // Create a ProjectionList for name, partyname, and age
            ProjectionList projectionList = Projections.projectionList();
            projectionList.add(Projections.property("name"));       // Select "name"
            projectionList.add(Projections.property("partyname"));  // Select "partyname"
            projectionList.add(Projections.property("age"));        // Select "age"

            // Apply the ProjectionList to the Criteria
            criteria.setProjection(projectionList);

            // Add restriction: age > 20
            criteria.add(Restrictions.gt("age", 20));

            // Execute query and fetch results
            List<Object[]> results = criteria.list();

            // Print results
            for (Object[] row : results) {
                String name = (String) row[0];
                String partyName = (String) row[1];
                Integer age = (Integer) row[2];

                System.out.println("Name: " + name + ", Party Name: " + partyName + ", Age: " + age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            session.close();
            factory.close();
        }
    }
}
