package com.vti.frontend;

//Question 6: tiếp tục Question 5
//Tạo class PrimaryStudent, SecondaryStudent, hãy viết chương trình
//đếm số lượng PrimaryStudent được sinh ra, SecondaryStudent được
//sinh ra.
//Viết chương trình demo.
//Khởi tạo 6 Student, trong đó có 2 PrimaryStudent và 4
//SecondaryStudent, sau đó in ra số lượng Student,
//PrimaryStudent, SecondaryStudent được sinh ra.

import com.vti.entity.PrimaryStudent;
import com.vti.entity.SecondaryStudent;
import com.vti.entity.Student;

public class Program6 {
	public static void main(String[] args) {

		// Khởi tạo 2 PrimaryStudent
		new PrimaryStudent(1, "A");
		new PrimaryStudent(2, "B");

		// Khởi tạo 4 SecondaryStudent
		new SecondaryStudent(3, "C");
		new SecondaryStudent(4, "D");
		new SecondaryStudent(5, "E");
		new SecondaryStudent(6, "F");

		System.out.println("Tổng số Student: " + Student.getStudentCount());
		System.out.println("Số PrimaryStudent: " + PrimaryStudent.primaryCount);
		System.out.println("Số SecondaryStudent: " + SecondaryStudent.secondaryCount);
	}
}
