package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override public List<Department> fetchDepartmentList()
    {
        return (List<Department>)
            departmentRepository.findAll();
    }

	@Override
	public Department updateDepartment(Department department, long departmentId) {
		
		 Department depDB
         = departmentRepository.findById(departmentId)
               .get();

		 if (Objects.nonNull(department.getDepartmentName())
		            && !"".equalsIgnoreCase(
		                department.getDepartmentName())) {
		            depDB.setDepartmentName(
		                department.getDepartmentName());
		        }
		 
		 if (Objects.nonNull(
	                department.getDepartmentAddress())
	            && !"".equalsIgnoreCase(
	                department.getDepartmentAddress())) {
	            depDB.setDepartmentAddress(
	                department.getDepartmentAddress());
	        }
	 
	        if (Objects.nonNull(department.getDepartmentCode())
	            && !"".equalsIgnoreCase(
	                department.getDepartmentCode())) {
	            depDB.setDepartmentCode(
	                department.getDepartmentCode());
	        }
		
	        return departmentRepository.save(depDB);
	}

	@Override
	public void deleteDepartmentById(long departmentId) {
		departmentRepository.deleteById(departmentId);
		
	}
 

	
	
	
}
