package com.vti.backend;

import java.util.Set;
import java.util.TreeSet;

import com.vti.entity.Student;

public class Excercise5 {

	// Lấy Set name không trùng và sắp xếp
	public Set<String> getSortedStudentNames(Set<Student> students) {

		// TreeSet tự động sort theo alphabet
		Set<String> names = new TreeSet<>();

		for (Student student : students) {
			names.add(student.getName());
		}

		return names;
	}

	// In danh sách name
	public void printNames(Set<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
	}
}
