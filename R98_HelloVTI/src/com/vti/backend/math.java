package com.vti.frontend;

public class Program7 {

	public static void main(String[] args) {

		// Gọi các method
		sum();
		minus();

		int resultMultiply = multiply(5, 10);
		System.out.println("Tích 2 số: " + resultMultiply);
	}

	// ================== TÍNH TỔNG ==================
	public static void sum() {
		System.out.println("Nhap vao so thu 1: ");
		int a = 5;

		System.out.println("Nhap vao so thu 2: ");
		int b = 10;

		int result = a + b;
		System.out.println("Tổng 2 số: " + result);
	}

	// ================== TÍNH HIỆU ==================
	public static void minus() {
		System.out.println("Nhap vao so thu 1: ");
		int a = 5;

		System.out.println("Nhap vao so thu 2: ");
		int b = 10;

		int resultMinus = a - b;
		System.out.println("Hiệu 2 số: " + resultMinus);
	}

	// ================== PHÉP NHÂN ==================
	public static int multiply(int number1, int number2) {
		return number1 * number2;
	}
}
