package com.vti.frontend;

import java.util.ArrayList;

import com.vti.backend.Excercise1;
import com.vti.entity.Student;

public class Program1 {
	public static void main(String[] args) {

		// Tạo object Exercise1 để gọi các method
		Excercise1 ex1 = new Excercise1();

		// Khởi tạo danh sách student
		ArrayList<Student> students = ex1.initStudents();

		// a) In tổng số student
		ex1.printTotalStudents(students);

		// b) In student thứ 4
		ex1.printStudentAtIndex4(students);

		// c) In student đầu và cuối
		ex1.printFirstAndLastStudent(students);

		// d) Thêm student vào đầu
		ex1.addStudentAtFirst(students, new Student("Minh"));

		// e) Thêm student vào cuối
		ex1.addStudentAtLast(students, new Student("Hoa"));

		// f) Đảo ngược danh sách
		ex1.reverseStudents(students);

		// g) Tìm student theo id
		System.out.println("Find by id = 3: " + ex1.findStudentById(students, 3));

		// h) Tìm student theo name
		System.out.println("Find by name = Nam: " + ex1.findStudentByName(students, "Nam"));

		// i) In các student trùng tên
		System.out.println("Students with duplicate names:");
		ex1.printDuplicateNameStudents(students);

		// j) Xóa name của student có id = 2
		ex1.deleteNameById(students, 2);

		// k) Xóa student có id = 5
		ex1.deleteStudentById(students, 5);

		// l) Copy danh sách students
		ArrayList<Student> studentCopies = ex1.copyStudents(students);

		System.out.println("Student Copies:");
		studentCopies.forEach(System.out::println);
	}
}
