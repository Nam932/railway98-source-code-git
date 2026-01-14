package com.vti.frontend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Department;

public class Program1 {
	public static void main(String[] args) {

		// 1. Khai báo thông tin DB
		String url = "jdbc:mysql://localhost:3306/testing_system?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String password = "root";

		try {
			// 2. Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 3. Tạo kết nối
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connect success!");

			// 4. Tạo Statement
			Statement statement = connection.createStatement();

			// 5. Viết câu SQL
			String sql = "SELECT * FROM Department ORDER BY DepartmentID";

			// 6. Thực thi SQL
			ResultSet resultSet = statement.executeQuery(sql);

			// 7. Chuyển ResultSet sang List
			List<Department> listDepartments = new ArrayList<>();

			while (resultSet.next()) {
				Department department = new Department();
				department.setId(resultSet.getInt("DepartmentID"));
				department.setName(resultSet.getString("DepartmentName"));
				listDepartments.add(department);
			}

			// 8. In kết quả
			System.out.println("DepartmentID     DepartmentName");
			for (Department department : listDepartments) {
				System.out.println(department);
			}

			// 9. Đóng kết nối
			resultSet.close();
			statement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
