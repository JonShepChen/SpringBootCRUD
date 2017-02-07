package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Teacher;

public interface TeacherDao extends CrudRepository<Teacher, Long>{

	public Teacher findById(Long id);
	public Long deleteById(Long id);
}
