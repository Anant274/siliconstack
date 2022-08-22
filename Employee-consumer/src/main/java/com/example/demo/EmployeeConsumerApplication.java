package com.example.demo;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

@SpringBootApplication
public class EmployeeConsumerApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(EmployeeConsumerApplication.class, args);
//	}
	
	
	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(
				EmployeeConsumerApplication.class, args);
		
		ConsumerController consumerControllerClient=ctx.getBean(ConsumerController.class);
		System.out.println(consumerControllerClient);
		consumerControllerClient.getEmployee();
		
	}
	
	@Bean
	public  ConsumerController  consumerControllerClient()
	{
		return  new ConsumerController();
	}

}
