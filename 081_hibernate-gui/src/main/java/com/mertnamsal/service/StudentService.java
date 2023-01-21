package com.mertnamsal.service;

import java.util.List;

import com.mertnamsal.entity.Student;
import com.mertnamsal.repository.StudentRepository;

public class StudentService {
	StudentRepository studentRepository = new StudentRepository();
	

	public StudentService() {
		studentRepository = new StudentRepository();
	}

	public void save(Student student) {
		try {
			studentRepository.save(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public List<Student> getAll() {
		List<Student> list=null;
		try {
			list= studentRepository.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void update(String id, String email, String firstName, String lastName) {
		Student student = new Student(Integer.parseInt(id),firstName,lastName,email);
		try {
			studentRepository.update(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void delete(String id) {
		try {
			studentRepository.delete(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	public List<Student> getByName(String firstName) {
		List<Student> list = null; 
		try {
			list = studentRepository.getByName(firstName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;	
		
		
	}
}
