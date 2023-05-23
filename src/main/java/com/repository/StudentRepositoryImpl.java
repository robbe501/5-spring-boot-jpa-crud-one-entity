package com.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Student;
import com.vo.StudentVO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Transactional
@Repository
public class StudentRepositoryImpl implements StudentRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void insertStudent(Student student) {
		em.persist(student);

	}

	@Override
	public void updateStudent(Student student) {
		em.merge(student);

	}

	@Override
	public void deleteStudent(Integer studentId) {
		em.remove(em.find(Student.class, studentId));

	}

//	name = "Student.getStudents", 
//	query = "SELECT new com.vo.StudentVO(s.id, s.firstName, s.lastName, s.age) FROM Student s"),
	@Override
	public List<StudentVO> getStudents() {
		return em.createNamedQuery("Student.getStudents", StudentVO.class).getResultList();
	}

//	name = "Student.getStudentsByLastName", 
//	query = "SELECT s FROM Student s WHERE s.lastName = :lastName"),		
	@Override
	public List<StudentVO> getStudentsByLastName(String lastName) {
		return em.createNamedQuery("Student.getStudentsByLastName", StudentVO.class).setParameter("lastName", lastName)
				.getResultList();
	}

//	name = "Student.getStudentsByLastNameOrderByLastNameDesc", 
//	query = "SELECT s FROM Student s WHERE s.lastName = :lastName ORDER BY s.lastName DESC"),	
	@Override
	public List<StudentVO> getStudentsByLastNameOrderByLastNameDesc(String lastName) {
		return em.createNamedQuery("Student.getStudentsByLastNameOrderByLastNameDesc", StudentVO.class)
				.setParameter("lastName", lastName).getResultList();
	}

//	name = "Student.getStudentsByLastNameStartingWith", 
//	query = "SELECT s FROM Student s WHERE s.lastName LIKE :prefix"),			
	@Override
	public List<StudentVO> getStudentsByLastNameStartingWith(String lastNamePrefix) {
		return em.createNamedQuery("Student.getStudentsByLastNameStartingWith", StudentVO.class)
				.setParameter("prefix", lastNamePrefix + "%").getResultList();
	}

//	name = "Student.getStudentsByAgeGreaterThan", 
//	query = "SELECT s FROM Student s WHERE s.age > :age") 						
	@Override
	public List<StudentVO> getStudentsByAgeGreaterThan(Integer age) {
		return em.createNamedQuery("Student.getStudentsByAgeGreaterThan", StudentVO.class).setParameter("age", age)
				.getResultList();
	}

}
