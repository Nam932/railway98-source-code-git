package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;

public class TestingSystem2_1 {
	public static void main(String[] args) {

		// ================== DEPARTMENT ==================
		// Tạo ra các đối tượng Department (phòng ban)
		Department department1 = new Department();
		department1.id = 1; // ID phòng ban
		department1.name = "Maketting"; // Tên phòng ban

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Sale";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "BOD";

		// ================== POSITION ==================
		// Tạo ra các đối tượng Position (chức vụ)
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.Dev; // Enum PositionName

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.PM;

		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.Scrum_Master;

		// ================== ACCOUNT ==================
		// Tạo ra các đối tượng Account (nhân viên)
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "daonq1@gmail.com";
		account1.userName = "daonq1";
		account1.fullName = "Nguyễn Đạo 1";
		account1.department = department2; // Gán phòng ban
		account1.position = position2; // Gán chức vụ
		account1.CreateDate = LocalDate.now(); // Ngày tạo = hôm nay

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "daonq2@gmail.com";
		account2.userName = "daonq2";
		account2.fullName = "Nguyễn Đạo 2";
		account2.department = department1;
		account2.position = position3;
		account2.CreateDate = LocalDate.now(); // ⚠ BUG: đang gán nhầm cho account1

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "daonq3@gmail.com";
		account3.userName = "daonq3";
		account3.fullName = "Nguyễn Đạo 3";
		account3.department = department1;
		account3.position = position3;
		account3.CreateDate = LocalDate.of(2020, 9, 23);

		// ================== GROUP ==================
		// Tạo ra các đối tượng Group (nhóm)
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Football";
		group1.creator = account1; // Người tạo group
		group1.createDate = LocalDate.of(2020, 9, 23);
		group1.accounts = new Account[] { account1, account2, account3 };

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Trainee";
		group2.creator = account3;
		group2.createDate = LocalDate.now();
		account2.groups = new Group[] { group1, group2 };

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Mentor";
		group3.creator = account3;
		group3.createDate = LocalDate.of(2024, 10, 20);

		// ================== ACCOUNT - GROUP ==================
		// Khai báo các group mà account tham gia (quan hệ many-to-many)

		Group[] groups_Account1 = { group1, group2 };
		account1.groups = groups_Account1;

		Group[] groups_Account2 = { group1, group2, group3 };
		account2.groups = groups_Account1; // ⚠ BUG: phải là groups_Account2

		Group[] groups_Account3 = { group2 };
		account3.groups = groups_Account1; // ⚠ BUG: phải là groups_Account3

		// ================== OUTPUT ==================
//		// Hiển thị thông tin phòng ban trên hệ thống
		System.out.println("--------Department----------");
		System.out.println("Department1: " + department1.id + "  " + department1.name);
		System.out.println("Department2: " + department2.id + "  " + department2.name);
		System.out.println("Department3: " + department3.id + "  " + department3.name);

		// ================== ARRAY ==================
		Account[] accounts = { account1, account2, account3 };
		Department[] departments = { department1, department2, department3 };

		// ================== Question 8 (FOREACH) ==================
		// In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ

		for (Account acc : accounts) {
			System.out.println("Email: " + acc.email);
			System.out.println("Full name: " + acc.fullName);
			System.out.println("Phòng ban: " + acc.department.name);
			System.out.println("----------------------------");
		}

		// ================== Question 9 (FOREACH) ==================
//				
		for (Department dep : departments) {
			System.out.println("ID: " + dep.id);
			System.out.println("Name: " + dep.name);
			System.out.println("----------------------------");
		}

		// ================== Question 10 (FOR) ==================
		// Question 10:
		// Dùng vòng lặp for để duyệt qua từng phần tử trong mảng accounts
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là:"); // In ra thứ tự account (i bắt đầu từ 0 nên
																				// phải +1)
			// In ra email của account hiện tại
			System.out.println("Email: " + accounts[i].email);
			// In ra họ tên đầy đủ của account
			System.out.println("Full name: " + accounts[i].fullName);
			// In ra tên phòng ban của account
			System.out.println("Phòng ban: " + accounts[i].department.name);
			System.out.println();
		}

		// ================== Question 11 ==================

//		In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//			Thông tin department thứ 1 là:
//			Id: 1
//			Name: Sale
//			Thông tin department thứ 2 là:
//			Id: 2
//			Name: Marketing

