package com.vti.frontend;

public class TestingSystem3_3 {

	public static void main(String[] args) {

		// ================= Question 1 =================
// Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//    	Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
//    			float có 2 số sau dấu thập phân)
		System.out.println("Question 1:");

		// Khởi tạo lương kiểu Integer
		Integer salaryInt = 5000;

		// Convert sang float
		float salaryFloat = salaryInt.floatValue();

		// In ra lương với 2 số sau dấu thập phân
		System.out.printf("Lương (float) = %.2f%n", salaryFloat);
		System.out.println();

		// ================= Question 2 =================
//        Khai báo 1 String có value = "1234567"
//        		Hãy convert String đó ra số int
		System.out.println("Question 2:");

		// Khai báo String
		String strNumber = "1234567";

		// Convert String sang int
		int numberFromString = Integer.parseInt(strNumber);

		System.out.println("Số nguyên từ String = " + numberFromString);
		System.out.println();

		// ================= Question 3 =================
//        Khởi tạo 1 số Integer có value là chữ "1234567"
//        Sau đó convert số trên thành datatype int
		System.out.println("Question 3:");

		// Khởi tạo Integer từ String
		Integer intFromString = Integer.valueOf("1234567");

		// Convert Integer sang int
		int intPrimitive = intFromString.intValue();

		System.out.println("Giá trị int = " + intPrimitive);
	}
}
