package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Student;
import com.repository.StudentRepository;
import com.vo.StudentVO;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.TransactionRequiredException;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void insertStudent(Student student) {
		try {
			studentRepository.insertStudent(student);
			System.out.println("Info: Transazione riuscita.");
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			System.err.println("Errore: Transazione fallita.");
		}

	}

	@Override
	public void updateStudent(Student student) {
		try {
			studentRepository.updateStudent(student);
			System.out.println("Info: Transazione riuscita.");
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			System.err.println("Errore: Transazione fallita.");
		}

	}

	@Override
	public void deleteStudent(Integer studentId) {
		try {
			studentRepository.deleteStudent(studentId);
			System.out.println("Info: Transazione riuscita.");
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			System.err.println("Errore: Transazione fallita.");
		}

	}

	@Override
	public List<StudentVO> getStudents() {
		List<StudentVO> students = new ArrayList<>();
		try {
			students = studentRepository.getStudents();
			System.out.println("Info: Transazione riuscita.");
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			System.err.println("Errore: Transazione fallita.");
		}

		return students;
	}

	@Override
	public List<StudentVO> getStudentsByLastName(String lastName) {
		List<StudentVO> students = new ArrayList<>();
		try {
			students = studentRepository.getStudentsByLastName(lastName);
			System.out.println("Info: Transazione riuscita.");
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			System.err.println("Errore: Transazione fallita.");
		}

		return students;
	}

	@Override
	public List<StudentVO> getStudentsByLastNameOrderByLastNameDesc(String lastName) {
		List<StudentVO> students = new ArrayList<>();
		try {
			students = studentRepository.getStudentsByLastNameOrderByLastNameDesc(lastName);
			System.out.println("Info: Transazione riuscita.");
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			System.err.println("Errore: Transazione fallita.");
		}

		return students;
	}

	@Override
	public List<StudentVO> getStudentsByLastNameStartingWith(String lastNamePrefix) {
		List<StudentVO> students = new ArrayList<>();
		try {
			students = studentRepository.getStudentsByLastNameStartingWith(lastNamePrefix);
			System.out.println("Info: Transazione riuscita.");
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			System.err.println("Errore: Transazione fallita.");
		}

		return students;
	}

	@Override
	public List<StudentVO> getStudentsByAgeGreaterThan(Integer age) {
		List<StudentVO> students = new ArrayList<>();
		try {
			students = studentRepository.getStudentsByAgeGreaterThan(age);
			System.out.println("Info: Transazione riuscita.");
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			System.err.println("Errore: Transazione fallita.");
		}

		return students;
	}

}
