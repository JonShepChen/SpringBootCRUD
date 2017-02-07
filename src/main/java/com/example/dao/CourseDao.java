package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Course;

public interface CourseDao extends CrudRepository<Course, Long>{
	
	public Course findById(Long id);
	public Long deleteById(Long id);
}
