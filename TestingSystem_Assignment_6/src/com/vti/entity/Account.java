package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class Account {

	public int id;
	public String email;
	public String username;

	public Account() {

		System.out.print("Input account id: ");
		id = ScannerUtils.inputInt("Please input account id as int!");

		System.out.print("Input account email: ");
		email = ScannerUtils.inputString();

		System.out.print("Input account username: ");
		username = ScannerUtils.inputString();
	}
}
