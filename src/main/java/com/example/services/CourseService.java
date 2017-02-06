package com.example.services;

import org.springframework.stereotype.Service;

import com.example.entities.Course;

@Service
public interface CourseService {
	
	public Course getCourse(Long id);
	public Course addCourse(Course course);
	public Course updateCourse(Long id, Course course);
	public Course deleteCourse(Long id);

}
