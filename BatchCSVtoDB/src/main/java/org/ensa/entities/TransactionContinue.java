package org.ensa.entities;


import org.ensa.dao.Idao;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindException;

public  class TransactionContinue implements FieldSetMapper<Transaction>{
@Autowired
private Idao dao;

public Transaction mapFieldSet(FieldSet fieldSet) throws BindException {
	// TODO Auto-generated method stub
	Transaction transaction = new Transaction(fieldSet.readInt(0), fieldSet.readDouble(2), fieldSet.readString(3));
	int idCompte=fieldSet.readInt(1);
	transaction.setCompte(dao.getCompteById(idCompte));
	return transaction;
}
	
	
}
