package com.vti.frontend;

import java.util.Scanner;

public class Program82 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Mời bạn nhập tuổi:");
		int age = scanner.nextInt();

		// Cách 1: IF - ELSE
		if (age > 0) {
			System.out.println("Thông tin chính xác");
		} else {
			System.out.println("Thông tin chưa chính xác");
		}

		// Cách 2: Toán tử 3 ngôi (Ternary)
		String ageInfo = (age > 0) ? "Thông tin chính xác" : "Thông tin chưa chính xác";

		System.out.println(ageInfo);

		scanner.close();
	}
}
