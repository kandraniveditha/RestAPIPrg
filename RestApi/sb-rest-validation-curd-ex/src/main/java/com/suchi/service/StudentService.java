package com.suchi.service;

import java.util.List;

import com.suchi.entity.Student;

public interface StudentService {

	String saveStudent(Student student);
	List<Student> getAllStudents();
	Student getStudentById(int id);
	boolean deleteStudent(int sid);
}
