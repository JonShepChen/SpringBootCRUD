package com.example.services;

import java.util.List;

import com.example.entities.Course;

public interface CourseService {
	
	public Course getCourse(Long id);
	public Course addCourse(Course course);
	public Course updateCourse(Long id, Course course);
	public Long deleteCourse(Long id);
	public Iterable<Course> getAllCourses();

}
