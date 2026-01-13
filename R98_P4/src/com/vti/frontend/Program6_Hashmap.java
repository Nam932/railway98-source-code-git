package com.vti.frontend;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Program6_Hashmap {
	public static void main(String[] args) {
		Map<String, String> nameStudentHashMap = new HashMap<>();

		nameStudentHashMap.put("VTI001", "Hoang");
		nameStudentHashMap.put("VTI002", "Lam");
		nameStudentHashMap.put("VTI003", "Thinh");
		nameStudentHashMap.put("VTI004", "Huong");
		nameStudentHashMap.put("VTI005", "Thuy");

		System.out.println("=== Duyệt bằng for-each ===");
		for (Entry<String, String> entry : nameStudentHashMap.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}
}
