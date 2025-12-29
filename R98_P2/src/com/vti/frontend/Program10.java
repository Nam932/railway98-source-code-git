package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.MathManagement;

public class Program10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MathManagement mathManagement = new MathManagement();

		System.out.println("Mời bạn nhập số thứ 1: ");
		float number1 = scanner.nextFloat();

		System.out.println("Mời bạn nhập số thứ 2: ");
		float number2 = scanner.nextFloat();

		float result_devide = mathManagement.divide(number1, number2);

		System.out.println("Kết quả phép chia là: " + result_devide);

		scanner.close();
	}
}