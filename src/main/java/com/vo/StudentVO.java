package com.vo;

public class StudentVO {
	private Integer id;

	private String firstName;

	private String lastName;

	private Integer age;

	public StudentVO(Integer id, String firstName, String lastName, Integer age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentVO [ \nId: " + id + "\nFirstName: " + firstName + "\nLastName: " + lastName + "\nAge: " + age
				+ "\n\n]";
	}

}
