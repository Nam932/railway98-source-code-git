package com.vti.frontend;

import com.vti.backend.Excercise2;

public class Program2 {
	public static void main(String[] args) {

		// Test chia cho 0
		float result = Excercise2.divide(7, 0);
		System.out.println(result);

		System.out.println("-----");

		// Test chia bình thường
		System.out.println(Excercise2.divide(8, 2));
	}
}
