package com.vti.entity;

public class Student {
	// a) Các property private
	private int id;
	private String name;
	private String hometown;
	private double score;

	private static int autoIncrementId = 1; // để tự động cấp ID

	// b) Constructor: nhập name, hometown, score mặc định = 0
	public Student(String name, String hometown) {
		this.id = autoIncrementId++;
		this.name = name;
		this.hometown = hometown;
		this.score = 0;
	}

	// c) Method set điểm
	public void setScore(double score) {
		this.score = score;
	}

	// d) Method cộng thêm điểm
	public void addScore(double additionalScore) {
		this.score += additionalScore;
	}

	// e) Method in thông tin + học lực
	public void printInfo() {
		String academicLevel;

		if (score < 4.0) {
			academicLevel = "Yếu";
		} else if (score < 6.0) {
			academicLevel = "Trung bình";
		} else if (score < 8.0) {
			academicLevel = "Khá";
		} else {
			academicLevel = "Giỏi";
		}

		System.out.println("Student: " + name);
		System.out.println("Hometown: " + hometown);
		System.out.println("Score: " + score);
		System.out.println("Academic Level: " + academicLevel);
		System.out.println("-----------------------------");
	}
}
