package com.vti.backend;

import java.util.HashSet;
import java.util.Set;

import com.vti.entity.Student;

public class Excercise3 {

	public Set<Student> initStudents() {
		Set<Student> students = new HashSet<>();

		students.add(new Student("Nam"));
		students.add(new Student("Huy"));
		students.add(new Student("Lan"));
		students.add(new Student("Nam")); // Có thể trùng name

		return students;
	}

	// In tất cả student
	public void printStudents(Set<Student> students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	// Tìm student theo id
	public Student findStudentById(Set<Student> students, int id) {
		for (Student student : students) {
			if (student.getId() == id) {
				return student;
			}
		}
		return null;
	}

	// Tìm student theo name
	public Student findStudentByName(Set<Student> students, String name) {
		for (Student student : students) {
			if (student.getName().equals(name)) {
				return student;
			}
		}
		return null;
	}

	// Xóa student theo id
	public void deleteStudentById(Set<Student> students, int id) {
		students.removeIf(student -> student.getId() == id);
	}
}
