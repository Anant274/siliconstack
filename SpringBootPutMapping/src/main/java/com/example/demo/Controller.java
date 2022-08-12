package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	private static Map<String, Product> productRepo = new HashMap<>();
	   
	   @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
	   public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) { 
	      productRepo.remove(id);
	      product.setId(id);
	      productRepo.put(id, product);
	      return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
	   }   

}
