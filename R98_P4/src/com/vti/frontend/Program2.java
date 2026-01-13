package com.vti.frontend;

import java.util.Stack;

import com.vti.entity.Student;

public class Program2 {
	public static void main(String[] args) {
		// Lan, Thủy, Sơn, Tiến
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Lan");

		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Thuy");

		Student student3 = new Student();
		student3.setId(3);
		student3.setName("Son");

		Student student4 = new Student();
		student4.setId(4);
		student4.setName("Tien");

		Stack<Student> studentsStack = new Stack<Student>();
		studentsStack.push(student1);
		studentsStack.push(student2);
		studentsStack.push(student3);
		studentsStack.push(student4);
		for (Student student : studentsStack) {
			System.out.println(studentsStack.peek()); // Student 4
			System.out.println(studentsStack.peek()); // Student 3

			System.out.println(student);

		}
	}
}
