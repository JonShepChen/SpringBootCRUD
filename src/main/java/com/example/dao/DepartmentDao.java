package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Department;

public interface DepartmentDao extends CrudRepository<Department, Long>{
	
	public Department findById(Long id);
	public Long deleteById(Long id);
}
