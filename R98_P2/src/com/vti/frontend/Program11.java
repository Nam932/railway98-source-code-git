package com.vti.frontend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		int age = inputAge();
		System.out.println("Your age: " + age);
	}

	public static int inputAge() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Nhap so nguyen duong:");
				int age = scanner.nextInt();

				if (age >= 0) {
					return age;
				} else {
					System.out.println("So phai >= 0, vui long nhap lai!");
				}

			} catch (InputMismatchException e) {
				System.out.println("Khong dung dinh dang so, vui long nhap lai!");
				scanner.nextLine(); // ⭐ FIX vòng lặp vô tận
			}
		}
	}
}
