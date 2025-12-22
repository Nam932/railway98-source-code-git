package com.vti.frontend;

import com.vti.entity.Student;

public class Program3 {
	public static void main(String[] args) {

		Student student1 = new Student();
		String name = "vti academy ";

		System.out.println("Name:" + name.toLowerCase());
		System.out.println("Ký tự tại vị trí thứ 2 :" + name.charAt(1));
		System.out.println("Tổng Ký tự tại chuỗi :" + name.length());
		System.out.println(name.equals("admin"));

		// Lấy ra kí tự tại vị trí thứ 2(t) và In hoa ký tự đó lên, nhưng sử dụng phương
		// thức của lớp String
		// Lấy ký tự tại vị trí thứ 2 và in hoa
		String upperChar = name.substring(1, 2).toUpperCase();
		System.out.println("Ký tự in hoa tại vị trí thứ 2: " + upperChar);

		student1.getName();
		System.out.println("ID : " + student1.getID());
		System.out.println("Name : " + student1.getName());

		student1.setID(100);
		System.out.println("ID : " + student1.getID());
		System.out.println("Name : " + student1.getName());

	}

}
