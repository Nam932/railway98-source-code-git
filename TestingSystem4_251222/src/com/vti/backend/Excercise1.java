package com.vti.backend;

import java.util.Date;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;

public class Excercise1 {

	public static void main(String[] args) {
		question1();
		question2();
	}

	// ================= Question 1 =================
	public static void question1() {
		Department dep1 = new Department();
		Department dep2 = new Department("IT");

		System.out.println("Department 1 ID: " + dep1.getId());
		System.out.println("Department 2 Name: " + dep2.getName());
	}

	// ================= Question 2 =================
	public static void question2() {
		Position pos = new Position(1, "Developer");

		Account acc1 = new Account();
		Account acc2 = new Account(1, "a@gmail.com", "user1", "Nguyen", "A");
		Account acc3 = new Account(2, "b@gmail.com", "user2", "Tran", "B", pos);
		Account acc4 = new Account(3, "c@gmail.com", "user3", "Le", "C", pos, new Date());

		System.out.println("Account 2 FullName: " + acc2.getFullName());
		System.out.println("Account 3 CreateDate: " + acc3.getCreateDate());

		question3();
	}

	// ================= Question 3 =================
	public static void question3() {
		// Creator
		Account creator = new Account();
		creator.setUsername("admin");

		// a) Constructor không parameter
		Group group1 = new Group();

		// b) Constructor với Account[]
		Account acc1 = new Account();
		acc1.setUsername("user1");

		Account acc2 = new Account();
		acc2.setUsername("user2");

		Account[] accounts = { acc1, acc2 };
		Group group2 = new Group("Java Fresher", creator, accounts, new Date());

		// c) Constructor với String[]
		String[] usernames = { "user3", "user4", "user5" };
		Group group3 = new Group("Java Advanced", creator, usernames, new Date());

		// In thử
		System.out.println("Group 3 name: " + group3.getGroupName());
		System.out.println("Group 3 members:");
		for (Account acc : group3.getAccounts()) {
			System.out.println("- " + acc.getUsername());
		}
	}
}
