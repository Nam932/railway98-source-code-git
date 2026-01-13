package com.vti.frontend;

import java.util.Set;

import com.vti.backend.Excercise3;
import com.vti.backend.Excercise4;
import com.vti.entity.Student;

public class Program4 {
	public static void main(String[] args) {

		Excercise3 ex3 = new Excercise3();
		Excercise4 ex4 = new Excercise4();

		// Lấy danh sách student
		Set<Student> students = ex3.initStudents();

		// Lấy danh sách name không trùng
		Set<String> names = ex4.getUniqueStudentNames(students);

		System.out.println("Danh sách name không trùng:");
		ex4.printNames(names);
	}
}
