package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Course;
import com.example.services.CourseService;

@RestController
@RequestMapping(value="/course")
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping(value="/{courseId}", method=RequestMethod.GET)
	@ResponseBody
	public Course getCourse(@PathVariable(name="courseId") Long id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	
	@RequestMapping(value="/{courseId}", method=RequestMethod.PUT)
	@ResponseBody
	public Course updateCourse(@PathVariable(name="courseId") Long id, @RequestBody Course course) {
		return courseService.updateCourse(id, course);
	}
	
	@RequestMapping(value="/{courseId}", method=RequestMethod.DELETE)
	@ResponseBody
	public Course deleteCourse(@PathVariable(name="courseId") Long id) {
		return courseService.deleteCourse(id);
	}

}
