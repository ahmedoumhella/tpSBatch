package org.ensa.batch;

import java.util.List;

import org.ensa.dao.Idao;
import org.ensa.entities.Transaction;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("transactionWriter")
public class TransactionWriter implements ItemWriter<Transaction>{
	
	@Autowired
	private Idao dao;

	public void write(List<? extends Transaction> transactions) throws Exception {
		for(Transaction tr : transactions){
			dao.ajoutTransaction(tr);
		}
		
	}

}
