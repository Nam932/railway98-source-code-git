//package com.vti.frontend;
//
//import java.util.Scanner;
//
//public class Program8 {
//
//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//
//		// Nhập tên
//		System.out.println("Nhập tên của bạn:");
//		String name = scanner.nextLine();
//
//		// Nhập tuổi
//		System.out.println("Nhập tuổi của bạn:");
//		int age = scanner.nextInt();
//
//		// In thông tin
//		System.out.println("Tên của bạn là: " + name);
//		System.out.println("Tuổi của bạn là: " + age);
//
//		scanner.close();
//	}
//}

// Chữa 
package com.vti.frontend;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {

		// Tạo đối tượng Scanner
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập tên của bạn:");

		// Dùng scanner để nhập dữ liệu
		String name = scanner.nextLine();

		System.out.println("Tên của bạn là: " + name);

		// Đóng scanner
		scanner.close();
	}
}
