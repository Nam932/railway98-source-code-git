package com.vti.frontend;

import com.vti.backend.Excercise1;

//Question 1: 1 học viên đã code bài min,max và có 1 vài lỗi sai như hình dưới
//(Code trong File DebugExercise.rar, hãy giải nén ra và import vào eclipse). Để
//tìm được ra bug, hãy thực hiện từng thao tác dưới đây để tìm ra lỗi và sửa nó
//a) Trong function getMaxValue, hãy tìm xem tại vòng lặp i = 4 thì
//variable maxValue đang có giá trị bao nhiêu
//b) Tại vòng lặp i = 4, hãy thử set lại maxValue = 5
//c) Hãy tìm bug và sửa lại cho bài trên để tìm Max Value và Min
//Value cho đúng
public class Program1 {
	public static void main(String[] args) {

		// Mảng test
		int[] numbers = { -1, 1, 3, 5, -5, -8 };

		/*
		 * DEBUG: - Đặt breakpoint tại đây - Step Into để đi vào hàm getMaxValue()
		 */
		int maxValue = Excercise1.getMaxValue(numbers);

		/*
		 * DEBUG: - Step Into để đi vào hàm getMinValue()
		 */
		int minValue = Excercise1.getMinValue(numbers);

		// In kết quả
		System.out.println("Max Value: " + maxValue);
		System.out.println("Min Value: " + minValue);
	}
}
