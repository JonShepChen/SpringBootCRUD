package com.example.services;

import com.example.entities.Department;

public interface DepartmentService {
	
	public Department getDepartment(Long id);
	public Department addDepartment(Department dept); 
	public Department updateDepartment(Long id, Department dept);
	public Department deleteDepartment(Long id);

}
