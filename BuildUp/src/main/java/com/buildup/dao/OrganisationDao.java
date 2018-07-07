package com.buildup.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.buildup.model.Organisation;
import com.buildup.model.OrganisationCredentials;
@Repository
public class OrganisationDao {  //we keep all the methods in dao
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public void insertcreden(OrganisationCredentials orgCreden) {
        Session session =sessionFactory.openSession();
		System.out.println("Insert Method Called for OrganisationCredentials");
		Transaction tx=session.getTransaction();
		tx.begin();
		session.save(orgCreden);
		session.flush();
		tx.commit();
		session.close();
	}

	public void insert(Organisation org) {
	
Session session =sessionFactory.openSession();
		
		System.out.println("Insert Method Called for OrganisationDetails");
		Transaction tx=session.getTransaction();
		tx.begin();
		session.save(org);
		session.flush();
		tx.commit();
		session.close();
	}

}

