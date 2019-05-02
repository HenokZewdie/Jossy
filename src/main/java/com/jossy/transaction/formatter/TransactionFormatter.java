package com.jossy.transaction.formatter;

import java.util.ArrayList;
import java.util.List;

import com.jossy.transaction.model.FinalResponse;
import com.jossy.transaction.model.Transaction;
import com.jossy.transaction.model.TransactionResponse;

public class TransactionFormatter {

	public List<FinalResponse> formatResponse(TransactionResponse response){
		FinalResponse finalResponse = new FinalResponse();
		List<FinalResponse> finalResponselist = new ArrayList<>();
		for(Transaction test: response.getTransaction()){
			finalResponse.setDisplayAccountNumber(test.getDisplayAccountNumber());
			finalResponse.setEligibleForEqualPaymentPlan(test.getEligibleForEqualPaymentPlan());
			finalResponselist.add(finalResponse);
		}
		return finalResponselist;
	}
}
