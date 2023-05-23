package com.service;

import java.util.List;

import com.entity.Student;
import com.vo.StudentVO;

public interface StudentService {
	public void insertStudent(Student student);

	public void updateStudent(Student student);

	public void deleteStudent(Integer studentId);

	public List<StudentVO> getStudents();

	public List<StudentVO> getStudentsByLastName(String lastName);

	public List<StudentVO> getStudentsByLastNameOrderByLastNameDesc(String lastName);

	public List<StudentVO> getStudentsByLastNameStartingWith(String lastNamePrefix);

	public List<StudentVO> getStudentsByAgeGreaterThan(Integer age);
}
