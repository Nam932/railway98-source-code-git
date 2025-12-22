package com.vti.frontend;

public class Program5 {

	public static void main(String[] args) {

		// Gọi các hàm
		sum();
		minus();

		int multiplyResult = multiply(3, 4);
		System.out.println("Kết quả phép nhân: " + multiplyResult);
	}

	// Tính tổng
	public static void sum() {
		System.out.println("Nhap vao so thu 1: ");
		int a = 5;

		System.out.println("Nhap vao so thu 2: ");
		int b = 10;

		int result = a + b;
		System.out.println("Tổng 2 số: " + result);
	}

	// Tính hiệu
	public static void minus() {
		System.out.println("Nhap vao so thu 1: ");
		int a = 5;

		System.out.println("Nhap vao so thu 2: ");
		int b = 10;

		int resultMinus = a - b;
		System.out.println("Hiệu 2 số: " + resultMinus);
	}

	// Phép nhân
	public static int multiply(int number1, int number2) {
		return number1 * number2;
	}
}
