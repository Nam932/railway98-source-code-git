package com.vti.frontend;

import java.util.Map;

import com.vti.backend.Excercise6;

public class Program6 {
	public static void main(String[] args) {

		Excercise6 ex6 = new Excercise6();

		Map<Integer, String> students = ex6.initStudentsMap();

		System.out.println("Map students:");
		System.out.println(students);
	}
}
