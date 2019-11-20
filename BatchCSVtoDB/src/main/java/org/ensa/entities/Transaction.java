package org.ensa.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Transaction {
	
	
	@Id
	private int idTransaction;
	private double montant;

	private String dateDebit;
	private String dateTransaction;
	@ManyToOne
	@JoinColumn(name="idCompte")
	private Compte compte;
	
	
	
	
	
	
	
	public int getIdTransaction() {
		return idTransaction;
	}
	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}
	
	
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public Transaction(int idTransaction, double montant, String dateTransaction) {
		super();
		this.idTransaction = idTransaction;
		this.montant = montant;
		this.dateTransaction = dateTransaction;
	}
	public String getDateDebit() {
		return dateDebit;
	}
	public void setDateDebit(String dateDebit) {
		this.dateDebit = dateDebit;
	}
	public String getDateTransaction() {
		return dateTransaction;
	}
	public void setDateTransaction(String dateTransaction) {
		this.dateTransaction = dateTransaction;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
