package com.myapp.schoolmgmt.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.schoolmgmt.entity.School;
import com.myapp.schoolmgmt.entity.Student;
import com.myapp.schoolmgmt.repository.SchoolRepository;
import com.myapp.schoolmgmt.repository.StudentRepository;
import com.myapp.schoolmgmt.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepo;
	
	@Autowired
	SchoolRepository schoolRepo;
	
	@Override
	public Student addStudent(Student student, int schoolId) {
		// TODO Auto-generated method stub
		School school = schoolRepo.findById(schoolId).get();
		student.setSchool(school);
		Student student2 = studentRepo.save(student);
		List<Student> student1 = school.getStudent();
		student1.add(student);
		school.setStudent(student1);
		this.schoolRepo.save(school);
		return student2;
	}

	@Override
	public List<Student> getStudentBySchoolId(int schoolId) {
		// TODO Auto-generated method stub
		School school = schoolRepo.findById(schoolId).get();
		return school.getStudent();
	}

}
