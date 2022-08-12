package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;

public interface DepartmentService {
	
	Department saveDepartment(Department department);
	
	List<Department> fetchDepartmentList();
	
	Department updateDepartment(Department department,long departmentId);
	
	void deleteDepartmentById(long departmentId);
	

}
