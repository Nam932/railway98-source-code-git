package com.vti.frontend;

import java.util.Scanner;

import com.vti.utils.ScannerUtils;

public class Program12 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		System.out.println("Mời bạn nhập vào 1 số nguyên");
		System.out.println("Mời bạn nhập vào 1 số thực");
//		int a = scanner.nextInt(); // Một
		double a = ScannerUtils.inputDouble();
		System.out.println("Số bạn vừa nhập là : " + a);
	}
}