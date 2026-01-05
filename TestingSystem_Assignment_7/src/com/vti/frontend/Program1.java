package com.vti.frontend;

//Exercise 1: Static
//Question 1: static variable
//Khai báo 1 class student có các thuộc tính id, name, college
//Với college là static variable.
//Hãy khởi tạo các student sau:
//Student có id = 1, name ="Nguyễn Văn A"
//Student có id = 2, name = " Nguyễn Văn B "
//Student có id = 3, name = " Nguyễn Văn C "
//Và tất cả các student này đều học ở "Đại học bách khoa".
//Dùng vòng for để in ra thông tin các student
//Sau đó hãy chuyển các student này sang "Đại học công nghệ"
//Dùng vòng for để in ra thông tin các student
import com.vti.entity.Student;

public class Program1 {
	public static void main(String[] args) {

		// Gán giá trị cho biến static
		Student.college = "Đại học Bách Khoa";

		// Khởi tạo các Student
		Student[] students = new Student[3];
		students[0] = new Student(1, "Nguyễn Văn A");
		students[1] = new Student(2, "Nguyễn Văn B");
		students[2] = new Student(3, "Nguyễn Văn C");

		// In thông tin sinh viên (lần 1)
		System.out.println("=== DANH SÁCH SINH VIÊN (ĐẠI HỌC BÁCH KHOA) ===");
		for (Student student : students) {
			student.printInfo();
		}

		// Thay đổi college
		Student.college = "Đại học Công Nghệ";

		// In thông tin sinh viên (lần 2)
		System.out.println("\n=== DANH SÁCH SINH VIÊN (ĐẠI HỌC CÔNG NGHỆ) ===");
		for (Student student : students) {
			student.printInfo();
		}
	}
}
