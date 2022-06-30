package com.myapp.schoolmgmt.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.myapp.schoolmgmt.entity.Student;

@Service
public interface StudentService {

	Student addStudent(Student student, int schoolId);
	
	List<Student> getStudentBySchoolId(int schoolId);
}
