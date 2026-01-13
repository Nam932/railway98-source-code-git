package com.vti.backend;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Excercise7 {

	// a) In ra các key
	public void printKeys(Map<Integer, String> students) {
		System.out.println("Danh sách key:");
		for (Integer key : students.keySet()) {
			System.out.println(key);
		}
	}

	// b) In ra các value
	public void printValues(Map<Integer, String> students) {
		System.out.println("Danh sách value:");
		for (String value : students.values()) {
			System.out.println(value);
		}
	}

	// c) In students sắp xếp theo name
	public void printSortedByName(Map<Integer, String> students) {

		// Chuyển entrySet sang List
		List<Map.Entry<Integer, String>> list = new ArrayList<>(students.entrySet());

		// Sort theo value (name)
		list.sort(Comparator.comparing(Map.Entry::getValue));

		System.out.println("Students sắp xếp theo name:");
		for (Map.Entry<Integer, String> entry : list) {
			System.out.println("ID=" + entry.getKey() + ", Name=" + entry.getValue());
		}
	}

	// d) Chuyển Map sang Set
	public Set<Map.Entry<Integer, String>> convertMapToSet(Map<Integer, String> students) {

		return students.entrySet();
	}
}
