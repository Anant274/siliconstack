package com.example.demo;

public class Employee {
	private String name;
	private String address;
	private int mobileno;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String address, int mobileno) {
		super();
		this.name = name;
		this.address = address;
		this.mobileno = mobileno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", mobileno=" + mobileno + "]";
	}
	
	

}
