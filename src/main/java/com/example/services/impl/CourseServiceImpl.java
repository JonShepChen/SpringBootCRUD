package com.example.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CourseDao;
import com.example.entities.Course;
import com.example.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseDao courseDao;

	@Override
	public Course getCourse(Long id) {
		return courseDao.findById(id);
	}

	@Override
	public Course addCourse(Course course) {
		return courseDao.save(course);
	}

	@Override
	public Course updateCourse(Long id, Course course) {
		if(courseDao.exists(id)) {
			course.setId(id);
			return courseDao.save(course);
		}
		return null;
	}

	@Override
	public Long deleteCourse(Long id) {
		return courseDao.deleteById(id);
	}

	@Override
	public Iterable<Course> getAllCourses() {
		return courseDao.findAll();
	}

}
