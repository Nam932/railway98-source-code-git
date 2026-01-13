package com.vti.frontend;

import java.util.Set;

import com.vti.backend.Excercise3;
import com.vti.backend.Excercise5;
import com.vti.entity.Student;

public class Program5 {
	public static void main(String[] args) {

		Excercise3 ex3 = new Excercise3();
		Excercise5 ex5 = new Excercise5();

		Set<Student> students = ex3.initStudents();

		Set<String> sortedNames = ex5.getSortedStudentNames(students);

		System.out.println("Danh sách name không trùng (đã sắp xếp):");
		ex5.printNames(sortedNames);
	}
}
