package com.vti.frontend;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {

		System.out.print("Người dùng nhập số nguyên: ");

		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt(); // yêu cầu người dùng nhập số nguyên

		System.out.println("Số bạn vừa nhập là: " + number1);

		System.out.print("Người dùng nhập số nguyên 2: ");
		int number2 = scanner.nextInt();

		int result = number1 + number2;
		System.out.println("Tổng 2 số là " + result);
		scanner.close();

	}
}

// scanner.nextInt(): yêu cầu dữ liệu từ người dùng và trả về 1 số nguyên

// In thông tin tên tuổi của người dùng 
