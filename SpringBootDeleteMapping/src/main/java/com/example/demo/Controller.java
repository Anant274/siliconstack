package com.example.demo;

import java.util.ArrayList;

import javax.persistence.Id;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	ArrayList<Integer> a= new ArrayList<>();
	Controller()
	{
		a.add(1);
		a.add(2);
		a.add(3);
		
	}
	@DeleteMapping("/hello/{id}")
	public void deleteById(@PathVariable("id")int id)
	{
		a.remove(new Integer(id));
		System.out.println();
		System.out.println("Record no :"+id+" deleted Successfully ");
		
		print();
	}
	void print()
	{
		System.out.println("Remaining Records are ");
		for(int element : a)
		{
			
				System.out.println(element);
			
		}
		
	}
	
	
	
}
