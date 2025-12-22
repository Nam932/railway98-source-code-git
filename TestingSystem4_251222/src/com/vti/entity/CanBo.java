package com.vti.entity;

public class CanBo {
	// Các thuộc tính chung, private để áp dụng encapsulation
	private String name;
	private int age;
	private String gender; // "Nam", "Nu", "Khac"
	private String address;

	// Constructor
	public CanBo(String name, int age, String gender, String address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	// Getter & Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Method in thông tin chung
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Address: " + address);
	}
}
