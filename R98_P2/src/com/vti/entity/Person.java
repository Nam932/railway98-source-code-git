package com.vti.entity;

// Khai bao thuoc tinh tuong ung
public class Person {
	private int id;
	private String email;
	private String username;
	private String fullName;

	public Person(int id, String email, String username, String fullName) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullName = fullName;

	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void showInfo() {
		System.out.println("ID: " + this.id);
		System.out.println("email" + this.email);
		System.out.println("userName: " + this.username);
		System.out.println("fullName: " + this.fullName);
	}

}
