package impl;

import skeleton.Person;

import java.util.UUID;

public class Employee extends Person {
	UUID ID;
	String department;
	String jobDescription;


	public Employee(String firstname, String lastname, int age, String department, String jobDescription) {
		super(firstname, lastname, age);
		ID = UUID.randomUUID();
		this.department = department;
		this.jobDescription = jobDescription;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"ID=" + ID +
				", department='" + department + '\'' +
				", jobDescription='" + jobDescription + '\'' +
				", firstname='" + firstname + '\'' +
				", lastname='" + lastname + '\'' +
				", age=" + age +
				'}';
	}

	public void print() {
		System.out.println("-------------------------------------");
		System.out.println("Employee Overview");
		System.out.println("Name: " + firstname + " " + lastname);
		System.out.println("Age: " + age);
		System.out.println("Company ID: " + ID);
		System.out.println("Department: " + department);
		System.out.println("Job description: " + jobDescription);
		System.out.println("-------------------------------------");
	}



}
