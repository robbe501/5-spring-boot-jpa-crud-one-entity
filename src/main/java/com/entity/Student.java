package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQueries({
		@NamedQuery(name = "Student.getStudents", query = "SELECT new com.vo.StudentVO(s.id, s.firstName, s.lastName, s.age) FROM Student s"),
		@NamedQuery(name = "Student.getStudentsByLastName", query = "SELECT new com.vo.StudentVO(s.id, s.firstName, s.lastName, s.age) FROM Student s WHERE s.lastName = :lastName"),
		@NamedQuery(name = "Student.getStudentsByLastNameOrderByLastNameDesc", query = "SELECT new com.vo.StudentVO(s.id, s.firstName, s.lastName, s.age) FROM Student s WHERE s.lastName = :lastName ORDER BY s.lastName DESC"),
		@NamedQuery(name = "Student.getStudentsByLastNameStartingWith", query = "SELECT new com.vo.StudentVO(s.id, s.firstName, s.lastName, s.age) FROM Student s WHERE s.lastName LIKE :prefix"),
		@NamedQuery(name = "Student.getStudentsByAgeGreaterThan", query = "SELECT new com.vo.StudentVO(s.id, s.firstName, s.lastName, s.age) FROM Student s WHERE s.age > :age") })
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	private Integer age;

	public Student() {
	}

	// Insert
	public Student(String firstName, String lastName, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	// Update
	public Student(Integer id, String firstName, String lastName, Integer age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student id:" + id + "\nFirstName=" + firstName + "\nLastName=" + lastName + "\nAge=" + age;
	}

}
