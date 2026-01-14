package com.vti.frontend;

import java.util.Map;
import java.util.Set;

import com.vti.backend.Excercise6;
import com.vti.backend.Excercise7;

public class Program7 {
	public static void main(String[] args) {
//		Question 7 (Optional): tiếp tục question 6
//		Thực hiện các chức năng sau:
//		a) In ra các key của students
//		b) In ra value của students
//		c) In ra danh sách students được sắp xếp theo tên của student
//		d) Chuyển đổi map students sang set
		Excercise6 ex6 = new Excercise6();
		Excercise7 ex7 = new Excercise7();

		Map<Integer, String> students = ex6.initStudentsMap();

		ex7.printKeys(students); // a
		ex7.printValues(students); // b
		ex7.printSortedByName(students);// c

		Set<Map.Entry<Integer, String>> studentSet = ex7.convertMapToSet(students); // d

		System.out.println("Map chuyển sang Set:");
		studentSet.forEach(System.out::println);
	}
}
