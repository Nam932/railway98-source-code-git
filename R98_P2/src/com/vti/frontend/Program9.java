package com.vti.frontend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Code1");
		System.out.println("Code2");
		System.out.println("Code3");
		System.out.println("Code4");
		System.out.println("Code5");

		try {
			System.out.println("Mời bạn nhập số thứ 1: ");
			int number1 = scanner.nextInt();

			System.out.println("Mời bạn nhập số thứ 2: ");
			int number2 = scanner.nextInt();

			// ArithmeticException
			float result_division = number1 / number2;
			System.out.println("Kết quả phép tính là: " + result_division);

			// NullPointerException
			String myName = null;
			System.out.println("Số ký tự trong tên của bạn là: " + myName.length());

		} catch (ArithmeticException e) {
			System.out.println("Không thể thực hiện phép chia cho số 0");

		} catch (InputMismatchException e) {
			System.out.println("Dữ liệu bạn nhập vào không chính xác");

		} catch (NullPointerException e) {
			System.out.println("Dữ liệu bị rỗng, hãy kiểm tra lại");

		} finally { // Cuối cùng , gọi trong cả trường hợp có / ko có exception
			System.out.println("Đã hoàn thành code 5");
		}

		System.out.println("Code6");
		System.out.println("Code7");
		System.out.println("Code8");

		scanner.close();
	}
}
