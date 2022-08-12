package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {

	@Autowired
	JdbcTemplate jdbc;
	
	@RequestMapping("/insert")
	public String index()
	{
		jdbc.execute("insert into user_record(id,name,email)values(1,'anant','akp.eup@gmail.com')");
		return "data inserted successfully";
	}
}
