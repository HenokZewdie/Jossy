package com.jossy.transaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jossy.transaction.model.Transaction;
import com.jossy.transaction.util.Utility;

@Service
public class TranactionService {

	@Autowired
	Utility utility;
	@Autowired
	RestTemplate restTemplate;
	
	public String listofTransaction(){
		List<Transaction> response = null;
		HttpHeaders headers = utility.populateHeader();
		String url="https://sandbox.apihub.citi.com/gcb/api/v1/accounts/674d4a4f6a443741656e5a584a6f57665a444e685772393273615777397a4c665073305a5a2b51356f76513d/transactions";
		HttpEntity<?>  entity = new HttpEntity<>(headers);
		ResponseEntity<String> transacionResponseEntity = null;
		try
		{
			transacionResponseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		}catch(Exception e){
			System.out.println("ERROR#######" +  e.getMessage());
		}
		//response = transacionResponseEntity.getBody();
		return transacionResponseEntity.getBody();
		
	}
}
