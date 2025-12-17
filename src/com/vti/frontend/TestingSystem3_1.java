package com.vti.frontend;

import java.util.Random;

public class TestingSystem3_1 {

	public static void main(String[] args) {

		// ================= Question 1 =================
//    	Khai báo 2 số lương có kiểu dữ liệu là float.
//    	Khởi tạo Lương của Account 1 là 5240.5 $
//    	Khởi tạo Lương của Account 2 là 10970.055$
//    	Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//    	Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra

		// Khai báo lương kiểu float
		float salary1 = 5240.5f;
		float salary2 = 10970.055f;

		// Chuyển sang int để làm tròn (bỏ phần thập phân)
		int roundedSalary1 = (int) salary1;
		int roundedSalary2 = (int) salary2;

		System.out.println("Question 1:");
		System.out.println("Lương Account 1 (làm tròn): " + roundedSalary1);
		System.out.println("Lương Account 2 (làm tròn): " + roundedSalary2);
		System.out.println();

		// ================= Question 2 =================

//        Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//        		có số 0 ở đầu cho đủ 5 chữ số)
		// Tạo số ngẫu nhiên có 5 chữ số
		Random random = new Random();

		// Sinh số từ 0 → 99999
		int randomNum = random.nextInt(100000);

		// Chuyển sang String và format đủ 5 chữ số
		String randomNumStr = String.format("%05d", randomNum);

		System.out.println("Question 2:");
		System.out.println("Số ngẫu nhiên có 5 chữ số: " + randomNumStr);
		System.out.println();

		// ================= Question 3 =================
//		Lấy 2 số cuối của số ở Question 2 và in ra.
//		 convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
		// Cách 1: Lấy 2 số cuối bằng substring
		String last2DigitsStr = randomNumStr.substring(3); // lấy từ index 3 đến hết
		System.out.println("Question 3 (cách 1): Hai số cuối là " + last2DigitsStr);

	}
}

// ================= Question 4 =================
