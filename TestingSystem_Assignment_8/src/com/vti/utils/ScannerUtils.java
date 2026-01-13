package com.vti.utils;

import java.util.Scanner;

/**
 * ScannerUtils
 *
 * Class tiện ích dùng để nhập dữ liệu từ bàn phím - Tất cả method đều là static
 * - Không cần tạo object ScannerUtils
 *
 * Cách dùng: ScannerUtils.inputInt();
 */
public class ScannerUtils {

	// Scanner dùng chung cho toàn bộ class
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Nhập số nguyên int - Bắt lỗi nếu user nhập sai
	 */
	public static int inputInt() {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số nguyên!");
			}
		}
	}

	/**
	 * Nhập số thực float
	 */
	public static float inputFloat() {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số thực!");
			}
		}
	}

	/**
	 * Nhập số thực double
	 */
	public static double inputDouble() {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số thực!");
			}
		}
	}

	/**
	 * Nhập chuỗi String (không cho phép rỗng)
	 */
	public static String inputString() {
		while (true) {
			String input = scanner.nextLine().trim();
			if (!input.isEmpty()) {
				return input;
			}
			System.out.println("Chuỗi không được để trống!");
		}
	}

	/**
	 * Nhập boolean (true / false)
	 */
	public static boolean inputBoolean() {
		while (true) {
			String input = scanner.nextLine().trim().toLowerCase();
			if (input.equals("true") || input.equals("false")) {
				return Boolean.parseBoolean(input);
			}
			System.out.println("Vui lòng nhập true hoặc false!");
		}
	}
}
