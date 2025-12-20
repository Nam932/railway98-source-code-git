package com.vti.entity;

public class Department {
	private int id;
	private String name;

	public Department() {
		this.id = 0;
	}

	public Department(String name) {
		this.id = 0;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
