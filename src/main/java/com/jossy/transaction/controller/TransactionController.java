package com.jossy.transaction.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jossy.transaction.formatter.TransactionFormatter;
import com.jossy.transaction.model.FinalResponse;
import com.jossy.transaction.model.TransactionResponse;
import com.jossy.transaction.service.TranactionService;

@RestController
public class TransactionController {
	
	@Autowired
	TranactionService transaciotnS;
	
	ObjectMapper objectMapper = new ObjectMapper();
	
	@RequestMapping(value = "/listOfTrans", method = RequestMethod.GET)
	public List<FinalResponse> listOfTrans (){
		String response = transaciotnS.listofTransaction();
		TransactionResponse transaction = null;
		try {
			transaction = objectMapper.readValue(response, TransactionResponse.class);
		} catch (IOException e) {
			System.out.println("#########" + e.getMessage());
			e.printStackTrace();
		}
		TransactionFormatter formatter = new TransactionFormatter();
		List<FinalResponse> finalResponse = formatter.formatResponse(transaction);
		
		return finalResponse;
		
	}
	

}
