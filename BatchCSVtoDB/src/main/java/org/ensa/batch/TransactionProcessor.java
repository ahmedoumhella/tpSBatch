package org.ensa.batch;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.ensa.dao.Idao;
import org.ensa.entities.Compte;
import org.ensa.entities.Transaction;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

@Service("transactionProcessor")
public class TransactionProcessor implements ItemProcessor<Transaction, Transaction>{

private Idao dao ;
	public Transaction process(Transaction transaction) throws Exception {
		Date date=new Date(new Long(System.currentTimeMillis()));
		SimpleDateFormat  sdf=new SimpleDateFormat("dd/MM/yy HH:mm");
		transaction.setDateDebit(sdf.format(date));
		Compte compte=transaction.getCompte();
        compte.setSolde(compte.getSolde()-transaction.getMontant());
		dao.updateCompte(compte);
		return transaction;
	}
}
