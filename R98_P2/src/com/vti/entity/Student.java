package com.vti.entity;

public class Student {
	private int id;
	private String name;

	// De lay dl ra sd can dung ham
	public int getID() {
		return 1000 + id;
	}

	public String getName() {
		return name;
	}

	// thay doi du lieu luu trong cac thuoc tinh

	public void setID(int id) {
		this.id = id + 150;
	}

	public void goVTI() {
		System.out.println("Go to VTI To lean!!");
	}

	public void showInfo() {
		System.out.println("ID: " + this.id + " ,Name: " + this.name);
		// goVTI();
	}

	// Khai báo ra hàm tạo đối tượng
	public Student() {

	}

	// Hàm tạo có tham số
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student(String name) {
		this.name = name;
	}
}