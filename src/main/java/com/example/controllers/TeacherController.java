package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Teacher;
import com.example.services.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping(value="/{teacherId}", method=RequestMethod.GET)
	@ResponseBody
	public Teacher getTeacher(@PathVariable(name="teacherId") Long id) {
		return teacherService.getTeacher(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		return teacherService.addTeacher(teacher);
	}
	
	@RequestMapping(value="/{teacherId}", method=RequestMethod.PUT)
	@ResponseBody
	public Teacher updateTeacher(@PathVariable(name="teacherId") Long id, @RequestBody Teacher teacher) {
		return teacherService.updateTeacher(id, teacher);
	}
	
	@RequestMapping(value="/{teacherId}", method=RequestMethod.DELETE)
	@ResponseBody
	public Long deleteTeacher(@PathVariable(name="teacherId") Long id) {
		return teacherService.deleteTeacher(id);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public Iterable<Teacher> getAllTeachers() {
		return teacherService.getAllTeachers();
	}
}
