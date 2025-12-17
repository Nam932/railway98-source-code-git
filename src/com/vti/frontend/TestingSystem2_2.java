package com.vti.frontend;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.vti.entity.Account;
import com.vti.entity.Department;

public class TestingSystem2_2 {

	public static void main(String[] args) {

		// ================= Question 1 =================
		// Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên
		// đó
		int number1 = 5; // Khai báo 1 số nguyên = 5
		System.out.printf("Question 1: %d%n", number1); // %d dùng để in số nguyên

		// ================= Question 2 =================
		// Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in ra
		// số nguyên đó thành định dạng như sau: 100,000,000
		int number2 = 100000000;

		// %,d dùng để format có dấu phẩy phân cách hàng nghìn
		System.out.printf("Question 2: %,d%n", number2);

		// ================= Question 3 =================
		// Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
		// thực đó chỉ bao gồm 4 số đằng sau
		double number3 = 5.567098;

		// %.4f in số thực với 4 chữ số sau dấu phẩy
		System.out.printf("Question 3: %.4f%n", number3);

		// ================= Question 4 =================
//        // Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
//        dạng như sau:
//        	Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//        	Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
		String fullName = "Nguyễn Văn A";

		System.out.printf(" Tên tôi là \"%s\" và tôi đang độc thân.%n", // %s dùng để in chuỗi
				fullName);

		// ================= Question 5 =================
		// Lấy thời gian bây giờ và in ra theo định dạng sau: 24/04/2020 11h:16p:20s
		LocalDateTime now = LocalDateTime.now();

		// Định dạng thời gian theo yêu cầu
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h':mm'p':ss's'");

		System.out.printf("Question 5: %s%n", now.format(formatter));

		// ================= Question 6 =================
		// Tạo dữ liệu mẫu (giống Question 8 FOREACH)
//        In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
//        table (giống trong Database)

		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Sale";

		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Marketing";

		Account acc1 = new Account();
		acc1.email = "NguyenVanA@gmail.com";
		acc1.fullName = "Nguyễn Văn A";
		acc1.department = dep1;

		Account acc2 = new Account();
		acc2.email = "NguyenVanB@gmail.com";
		acc2.fullName = "Nguyễn Văn B";
		acc2.department = dep2;

		Account[] accounts = { acc1, acc2 };

		// In header dạng bảng
		System.out.println("Question 6:");
		System.out.printf("%-25s %-20s %-15s%n", "Email", "Full Name", "Department");

		// In đường kẻ
		System.out.println("----------------------------------------------------------");

		// In dữ liệu từng account
		for (Account acc : accounts) {
			System.out.printf("%-25s %-20s %-15s%n", acc.email, acc.fullName, acc.department.name);
		}
	}
}