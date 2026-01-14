package com.vti.frontend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Program1 {

	// Thông tin kết nối DB
	static String url = "jdbc:mysql://localhost:3306/testing_system?useSSL=false&serverTimezone=UTC";
	static String user = "root";
	static String password = "root";

	public static void main(String[] args) {
		try {
			// Question 1: Kết nối DB
			Connection connection = connectDatabase();

			// Question 2: In danh sách position
			getAllPositions(connection);

			// Question 3: Tạo position mới
			createPosition(connection);

			// Question 4: Update position id = 5 thành "Dev"
			updatePosition(connection);

			// Question 5: Xoá position theo id
			deletePositionById(connection);

			// Đóng kết nối
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ================= QUESTION 1 =================
	// Tạo connection tới database
	public static Connection connectDatabase() throws Exception {
		// Load MySQL Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Tạo kết nối
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println("Connect success!");
		return connection;
	}

	// ================= QUESTION 2 =================
	// In ra id và name của position
	public static void getAllPositions(Connection connection) throws Exception {
		String sql = "SELECT * FROM Position";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		System.out.println("PositionID | PositionName");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt("PositionID") + " | " + resultSet.getString("PositionName"));
		}

		resultSet.close();
		statement.close();
	}

	// ================= QUESTION 3 =================
	// Tạo position mới, user nhập name
	public static void createPosition(Connection connection) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên position: ");
		String name = scanner.nextLine();

		String sql = "INSERT INTO Position(PositionName) VALUES (?)";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, name);

		ps.executeUpdate();
		System.out.println("Tạo position thành công!");

		ps.close();
	}

	// ================= QUESTION 4 =================
	// Update position có id = 5 thành "Dev"
	public static void updatePosition(Connection connection) throws Exception {
		String sql = "UPDATE Position SET PositionName = 'Dev' WHERE PositionID = 5";
		Statement statement = connection.createStatement();

		statement.executeUpdate(sql);
		System.out.println("Update position id = 5 thành Dev!");

		statement.close();
	}

	// ================= QUESTION 5 =================
	// Xoá position theo id (user nhập)
	public static void deletePositionById(Connection connection) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập ID position cần xoá: ");
		int id = scanner.nextInt();

		String sql = "DELETE FROM Position WHERE PositionID = ?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, id);

		ps.executeUpdate();
		System.out.println("Xoá position thành công!");

		ps.close();
	}
}
