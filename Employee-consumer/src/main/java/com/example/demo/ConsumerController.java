package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;


public class ConsumerController {
	
	public void getEmployee() throws RestClientException,IOException
	{
		String baseUrl="http://localhost:8089/employee";
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<String> response=null;
		try {
			response=restTemplate.exchange(baseUrl, HttpMethod.GET,getHeaders(),String.class);
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println(response.getBody());
	}
	
	private static HttpEntity<?> getHeaders() throws IOException
	{
		HttpHeaders headers=new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}

}
