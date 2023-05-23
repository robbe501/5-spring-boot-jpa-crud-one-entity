package com.repository;

import java.util.List;

import com.entity.Student;
import com.vo.StudentVO;

/*
name = "Student.getStudents", 
query = "SELECT new com.vo.StudentVO(s.id, s.firstName, s.lastName, s.age) FROM Student s"),

name = "Student.getStudentsByLastName", 
query = "SELECT s FROM Student s WHERE s.lastName = :lastName"),

name = "Student.getStudentsByLastNameOrderByLastNameDesc", 
query = "SELECT s FROM Student s WHERE s.lastName = :lastName ORDER BY s.lastName DESC"),

name = "Student.getStudentsByLastNameStartingWith", 
query = "SELECT s FROM Student s WHERE s.lastName LIKE :prefix"),

name = "Student.getStudentsByAgeGreaterThan", 
query = "SELECT s FROM Student s WHERE s.age > :age") 
*/

public interface StudentRepository {
	public void insertStudent(Student student);

	public void updateStudent(Student student);

	public void deleteStudent(Integer studentId);

	public List<StudentVO> getStudents();

	public List<StudentVO> getStudentsByLastName(String lastName);

	public List<StudentVO> getStudentsByLastNameOrderByLastNameDesc(String lastName);

	public List<StudentVO> getStudentsByLastNameStartingWith(String lastNamePrefix);

	public List<StudentVO> getStudentsByAgeGreaterThan(Integer age);
}
