package com.myapp.schoolmgmt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myapp.schoolmgmt.entity.School;

@Service
public interface SchoolService {

	School addSchool(School school);

	List<School> getAllSchool();

}
