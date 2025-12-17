package com.vti.frontend;

import java.util.Scanner;

public class TestingSystem3_4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Question 1
		System.out.println("Question 1: Nhập một xâu kí tự, đếm số lượng từ");
		System.out.print("Nhập xâu kí tự: ");
		String inputStr = scanner.nextLine();
		String[] wordsQ1 = inputStr.trim().split("\\s+");
		System.out.println("Số lượng từ trong xâu là: " + wordsQ1.length);
		System.out.println();

		// Question 2
		System.out.println("Question 2: Nhập hai xâu kí tự và nối chúng lại");
		System.out.print("Nhập xâu s1: ");
		String s1 = scanner.nextLine();
		System.out.print("Nhập xâu s2: ");
		String s2 = scanner.nextLine();
		String concatenated = s1 + s2;
		System.out.println("Kết quả sau khi nối: " + concatenated);
		System.out.println();

		// Question 3
		System.out.println("Question 3: Viết hoa chữ cái đầu của tên");
		System.out.print("Nhập tên: ");
		String name = scanner.nextLine();
		if (name.length() > 0) {
			String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1);
			System.out.println("Tên sau khi viết hoa chữ cái đầu: " + formattedName);
		} else {
			System.out.println("Bạn chưa nhập tên!");
		}
		System.out.println();

		// Question 4
		System.out.println("Question 4: In từng ký tự trong tên");
		System.out.print("Nhập tên: ");
		String name2 = scanner.nextLine();
		for (int i = 0; i < name2.length(); i++) {
			System.out.println("Ký tự thứ " + (i + 1) + " là: " + name2.charAt(i));
		}
		System.out.println();

		// Question 5
		System.out.println("Question 5: Nhập họ và tên riêng, in ra họ và tên đầy đủ");
		System.out.print("Nhập họ: ");
		String lastName = scanner.nextLine();
		System.out.print("Nhập tên: ");
		String firstName = scanner.nextLine();
		String fullName = lastName + " " + firstName;
		System.out.println("Họ và tên đầy đủ: " + fullName);
		System.out.println();

		// Question 6
		System.out.println("Question 6: Nhập họ và tên đầy đủ, tách ra Họ, Tên đệm, Tên");
		System.out.print("Nhập họ và tên đầy đủ: ");
		String fullName2 = scanner.nextLine().trim();
		String[] nameParts = fullName2.split("\\s+");
		String lastName2 = nameParts[0];
		String firstName2 = nameParts[nameParts.length - 1];
		String middleName = "";
		if (nameParts.length > 2) {
			for (int i = 1; i < nameParts.length - 1; i++) {
				middleName += nameParts[i] + " ";
			}
			middleName = middleName.trim();
		}
		System.out.println("Họ là: " + lastName2);
		System.out.println("Tên đệm là: " + middleName);
		System.out.println("Tên là: " + firstName2);
		System.out.println();

		// Question 7
		System.out.println("Question 7: Chuẩn hóa họ và tên");
		System.out.print("Nhập họ và tên: ");
		String nameInput = scanner.nextLine();
		String nameTrimmed = nameInput.trim().replaceAll("\\s+", " ");
		String[] wordsInName = nameTrimmed.split(" ");
		StringBuilder nameFormatted = new StringBuilder();
		for (String word : wordsInName) {
			nameFormatted.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase())
					.append(" ");
		}
		String finalName = nameFormatted.toString().trim();
		System.out.println("Tên chuẩn hóa: " + finalName);
		System.out.println();

		// Question 8
		System.out.println("Question 8: In ra tất cả group chứa chữ 'Java'");
		String[] groups = { "Java Beginners", "Java Advanced", "Python Basics", "JavaScript" };
		for (String group : groups) {
			if (group.contains("Java")) {
				System.out.println(group);
			}
		}
		System.out.println();

		// Question 9
		System.out.println("Question 9: In ra tất cả group có tên chính xác là 'Java'");
		String[] groups2 = { "Java", "Java Advanced", "Python", "Java" };
		for (String group : groups2) {
			if (group.equals("Java")) {
				System.out.println(group);
			}
		}

		// Đóng scanner
		scanner.close();
	}
}
