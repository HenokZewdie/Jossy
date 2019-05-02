package com.jossy.transaction.util;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
public class Utility {

	public HttpHeaders populateHeader(){
		HttpHeaders headers = new HttpHeaders();
		headers.set("accept", "application/json");
		headers.set("authorization", "Bearer AAIkMzkwNmRkNmQtNTM0Yi00ZDIwLTgxZDctMGU3ODg0ODAxM2Ez4hVp8cEeSvBvQm7YDOX_s9XMUJeGYfX6wZWq-uNNTuvlqI5UvanyYTJQBly6wp4PKuqgaQfOiZvrGxaItQGAMV70p2HED4ddVQnctvEeqmtS-cxczc08u9Ems34xkSvNU_ke8IcOo--2LcKWOHxMcZCfpvvx-JeVZRZ7uS2HNmKDzvXFVOo9noljHxWxG4Op4nzlIhfa_2LVYQfUsq2seQ");
		headers.set("client_id", "3906dd6d-534b-4d20-81d7-0e78848013a3");
		headers.set("content-type", "application/json");
		headers.set("uuid", "1a5a8004-cd10-4863-b1f9-ee4d71a69b61");
		return headers;
	}
	
}
