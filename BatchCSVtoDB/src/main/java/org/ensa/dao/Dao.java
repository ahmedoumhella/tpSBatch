package org.ensa.dao;
import org.ensa.entities.Compte;
import org.ensa.entities.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class Dao implements Idao{
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void ajoutTransaction(Transaction t) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(t);
	}

	public void updateCompte(Compte c) {
		Session session = sessionFactory.getCurrentSession();
         session.saveOrUpdate(c);
		
	}
	public Compte getCompteById(int idCompte) {
		
		Session session = sessionFactory.getCurrentSession();
		session.get(Compte.class, idCompte);
		return 		session.get(Compte.class, idCompte);

	}
	
}
