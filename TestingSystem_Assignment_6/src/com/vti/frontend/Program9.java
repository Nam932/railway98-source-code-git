package com.vti.frontend;

import com.vti.entity.Department;
import com.vti.entity.Position;

//Sử dụng ScannerUtils vừa tạo để nhập thông tin cho Department,
//Position với điều kiện khi khởi tạo object sẽ yêu cầu nhập vào thông
//tin luôn trong constructor (VD như hình dưới)
public class Program9 {
	public static void main(String[] args) {

		Department department = new Department();
		Position position = new Position();

		System.out.println("Department: " + department.id + " - " + department.name);
		System.out.println("Position: " + position.id + " - " + position.name);
	}
}
