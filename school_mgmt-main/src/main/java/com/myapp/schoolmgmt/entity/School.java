package com.myapp.schoolmgmt.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "school")
public class School {

	public School() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "school_id")
	private int schoolId;
	
	@Column(name = "school_name")
	private String schoolName;
	
	@OneToMany(mappedBy = "school", cascade = CascadeType.PERSIST)
	private List<Student> student;

	public School(int schoolId, String schoolName, List<Student> student) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.student = student;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

}
