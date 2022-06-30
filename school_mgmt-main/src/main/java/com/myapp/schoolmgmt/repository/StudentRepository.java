package com.myapp.schoolmgmt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.schoolmgmt.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	

}
