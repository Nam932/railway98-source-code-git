package com.vti.backend;

import java.util.HashMap;
import java.util.Map;

public class Excercise6 {

	// Khởi tạo Map students (id → name)
	public Map<Integer, String> initStudentsMap() {

		Map<Integer, String> students = new HashMap<>();

		students.put(1, "Nam");
		students.put(2, "Huy");
		students.put(3, "Lan");
		students.put(4, "Nam");

		return students;
	}
}
