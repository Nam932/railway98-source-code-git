package com.vti.frontend;

import com.vti.backend.Excercise2;

//Question 4:
//Tạo 1 array departments gồm 3 phần tử
//Sau đó viết 1 method getIndex(int index) để lấy thông tin phần tử thứ
//index trong array departments. Nếu index vượt quá length lấy ra thì sẽ
//in ra text "Cannot find department."
public class Program4 {
	public static void main(String[] args) {

		System.out.println(Excercise2.divide(7, 0));
		System.out.println("-----");
		System.out.println(Excercise2.divide(8, 2));

		System.out.println("-----");
		System.out.println(Excercise2.getDepartment(1));
		System.out.println(Excercise2.getDepartment(5));
	}
}
