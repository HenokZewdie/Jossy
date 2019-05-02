package com.jossy.transaction.model;

import java.util.List;

public class TransactionResponse {

	private List<Transaction> transaction;

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}
	
}
