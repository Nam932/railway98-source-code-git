package com.vti.frontend;

import java.util.LinkedList;
import java.util.Queue;

import com.vti.entity.Student;

public class Program4_Queue {
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

		Queue<Student> studentQueue = new LinkedList<>();
		studentQueue.add(student1);
		studentQueue.add(student2);
		studentQueue.add(student3);
		studentQueue.add(student4);

		// In danh sách ban đầu
		System.out.println("=== Danh sách ban đầu ===");
		for (Student s : studentQueue) {
			System.out.println(s);
		}

		// peek()
		System.out.println("=========== peek ==============");
		System.out.println(studentQueue.peek());

		System.out.println("=== Queue sau peek ===");
		for (Student s : studentQueue) {
			System.out.println(s);
		}

		// poll()
		System.out.println("=========== poll ==============");
		System.out.println(studentQueue.poll());

		System.out.println("=== Queue sau poll ===");
		for (Student s : studentQueue) {
			System.out.println(s);
		}
	}
}
