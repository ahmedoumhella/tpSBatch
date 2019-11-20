package org.ensa.dao;

import org.ensa.entities.Compte;
import org.ensa.entities.Transaction;

public interface Idao {
	
	public void ajoutTransaction(Transaction transaction);
	public void updateCompte(Compte c);
	public Compte getCompteById(int idCompte) ;

}
