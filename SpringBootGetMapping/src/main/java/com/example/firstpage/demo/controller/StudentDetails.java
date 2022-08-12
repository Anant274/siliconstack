package com.example.firstpage.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentDetails {
	@GetMapping(value = "/index")
	public String index()
	{
		return "index";
	}

}
