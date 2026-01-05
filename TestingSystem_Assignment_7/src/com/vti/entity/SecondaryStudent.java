package com.vti.entity;

/**
 * SecondaryStudent - Là học sinh trung học - Kế thừa từ Student
 */
public class SecondaryStudent extends Student {

	/**
	 * Đếm số SecondaryStudent được tạo
	 */
	public static int secondaryCount = 0;

	public SecondaryStudent(int id, String name) {
		super(id, name);
		secondaryCount++;
	}
}
