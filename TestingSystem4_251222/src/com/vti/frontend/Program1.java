package com.vti.frontend;

import com.vti.entity.Student;

// Demo Question 1 Excercise 4 

public class Program1 {
	public static void main(String[] args) {
		// Tạo student
		Student student1 = new Student("Nguyen Van A", "Ha Noi");
		Student student2 = new Student("Tran Thi B", "Hai Phong");

		// Set điểm
		student1.setScore(7.5);
		student2.setScore(3.8);

		// Cộng thêm điểm
		student2.addScore(1.0);

		// In thông tin
		student1.printInfo();
		student2.printInfo();
	}
}
