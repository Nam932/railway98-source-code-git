package com.vti.frontend;
// Khai báo package cho lớp Program6 (tầng frontend – nơi chạy chương trình)

import java.time.LocalDate;
// Import lớp LocalDate để làm việc với ngày tháng (không dùng Date cũ)

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;
// Import các class entity đã định nghĩa trước đó
// Entity đại diện cho các bảng trong hệ thống

public class Program6 {
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
		// Hiển thị thông tin phòng ban trên hệ thống
		System.out.println("--------Department----------");
		System.out.println("Department1: " + department1.id + "  " + department1.name);
		System.out.println("Department2: " + department2.id + "  " + department2.name);
		System.out.println("Department3: " + department3.id + "  " + department3.name);

		// Gọi phương thức toString() của Department
		System.out.println("toString(): " + department1.toString());

		// Question 1:
		// Kiểm tra account thứ 2
		// Nếu không có phòng ban thì in ra:
		// "Nhân viên này chưa có phòng ban"
		// Nếu có thì in ra:
		// "Phòng ban của nhân viên này là ..."

//		if (account2.department == null) {
//			System.out.println("Nhân viên này chưa có phòng ban");
//		} else {
//			System.out.println("Phòng ban của nhân viên này là: " + account2.department.name);
//		}

//		// Question 2: Kiểm tra group của account2
//		Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//		Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//		này là Java Fresher, C# Fresher"
//		Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//		quan trọng, tham gia nhiều group"
//		Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//		người hóng chuyện, tham gia tất cả các group"
//
//		if (account2.groups == null || account2.groups.length == 0) {
//
//			System.out.println("Nhân viên này chưa có group");
//
//		} else if (account2.groups.length == 1 || account2.groups.length == 2) {
//
//			System.out.print("Group của nhân viên này là: ");
//			for (int i = 0; i < account2.groups.length; i++) {
//				System.out.print(account2.groups[i].name);
//				if (i < account2.groups.length - 1) {
//					System.out.print(", ");
//				}
//			}
//			System.out.println();
//
//		} else if (account2.groups.length == 3) {
//
//			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
//
//		} else {
//
//			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
//		}

// Question 3 : Sử dụng toán tử ternary để làm Question 1
		String result = (account2.department == null) ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là: " + account2.department.name;

		System.out.println(result);

// Question 4 : 
//		Sử dụng toán tử ternary để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"		

		result = ("Dev".equals(account1.position.name)) ? "Đây là Developer" : "Người này không phải là Developer";
		System.out.println(result);

// Question 5:
//		Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//			Còn lại in ra "Nhóm có nhiều thành viên"
		int countAccount = group1.accounts.length;

		switch (countAccount) {
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");
			break;
		}
// Question 6: Sử dụng switch case để làm lại Question 2
		int groupCount = (account2.groups == null) ? 0 : account2.groups.length;

		switch (groupCount) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
		case 2:
			System.out.print("Group của nhân viên này là: ");
			for (Group group : account2.groups) {
				System.out.print(group.name + " ");
			}
			System.out.println();
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
		}

// Question 7 :Sử dụng switch case để làm lại Question 4
		switch (account1.position.name) {
		case Dev:
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}

	}
}
