package com.vti.entity;

/**
 * PrimaryStudent - Là học sinh tiểu học - Kế thừa từ Student
 */
public class PrimaryStudent extends Student {

	/**
	 * Đếm số PrimaryStudent được tạo static vì dùng chung cho toàn bộ class
	 */
	public static int primaryCount = 0;

	public PrimaryStudent(int id, String name) {
		super(id, name); // gọi constructor của Student
		primaryCount++;
	}
}
