package com.myapp.schoolmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.schoolmgmt.entity.School;
import com.myapp.schoolmgmt.service.SchoolService;

@RestController
public class SchoolController {

	@Autowired
	SchoolService schoolService;

	@PostMapping(value = "/addschool")
	public School addSchool(@RequestBody School school) {
		return schoolService.addSchool(school);
	}

	@GetMapping(value = "/getallschool")
	public List<School> getAllSchool() {
		return schoolService.getAllSchool();
	}

}
