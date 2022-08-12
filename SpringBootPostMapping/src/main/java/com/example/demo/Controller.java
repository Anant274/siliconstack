package com.example.demo;




import java.util.ArrayList;
import java.util.List;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {

	 @PostMapping("/EnterDetails")
	
	    String insert(@RequestBody Details ob)
	    {
		 
		 List<Details> Data = new ArrayList<>(); 
		 Data.add(new Details(ob.number, ob.name));

	      
	        for (Details obd : Data) {
	            System.out.println(obd.name + " " + obd.number);
	        }
	        return "Data Inserted";
	    }
  	
			
}


