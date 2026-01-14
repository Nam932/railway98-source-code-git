package com.vti.frontend;

import java.util.Map;

import com.vti.backend.Excercise6;

public class Program6 {
	public static void main(String[] args) {
//		Question 6: Map
//		Để thay thế 1 object ta có thể tạo 1 map tên là students có key = id của
//		student , value là name của students
		Excercise6 ex6 = new Excercise6();

		Map<Integer, String> students = ex6.initStudentsMap();

		System.out.println("Map students:");
		System.out.println(students);
	}
}
