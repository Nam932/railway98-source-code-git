package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.DocumentManager;

//Question 4 (Optional):
//Một thư viện cần quản lý các tài liệu bao gồm Sách, Tạp chí, Báo. Mỗi
//tài liệu gồm có các thuộc tính sau: Mã tài liệu(Mã tài liệu là duy nhất),
//Tên nhà xuất bản, số bản phát hành.
//Các loại sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
//Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
//Các báo cần quản lý thêm: Ngày phát hành.
//Xây dựng chương trình để quản lý tài liệu (QLTV) cho thư viện một
//cách hiệu quả.
//Xây dựng lớp QuanLySach có các chức năng sau
//a) Thêm mới tài liêu: Sách, tạp chí, báo.
//
//4
//b) Xoá tài liệu theo mã tài liệu.
//c) Hiện thị thông tin về tài liệu.
//d) Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.
//e) Thoát khỏi chương trình.

public class Program {
	public static void main(String[] args) {
		DocumentManager manager = new DocumentManager();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("------ DOCUMENT MANAGEMENT ------");
			System.out.println("1. Add document");
			System.out.println("2. Delete document");
			System.out.println("3. Display documents");
			System.out.println("4. Search by type");
			System.out.println("5. Exit");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				manager.addDocument();
				break;
			case 2:
				manager.deleteDocument();
				break;
			case 3:
				manager.displayAll();
				break;
			case 4:
				manager.searchByType();
				break;
			case 5:
				return;
			}
		}
	}
}
