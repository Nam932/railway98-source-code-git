package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.StaffManagement;

// Dựng chương trình cho người dùng nhập số lựa chọn
// Dùng while(true) để lặp menu
public class Project {
	public static void main(String[] args) {

		StaffManagement staffManagement = new StaffManagement();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("=============================================================");
			System.out.println("=========== Lựa chọn chức năng bạn muốn sử dụng =============");
			System.out.println("===        1. Thêm mới cán bộ.                        =======");
			System.out.println("===        2. Tìm kiếm theo họ tên.                   =======");
			System.out.println("===        3. Hiển thị thông tin về danh sách các cán bộ. ===");
			System.out.println("===        4. Nhập vào tên của cán bộ và delete cán bộ đó ===");
			System.out.println("===        5. Thoát khỏi chương trình.                =======");
			System.out.println("=============================================================");

			int menuChoose = scanner.nextInt();

			switch (menuChoose) {
			case 1:
				staffManagement.addNewStaff();
				break;

			case 2:
				staffManagement.findByName();
				break;

			case 3:
				staffManagement.showListStaff();
				break;

			case 4:
				staffManagement.deleteStaffByName();
				break;

			case 5:
				System.out.println("Thoát chương trình!");
				return;

			default:
				System.out.println("Vui lòng nhập số từ 1 đến 5!");
				break;
			}
		}
	}
}
