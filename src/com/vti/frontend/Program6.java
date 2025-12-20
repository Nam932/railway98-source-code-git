package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;

public class Program6 {
	public static void main(String[] args) {

		// ================== DEPARTMENT ==================
		Department department1 = new Department();
		department1.setId(1);
		department1.setName("Marketing");

		Department department2 = new Department();
		department2.setId(2);
		department2.setName("Sale");

		Department department3 = new Department();
		department3.setId(3);
		department3.setName("BOD");

		// ================== POSITION ==================
		Position position1 = new Position();
		position1.setId(1);
		position1.setName(PositionName.Dev);

		Position position2 = new Position();
		position2.setId(2);
		position2.setName(PositionName.PM);

		Position position3 = new Position();
		position3.setId(3);
		position3.setName(PositionName.Scrum_Master);

		// ================== ACCOUNT ==================
		Account account1 = new Account();
		account1.setId(1);
		account1.setEmail("daonq1@gmail.com");
		account1.setUsername("daonq1");
		account1.setFullName("Nguyễn Đạo 1");
		account1.setDepartment(department2);
		account1.setPosition(position2);
		account1.setCreateDate(LocalDate.now());

		Account account2 = new Account();
		account2.setId(2);
		account2.setEmail("daonq2@gmail.com");
		account2.setUsername("daonq2");
		account2.setFullName("Nguyễn Đạo 2");
		account2.setDepartment(department1);
		account2.setPosition(position3);
		account2.setCreateDate(LocalDate.now());

		Account account3 = new Account();
		account3.setId(3);
		account3.setEmail("daonq3@gmail.com");
		account3.setUsername("daonq3");
		account3.setFullName("Nguyễn Đạo 3");
		account3.setDepartment(department1);
		account3.setPosition(position3);
		account3.setCreateDate(LocalDate.of(2020, 9, 23));

		// ================== GROUP ==================
		Group group1 = new Group();
		group1.setId(1);
		group1.setGroupName("Football");
		group1.setCreator(account1);
		group1.setCreateDate(LocalDate.of(2020, 9, 23));
		group1.setAccounts(new Account[] { account1, account2, account3 });

		Group group2 = new Group();
		group2.setId(2);
		group2.setGroupName("Trainee");
		group2.setCreator(account3);
		group2.setCreateDate(LocalDate.now());

		Group group3 = new Group();
		group3.setId(3);
		group3.setGroupName("Mentor");
		group3.setCreator(account3);
		group3.setCreateDate(LocalDate.of(2024, 10, 20));

		// ================== ACCOUNT - GROUP ==================
		account1.setGroups(new Group[] { group1, group2 });
		account2.setGroups(new Group[] { group1, group2, group3 });
		account3.setGroups(new Group[] { group2 });

		// ================== OUTPUT ==================
		System.out.println("--------Department----------");
		System.out.println("Department1: " + department1.getId() + " " + department1.getName());
		System.out.println("Department2: " + department2.getId() + " " + department2.getName());
		System.out.println("Department3: " + department3.getId() + " " + department3.getName());

		// Question 1
		System.out.println(account2.getDepartment() == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là: " + account2.getDepartment().getName());

		// Question 4
		System.out.println(account1.getPosition().getName() == PositionName.Dev ? "Đây là Developer"
				: "Người này không phải là Developer");

		// Question 5
		int countAccount = group1.getAccounts().length;
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
		}

		// Question 6
		int groupCount = account2.getGroups() == null ? 0 : account2.getGroups().length;
		switch (groupCount) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
		case 2:
			System.out.print("Group của nhân viên này là: ");
			for (Group g : account2.getGroups()) {
				System.out.print(g.getGroupName() + " ");
			}
			System.out.println();
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

		// Question 7
		switch (account1.getPosition().getName()) {
		case Dev:
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
		}
	}
}
