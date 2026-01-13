package com.vti.entity;

public class Account {
	private int id;
	private String email;
	private String username;
	private String fullName;

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

	public Account(int id, String email, String username, String fullName) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullName = fullName;
	}

}
