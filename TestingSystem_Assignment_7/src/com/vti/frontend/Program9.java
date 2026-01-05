package com.vti.frontend;

import com.vti.utils.ScannerUtils;

// Question 9:
//Thay đổi các method ở class ScannerUtils ở Assignment 6 thành static
//để tiện dùng hơn
public class Program9 {
	public static void main(String[] args) {

		System.out.print("Nhập tuổi: ");
		int age = ScannerUtils.inputInt();

		System.out.print("Nhập tên: ");
		String name = ScannerUtils.inputString();

		System.out.println("Tên: " + name);
		System.out.println("Tuổi: " + age);
	}
}