		for (int i = 0; i < departments.length; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là:"); // In ra thứ tự department (bắt đầu từ
																				// 1)
			System.out.println("Id: " + departments[i].id); // In ra id của department
			System.out.println("Name: " + departments[i].name); // In ra tên department
			System.out.println();
		}

		// ================== Question 12 ==================

// Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
		// Chỉ in 2 phần tử đầu tiên nên i < 2
		for (int i = 0; i < 2; i++) {

			System.out.println("Thông tin department thứ " + (i + 1) + " là:");
			System.out.println("Id: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			System.out.println();
		}

		// ================== Question 13 ==================

// In ra thông tin tất cả các account ngoại trừ account thứ 2		
		// Duyệt toàn bộ account
		for (int i = 0; i < accounts.length; i++) {

			// Bỏ qua account thứ 2 (index = 1)
			if (i == 1) {
				continue; // nhảy sang vòng lặp tiếp theo
			}

			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full name: " + accounts[i].fullName);
			System.out.println("Phòng ban: " + accounts[i].department.name);
			System.out.println();
		}

		// ================== Question 14 ==================
		// Duyệt qua từng account
		for (int i = 0; i < accounts.length; i++) {

			// Kiểm tra điều kiện id < 4
			if (accounts[i].id < 4) {
				System.out.println("Email: " + accounts[i].email);
				System.out.println("Full name: " + accounts[i].fullName);
				System.out.println("Phòng ban: " + accounts[i].department.name);
				System.out.println();
			}
		}

		// ================== Question 15 ==================
		// Question 15:
		// Duyệt các số từ 0 đến 20
		for (int i = 0; i <= 20; i++) {

			// Kiểm tra số chẵn (chia 2 dư 0)
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// ================== Question 16 ==================
//		Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//		lệnh break, continue	

		// Q10
		int i = 0; // khởi tạo biến đếm

		while (i < accounts.length) {

			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full name: " + accounts[i].fullName);
			System.out.println("Phòng ban: " + accounts[i].department.name);
			System.out.println();

			i++; //
//		    

			// Q13 (WHILE + continue)
			int j = 0;

			while (j < accounts.length) {

				// Nếu là account thứ 2 thì bỏ qua
				if (j == 1) {
					j++; // phải tăng j trước
					continue; // bỏ qua vòng lặp này
				}

				System.out.println("Email: " + accounts[j].email);
				System.out.println("Full name: " + accounts[j].fullName);
				System.out.println("Phòng ban: " + accounts[j].department.name);
				System.out.println();

				j++;
			}

			// Q14 (WHILE)
			int k = 0;

			while (k < accounts.length) {

				// Chỉ in account có id < 4
				if (accounts[k].id < 4) {
					System.out.println("Email: " + accounts[k].email);
					System.out.println("Full name: " + accounts[k].fullName);
					System.out.println("Phòng ban: " + accounts[k].department.name);
					System.out.println();
				}

				k++;
			}

			// Q15 (WHILE + break)
			int n = 0;

			while (true) {

				// Nếu n > 20 thì dừng vòng lặp
				if (n > 20) {
					break;
				}

				// In số chẵn
				if (n % 2 == 0) {
					System.out.println(n);
				}

				n++;
			}

			// ================== Question 17 ==================

			// Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với lệnh
			// break, continue

			// Q10 (DO-WHILE)
			int a = 0;

			do {
				System.out.println("Thông tin account thứ " + (a + 1) + " là:");
				System.out.println("Email: " + accounts[a].email);
				System.out.println("Full name: " + accounts[a].fullName);
				System.out.println("Phòng ban: " + accounts[a].department.name);
				System.out.println();

				a++;
			} while (a < accounts.length);

			// Q13 (DO-WHILE + continue)
			int b = 0;

			do {
				if (b == 1) {
					b++;
					continue;
				}

				System.out.println("Email: " + accounts[b].email);
				System.out.println("Full name: " + accounts[b].fullName);
				System.out.println("Phòng ban: " + accounts[b].department.name);
				System.out.println();

				b++;
			} while (b < accounts.length);

			// Q15 (DO-WHILE + break)
			int c = 0;

			do {
				if (c > 20) {
					break;
				}

				if (c % 2 == 0) {
					System.out.println(c);
				}

				c++;
			} while (true);

		}
	}
}
