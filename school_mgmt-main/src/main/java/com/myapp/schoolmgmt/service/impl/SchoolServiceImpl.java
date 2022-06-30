package com.myapp.schoolmgmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.schoolmgmt.entity.School;
import com.myapp.schoolmgmt.repository.SchoolRepository;
import com.myapp.schoolmgmt.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService{

	@Autowired
	SchoolRepository schoolRepo;
	
	@Override
	public School addSchool(School school) {
		// TODO Auto-generated method stub
		return schoolRepo.save(school);
	}

	@Override
	public List<School> getAllSchool() {
		// TODO Auto-generated method stub
		return schoolRepo.findAll();
	}


}
