package com.vti.backend;

import java.util.HashSet;
import java.util.Set;

import com.vti.entity.Student;

public class Excercise4 {

	// Tạo Set chứa name student không trùng
	public Set<String> getUniqueStudentNames(Set<Student> students) {

		// Set không cho phép phần tử trùng
		Set<String> studentNames = new HashSet<>();

		// Lấy name từ từng student đưa vào Set
		for (Student student : students) {
			studentNames.add(student.getName());
		}

		return studentNames;
	}

	// In Set name
	public void printNames(Set<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
	}
}
