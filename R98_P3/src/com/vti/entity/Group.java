package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class Group {

	public int id;
	public String name;
	public Account[] accounts;

	public Group() {

		// Nhập thông tin group
		System.out.print("Input group id: ");
		id = ScannerUtils.inputInt("Please input group id as int!");

		System.out.print("Input group name: ");
		name = ScannerUtils.inputString();

		// Hỏi có muốn thêm account không
		System.out.print("Do you want to add accounts? (Y/N): ");
		String choice = ScannerUtils.inputString();

		// Check người dùng có đồng ý không
		if (choice.equalsIgnoreCase("Y")) {

			System.out.print("How many accounts do you want to add? ");
			int n = ScannerUtils.inputInt("Please input number as int!");

			// Khởi tạo array accounts
			accounts = new Account[n];

			// Nhập từng account
			for (int i = 0; i < n; i++) {
				System.out.println("Input account " + (i + 1) + ":");
				accounts[i] = new Account();
			}

		} else {
			// Người dùng không muốn thêm account
			accounts = null;
		}
	}
}
