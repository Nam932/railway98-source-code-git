package com.vti.frontend;

import java.util.Set;

import com.vti.backend.Excercise3;
import com.vti.entity.Student;

public class Program3 {
	public static void main(String[] args) {

		Excercise3 ex3 = new Excercise3();

		Set<Student> students = ex3.initStudents();

		System.out.println("Danh sách students:");
		ex3.printStudents(students);

		System.out.println("Find by id = 2:");
		System.out.println(ex3.findStudentById(students, 2));

		System.out.println("Delete student id = 3");
		ex3.deleteStudentById(students, 3);

		System.out.println("Danh sách sau khi xóa:");
		ex3.printStudents(students);
	}
}
