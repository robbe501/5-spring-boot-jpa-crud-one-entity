package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.entity.Student;
import com.service.StudentService;

import jakarta.annotation.Resource;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private StudentService studentService;

	@Resource(name = "studentToInsert1")
	private Student s1;

	@Resource(name = "studentToInsert2")
	private Student s2;

	@Resource(name = "studentToInsert3")
	private Student s3;

	@Resource(name = "studentToInsert4")
	private Student s4;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Inserisco 4 Student
		studentService.insertStudent(s1);

		studentService.insertStudent(s2);

		studentService.insertStudent(s3);

		studentService.insertStudent(s4);

		// Modifico l'age di dello Student s2
		s2.setAge(999);

		// Update dello Student s2 con age modificata
		studentService.updateStudent(s2);

		// Delete dell'ultimo Student (s4)
		studentService.deleteStudent(4);

		// Print di tutti gli Student
//		studentService.getStudents().forEach(System.out::println);

		// Print di Student con lastName = "Cerqua"
//		studentService.getStudentsByLastName("Cerqua").forEach(System.out::println);

		// Print di Student con lastName = "Cerqua" in ordine discendente
//		studentService.getStudentsByLastNameOrderByLastNameDesc("Cerqua").forEach(System.out::println);

		// Print di Student con lastName che inizia con "Cerqua"
//		studentService.getStudentsByLastNameStartingWith("Cerqua").forEach(System.out::println);

		// Print di Student con age maggiore di 19
//		studentService.getStudentsByAgeGreaterThan(19).forEach(System.out::println);
	}

}
