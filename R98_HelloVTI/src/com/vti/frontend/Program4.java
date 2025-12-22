package com.vti.frontend;

import com.vti.entity.Student;

public class Program4 {
// Viết chương trình quản lý các bạn học viên lớp Railway98
// Học viên có thông tin tên, tuổi
	// dùng kiểu dữ liệu object để lưu 1 luc nhiều thông tin
//	student1: sơn,20
//	student2: nam,21
//	student3: hương,24
	// Hàm main
	public static void main(String[] args) {
// Tạo học viên 
		Student student1 = new Student();
		student1.name = "Sơn";
		student1.age = 20;
		Student student2 = new Student();
		student2.name = "Đức";
		student2.age = 20;
		Student student3 = new Student();
		student3.name = "Anh";
		student3.age = 28;
		System.out.println("Thông tin bạn học viên 1, name:" + student1.name + " , age: " + student1.age);
		System.out.println("Thông tin bạn học viên 2, name:" + student2.name + " , age: " + student2.age);
		System.out.println("Thông tin bạn học viên 3, name:" + student3.name + " , age: " + student3.age);

		System.out.println("----------------------------------");
		student1.goToVTI(); // Sơn : Go to...
		student2.goToVTI(); // Đức
		student3.goToVTI();

		student1.showInfo();
		student2.showInfo();
	}
}
