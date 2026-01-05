package com.vti.utils;

import java.util.Scanner;

public class ScannerUtils {

	private static Scanner scanner = new Scanner(System.in);

	// =========================
	// Input int
	// =========================
	public static int inputInt(String errorMessage) {

		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println(errorMessage);
			}
		}
	}

	// =========================
	// Input float
	// =========================
	public static float inputFloat(String errorMessage) {

		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println(errorMessage);
			}
		}
	}

	// =========================
	// Input double
	// =========================
	public static double inputDouble(String errorMessage) {

		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println(errorMessage);
			}
		}
	}

	// =========================
	// Input string (KHÔNG cần exception)
	// =========================
	public static String inputString() {
		return scanner.nextLine();
	}

}
