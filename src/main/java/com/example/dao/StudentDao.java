package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Student;

public interface StudentDao extends CrudRepository<Student, Long>{

	public Student findById(Long id);
	public Long deleteById(Long id);
}
