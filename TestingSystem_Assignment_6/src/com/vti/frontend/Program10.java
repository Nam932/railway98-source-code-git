package com.vti.frontend;

import com.vti.entity.Group;

//
//Question 10: làm giống bài 9
//Sử dụng ScannerUtils để nhập thông tin cho Group
//Khi tạo các property array accounts thì hỏi người dùng xem, bạn có
//muốn thêm accounts hay không, nếu người dùng đồng ý thì sẽ nhập
//thông tin account
//(với mỗi thông tin Account nhập vào ta sẽ tạo Object mới)
public class Program10 {
	public static void main(String[] args) {

		/*
		 * 1. Tạo mới đối tượng Group - Khi gọi new Group() - Constructor của class
		 * Group sẽ được chạy - Bên trong constructor: + Nhập id group + Nhập name group
		 * + Hỏi người dùng có muốn thêm accounts hay không + Nếu có -> tạo array
		 * accounts và nhập từng account
		 */
		Group group = new Group();

		/*
		 * 2. In thông tin cơ bản của Group - id và name đã được nhập trong constructor
		 */
		System.out.println("----- GROUP INFO -----");
		System.out.println("Group ID: " + group.id);
		System.out.println("Group Name: " + group.name);

		/*
		 * 3. Kiểm tra group có account hay không - Nếu người dùng chọn thêm account ->
		 * group.accounts khác null - Nếu không thêm -> group.accounts = null
		 */
		if (group.accounts != null) {

			System.out.println("Accounts in group:");

			/*
			 * 4. Duyệt qua mảng accounts - Mỗi phần tử trong mảng là 1 object Account - In
			 * ra username và email của từng account
			 */
			for (int i = 0; i < group.accounts.length; i++) {
				System.out.println((i + 1) + ". " + group.accounts[i].username + " - " + group.accounts[i].email);
			}

		} else {

			/*
			 * 5. Trường hợp người dùng KHÔNG muốn thêm account - accounts = null
			 */
			System.out.println("No accounts in this group.");
		}
	}
}