package com.myapp.schoolmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.schoolmgmt.entity.Student;
import com.myapp.schoolmgmt.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping(value = "/addstudent/{schoolId}")
	public Student addStudent(@RequestBody Student student, @PathVariable int schoolId) {
		return studentService.addStudent(student, schoolId);
	}

	@GetMapping(value = "/getstudentbyschoolid/{schoolId}")
	public List<Student> getStudentById(@PathVariable int schoolId) {
		return studentService.getStudentBySchoolId(schoolId);
	}

}
