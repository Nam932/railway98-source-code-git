package com.vti.backend;

import java.util.ArrayList;
import java.util.Collections;

import com.vti.entity.Student;

public class Excercise1 {

	// Khởi tạo danh sách student ban đầu
	// Có 3 student trùng tên "Nam"
	public ArrayList<Student> initStudents() {
		ArrayList<Student> students = new ArrayList<>();

		students.add(new Student("Nam"));
		students.add(new Student("Huy"));
		students.add(new Student("Nam"));
		students.add(new Student("Lan"));
		students.add(new Student("Nam"));

		return students;
	}

	// a) In ra tổng số phần tử của students
	public void printTotalStudents(ArrayList<Student> students) {
		System.out.println("Total students: " + students.size());
	}

	// b) Lấy phần tử thứ 4 của students (index = 3)
	public void printStudentAtIndex4(ArrayList<Student> students) {
		System.out.println("Student at index 3: " + students.get(3));
	}

	// c) In ra phần tử đầu và phần tử cuối
	public void printFirstAndLastStudent(ArrayList<Student> students) {
		System.out.println("First student: " + students.get(0));
		System.out.println("Last student: " + students.get(students.size() - 1));
	}

	// d) Thêm 1 phần tử vào vị trí đầu
	public void addStudentAtFirst(ArrayList<Student> students, Student student) {
		students.add(0, student);
	}

	// e) Thêm 1 phần tử vào vị trí cuối
	public void addStudentAtLast(ArrayList<Student> students, Student student) {
		students.add(student);
	}

	// f) Đảo ngược danh sách students
	public void reverseStudents(ArrayList<Student> students) {
		Collections.reverse(students);
	}

	// g) Tìm student theo id
	public Student findStudentById(ArrayList<Student> students, int id) {
		for (Student student : students) {
			if (student.getId() == id) {
				return student;
			}
		}
		return null;
	}

	// h) Tìm student theo name
	public Student findStudentByName(ArrayList<Student> students, String name) {
		for (Student student : students) {
			if (student.getName().equals(name)) {
				return student;
			}
		}
		return null;
	}

	// i) In ra các student có trùng tên
	public void printDuplicateNameStudents(ArrayList<Student> students) {
		for (int i = 0; i < students.size(); i++) {
			for (int j = i + 1; j < students.size(); j++) {

				// So sánh name của 2 student
				if (students.get(i).getName().equals(students.get(j).getName())) {
					System.out.println(students.get(i));
					break;
				}
			}
		}
	}

	// j) Xóa name của student có id = truyền vào
	public void deleteNameById(ArrayList<Student> students, int id) {
		for (Student student : students) {
			if (student.getId() == id) {
				student.setName(null);
			}
		}
	}

	// k) Xóa student có id = truyền vào
	public void deleteStudentById(ArrayList<Student> students, int id) {
		students.removeIf(student -> student.getId() == id);
	}

	// l) Copy students sang studentCopies
	public ArrayList<Student> copyStudents(ArrayList<Student> students) {
		return new ArrayList<>(students);
	}
}
