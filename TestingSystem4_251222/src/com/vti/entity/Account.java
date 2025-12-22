package com.vti.entity;

import java.util.Date;

public class Account {
	private int id;
	private String email;
	private String username;
	private String fullName;
	private Position position;
	private Date createDate;

	// a) Không parameter
	public Account() {
	}

	// b) id, email, username, firstName, lastName
	public Account(int id, String email, String username, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullName = firstName + " " + lastName;
	}

	// c) + position, createDate = now
	public Account(int id, String email, String username, String firstName, String lastName, Position position) {
		this(id, email, username, firstName, lastName);
		this.position = position;
		this.createDate = new Date();
	}

	// d) + position + createDate
	public Account(int id, String email, String username, String firstName, String lastName, Position position,
			Date createDate) {
		this(id, email, username, firstName, lastName);
		this.position = position;
		this.createDate = createDate;
	}

	// getter / setter
	public String getFullName() {
		return fullName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
