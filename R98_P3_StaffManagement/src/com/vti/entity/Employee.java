package com.vti.entity;

public class Employee extends Staff {

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, Gender gender, String address) {
		super(name, age, gender, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
