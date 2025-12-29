package com.vti.backend;

import java.util.Scanner;

public class Excercise2 {

	// Dùng chung Scanner cho cả class
	private static Scanner scanner = new Scanner(System.in);

	// =========================
	// Method chia 2 số
	// =========================
	public static float divide(int a, int b) {

		try {
			return a / b;

		} catch (ArithmeticException e) {
			System.out.println("cannot divide 0");
			return 0;

		} finally {
			// Luôn chạy
			System.out.println("divide completed!");
		}
	}

	// =========================
	// Method lấy department theo index
	// =========================
	public static String getDepartment(int index) {

		String[] departments = { "Sale", "Marketing", "IT" };

		try {
			return departments[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			return "Cannot find department.";
		}
	}

	// =========================
	// Question 5 + 6 (đã tối ưu)
//	Question 5:
//		Tạo 1 method inputAge() và trả về 1 số int.
//		Trong method hãy cài đặt như sau:
//		B1: Sau đó dùng scanner để nhập vào 1 số
//
//		3
//		B2: Check exeption
//		Nếu người dùng nhập vào 1 số thì return về số đó
//		Nếu người dùng không nhập vào 1 số thì sẽ in ra dòng
//		text "wrong inputing! Please input an age as int, input
//		again."
//		Nếu người dùng không nhập vào 1 số < 0 thì sẽ in ra
//		dòng text "Wrong inputing! The age must be greater
//		than 0, please input again."
//		B3: hãy demo trong method main()
//		Gợi ý:
//		o Tại bước 1 & bước 2: Check exception, ta có thể yêu cầu người
//		dùng nhập vào String (scanner.nextLine()),
//		o Sau đó sử dụng casting datatype để convert String to int
//		o Nếu convert được thì suy ra người dùng nhập vào 1 số
//		int
//		o Nếu không convert được thì suy ra người dùng nhập sai,
//		khi người dùng nhập sai thì sẽ in ra text "wrong
//		inputing! Please input an age as int, input again."
//	Question 6: Tiếp tục Question 5
//	Sửa lại method inputAge() như sau:
//	Tại B2 của Question 5, Nếu người dùng không nhập vào 1 số thì sẽ in
//	ra dòng text "wrong inputing! Please input an age as int, input again.",
//	đồng thời yêu cầu người dùng nhập lại
//	Gợi ý: sử dụng while
	// =========================
	public static int inputAge() {

		while (true) {
			System.out.print("Please input your age: ");
			String input = scanner.nextLine();

			try {
				int age = Integer.parseInt(input);

				if (age < 0) {
					System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
					continue;
				}

				// Nhập đúng → thoát
				return age;

			} catch (NumberFormatException e) {
				System.out.println("wrong inputing! Please input an age as int, input again.");
			}
		}
	}
}
