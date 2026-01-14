package com.vti.frontend;

import com.vti.backend.Excercise2;

public class Program2 {
	public static void main(String[] args) {
//		Question 2 (Optional): Stack & Queue
//		Khai báo 1 danh sách lưu các tên học sinh tới tham dự phỏng vấn, thứ
//		tự tới của các học sinh như sau:
//		Nguyễn Văn Nam, Nguyễn Văn Huyên, Trần Văn Nam,
//		Nguyễn Văn A
//		a) Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự
//		sớm nhất tới muộn nhất (gợi ý dùng Stack)
//		b) Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự từ
//		muộn nhất tới sớm nhất (gợi ý dùng Queue)
		Excercise2 ex2 = new Excercise2();

		ex2.printOrderByStack();
		System.out.println("------------");
		ex2.printOrderByQueue();
	}
}
