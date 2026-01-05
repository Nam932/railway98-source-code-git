package com.vti.frontend;

import com.vti.entity.Student;

//Question 5:
//Hãy viết chương trình đếm số Student được sinh ra (tham khảo code
//trên google)

public class Program5 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "A");
		Student s2 = new Student(2, "B");
		Student s3 = new Student(3, "C");

		System.out.println("Tổng số Student được tạo: " + Student.getStudentCount());
	}
}
