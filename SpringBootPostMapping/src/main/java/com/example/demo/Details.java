package com.example.demo;

import java.util.ArrayList;

public class Details {
	 static ArrayList<Details> Data
     = new ArrayList<Details>();
	 int number;
	    String name;
	    Details(int number, String name)
	    {
	        // This keyword refers to parent instance itself
	        this.number = number;
	        this.name = name;
	    }
}
