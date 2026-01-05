package com.vti.frontend;

import com.vti.entity.Student;

public class Program1 {
	public static void main(String[] args) {

		// set className cho toàn bộ Student
		Student.setClassName("Railway98");

		Student student1 = new Student();
//		student1.setId(1);
		student1.setName("Nam");

		Student student2 = new Student();
//		student2.setId(2);
		student2.setName("Anh");

		Student student3 = new Student();
//		student3.setId(3);
		student3.setName("Hoang");

		Student student4 = new Student();
//		student4.setId(4);
		student4.setName("Hai");

		student1.showInfo();
		student2.showInfo();
		student3.showInfo();
		student4.showInfo();

		// Chuyển cac bạn sang lớp mới
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();
		student4.showInfo();

		Student.ClassName = "Java Web Fullstack";
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();
		student4.showInfo();

		// Chuyển bạn studnet 1 sang lớp mới
		System.out.println("---------------------------------------------------------");
		System.out.println("Student1 : " + student1.getClassName());
	}
}
