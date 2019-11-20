package org.ensa.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Compte {
	@Id
	private int idCompte;
	private double solde ;
	
	@OneToMany(mappedBy="compte")
	private Set<Transaction> transactions= new HashSet<Transaction>();

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

//	public Set<Transaction> getTransactions() {
//		return transactions;
//	}
//
//	public void setTransactions(Set<Transaction> transactions) {
//		this.transactions = transactions;
//	}

	public Compte(int idCompte, double solde) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
	}

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
