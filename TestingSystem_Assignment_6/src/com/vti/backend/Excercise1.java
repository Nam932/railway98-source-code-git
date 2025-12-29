package com.vti.backend;

public class Excercise1 {

	// Method tìm giá trị lớn nhất
	public static int getMaxValue(int[] numbers) {

		// Giả sử phần tử đầu tiên là max
		int maxValue = numbers[0];

		// Duyệt từ phần tử thứ 2 đến hết mảng
		for (int i = 1; i < numbers.length; i++) {

			/*
			 * DEBUG: - Đặt breakpoint tại dòng if - Quan sát: + i đang bằng bao nhiêu +
			 * numbers[i] là giá trị nào + maxValue thay đổi ra sao
			 */
			if (numbers[i] > maxValue) {
				maxValue = numbers[i];
			}
		}

		// Trả về giá trị lớn nhất
		return maxValue;
	}

	// Method tìm giá trị nhỏ nhất
	public static int getMinValue(int[] numbers) {

		// Giả sử phần tử đầu tiên là min
		int minValue = numbers[0];

		// Duyệt toàn bộ mảng (KHÔNG trừ 1)
		for (int i = 1; i < numbers.length; i++) {

			/*
			 * DEBUG: - Nếu dùng numbers.length - 1 => bỏ qua phần tử cuối (-8) - Đây chính
			 * là bug của bài
			 */
			if (numbers[i] < minValue) {
				minValue = numbers[i];
			}
		}

		// Trả về giá trị nhỏ nhất
		return minValue;
	}
}

// ====================================================================================================================
//Question 2: Trong bài tập Assignment 4 (File
//Testing_System_Assignment_4_Debug.rar, giải nén ra và import vào eclipse),
//có 1 học viên đã làm như trong project, nhưng khi chạy chương trình học viên
//đó phát hiện chương trình đã chạy sai, cụ thể như sau:
//B1: Học viên chọn nhập chức năng thêm mới cán bộ
//B2: Chọn thêm 1 cán bộ vào
//B3: nhập thông tin cán bộ vào
//
//2
//
//Nhưng học viên đã phát hiện ra hệ thống vẫn yêu cầu nhập thêm người
//nữa, hãy debug để tìm ra lỗi và sửa lỗi hộ bạn.
