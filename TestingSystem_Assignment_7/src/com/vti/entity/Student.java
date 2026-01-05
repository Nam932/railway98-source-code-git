package com.vti.entity;

public class Student {

	// Instance variables
	public int id;
	public String name;

	// college: tên trường đại học - static variable (Question 1) - Dùng chung cho
	// tất cả Student
	public static String college;

	// moneyGroup: tiền quỹ lớp - static variable (Question 2) -
	// Dùng chung cho cả nhóm

	public static int moneyGroup = 0;

	/**
	 * studentCount: đếm số Student được tạo - static variable (Question 5) - Mỗi
	 * lần tạo object Student → tăng lên 1
	 */
	public static int studentCount = 0;

	// =====================
	// Constructor
	// =====================
	public Student(int id, String name) {
// Sửa thêm cho question 7 
		if (studentCount >= 7) {
			throw new RuntimeException("Chỉ được tạo tối đa 7 học sinh");
		}

		this.id = id;
		this.name = name;
		studentCount++;
	}

	// =====================
	// Instance method
	// =====================
	public void printInfo() {
		System.out.println("ID: " + id + ", Name: " + name + ", College: " + college);
	}

// =====================
//	Question 4: tiếp tục Question 1
//	Trong class Student
//	a) Viết method cho phép thay đổi college
//	b) Viết method cho phép lấy giá trị của college
//	=====================

	// Thay đổi tên trường đại học
	public static void setCollege(String newCollege) {
		college = newCollege;
	}

	// Lấy tên trường đại học hiện tại
	public static String getCollege() {
		return college;
	}

	// =====================
	// Static method (Question 5)
	// =====================

	/**
	 * Lấy tổng số Student đã được tạo
	 */
	public static int getStudentCount() {
		return studentCount;
	}
}
