package com.vti.frontend;

//Question 3 : Hãy xử lý exception cho VD trên và in ra thông tin lỗi.
public class Program3 {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3 };

		try {
			// Lỗi: index 10 không tồn tại
			System.out.println(numbers[10]);
		} catch (ArrayIndexOutOfBoundsException e) {

			/*
			 * In ra thông tin lỗi e.getMessage() cho biết index sai
			 */
			System.out.println("Error: " + e.getMessage());
		}
	}
}
