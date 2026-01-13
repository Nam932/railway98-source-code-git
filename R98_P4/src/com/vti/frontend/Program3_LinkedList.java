package com.vti.frontend;

import java.util.LinkedList;

import com.vti.entity.Student;

public class Program3_LinkedList {
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

		LinkedList<Student> studentLinkedList = new LinkedList<Student>();
		// Thêm phần tử vào Linkedlist
		studentLinkedList.add(student1);
		studentLinkedList.add(student2);
		studentLinkedList.add(student3);
		studentLinkedList.add(student4);

		// Hiển thị danh sách phần tử
		for (Student student : studentLinkedList) {
			System.out.println(student.toString());
		}

		// Truy xuất phần tử

		studentLinkedList.get(2);

		// Xóa phần tử
		System.out.println("=========================");
		studentLinkedList.removeFirst(); // Xoas phan tu dau tien
		studentLinkedList.removeLast(); // Xoa phan tu cuoi cung
		for (Student student : studentLinkedList) {
			System.out.println(student.toString());
		}
	}
}
