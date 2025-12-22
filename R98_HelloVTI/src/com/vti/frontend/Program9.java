package com.vti.frontend;

import java.util.Scanner; // ✅ PHẢI CÓ

public class Program9 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số từ 1 đến 7:");
		int number = scanner.nextInt();

		if (number == 1) {
			System.out.println("Chủ nhật");
		} else if (number == 2) {
			System.out.println("Thứ 2");
		} else if (number == 3) {
			System.out.println("Thứ 3");
		} else if (number == 4) {
			System.out.println("Thứ 4");
		} else if (number == 5) {
			System.out.println("Thứ 5");
		} else if (number == 6) {
			System.out.println("Thứ 6");
		} else if (number == 7) {
			System.out.println("Thứ 7");
		} else {
			System.out.println("Số không hợp lệ");
		}

		/*
		 * // ================== CÁCH 2: TOÁN TỬ 3 NGÔI ================== String day =
		 * (number == 1) ? "Chủ nhật" : (number == 2) ? "Thứ 2" : (number == 3) ?
		 * "Thứ 3" : (number == 4) ? "Thứ 4" : (number == 5) ? "Thứ 5" : (number == 6) ?
		 * "Thứ 6" : (number == 7) ? "Thứ 7" : "Số không hợp lệ";
		 * 
		 * System.out.println(day);
		 * 
		 * scanner.close(); } }
		 */

//	}
//}
		// Dùng switch case thay if else
		int day = scanner.nextInt();
		switch (day) {
		case 1: // day ==1
			System.out.println("Chủ nhật");
			break;
		case 2: // day ==2
			System.out.println("Thứ 2");
			break;
		case 3: // day ==3
			System.out.println("Thứ 3");
			break;
		case 4: // day ==4
			System.out.println("Thứ 4");
			break;
		case 5: // day ==5
			System.out.println("Thứ 5");
			break;
		case 6: // day ==6
			System.out.println("Thứ 6");
			break;
		case 7: // day ==7
			System.out.println("Thứ 7");
			break;
		default:
			System.out.println("Số không hợp lệ");
			break;
		}
		scanner.close();
	}
}
