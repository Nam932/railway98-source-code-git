package com.vti.frontend;

import java.time.LocalDate;
import java.util.Scanner;

public class TestingSystem2_5 {

	public static void main(String[] args) {
		// Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
		Scanner scanner = new Scanner(System.in);
		// ================= Question 1 =================
		// Nhập 3 số nguyên
		System.out.println("Question 1: Nhập 3 số nguyên");
		System.out.print("Nhập số nguyên thứ 1: ");
		int number1 = scanner.nextInt();

		System.out.print("Nhập số nguyên thứ 2: ");
		int number2 = scanner.nextInt();

		System.out.print("Nhập số nguyên thứ 3: ");
		int number3 = scanner.nextInt();

		System.out.println("Ba số nguyên bạn vừa nhập là: " + number1 + ", " + number2 + ", " + number3);

		// ================= Question 2 =================
		// Nhập 2 số thực
		System.out.println("\nQuestion 2: Nhập 2 số thực");

		System.out.print("Nhập số thực thứ 1: ");
		float float1 = scanner.nextFloat();

		System.out.print("Nhập số thực thứ 2: ");
		float float2 = scanner.nextFloat();

		System.out.println("Hai số thực bạn vừa nhập là: " + float1 + " và " + float2);

		// ================= Question 3 =================
		// Nhập họ và tên
		System.out.println("\nQuestion 3: Nhập họ và tên");

		// Xóa bộ nhớ đệm sau khi nhập số
		scanner.nextLine();

		System.out.print("Nhập họ và tên của bạn: ");
		String fullName = scanner.nextLine();

		System.out.println("Họ và tên của bạn là: " + fullName);

		// ================= Question 4 =================
		// Nhập ngày sinh
		System.out.println("\nQuestion 4: Nhập ngày sinh (yyyy-mm-dd)");

		System.out.print("Nhập ngày sinh của bạn: ");
		String birthdayInput = scanner.nextLine();

		// Chuyển String sang LocalDate
		LocalDate birthday = LocalDate.parse(birthdayInput);

		System.out.println("Ngày sinh của bạn là: " + birthday);

		// Đóng Scanner
		scanner.close();
	}
}
