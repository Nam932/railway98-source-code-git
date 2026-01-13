package com.vti.entity;

public class Student {

	// Biến static dùng để auto increment id
	// Mỗi lần tạo Student mới thì count sẽ tăng
	private static int count = 0;

	private int id;
	private String name;

	// Constructor: khi tạo Student mới
	public Student(String name) {
		this.id = ++count; // id tự tăng
		this.name = name;
	}

	// Getter lấy id
	public int getId() {
		return id;
	}

	// Getter lấy name
	public String getName() {
		return name;
	}

	// Setter dùng để thay đổi name
	public void setName(String name) {
		this.name = name;
	}

	// Override toString để in object dễ nhìn
	@Override
	public String toString() {
		return "Student{id=" + id + ", name='" + name + "'}";
	}
}
