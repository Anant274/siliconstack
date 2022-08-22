package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	
	@RequestMapping(value = "/employee" ,method =RequestMethod.GET)
	public Employee firstpage()
	{
		Employee emp=new Employee();
		emp.setName("anant");
		emp.setAddress("gandhibhavan");
		emp.setMobileno(1234);
		return emp;
	}
	
}
