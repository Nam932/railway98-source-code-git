package com.vti.frontend;

//Question 2: tiếp tục question 1
//Bổ sung thuộc tính moneyGroup cho Student (moneyGroup là tiền quỹ
//lớp - dùng chung cho tất cả các student).
//Hãy viết chương trình main() để mô tả các bước sau:
//B1: Các Student sẽ nộp quỹ, mỗi Student 100k
//B2: Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan
//B3: Student thứ 2 lấy 20k đi mua bánh mì
//B4: Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm
//B5: cả nhóm mỗi người lại đóng quỹ mỗi người 50k
//In ra số tiền còn của nhóm tại mỗi bước

import com.vti.entity.Student;

public class Program2 {
	public static void main(String[] args) {

		Student.college = "Đại học Bách Khoa";

		Student[] students = new Student[3];
		students[0] = new Student(1, "Nguyễn Văn A");
		students[1] = new Student(2, "Nguyễn Văn B");
		students[2] = new Student(3, "Nguyễn Văn C");

		// B1: Mỗi student đóng 100k
		for (Student student : students) {
			Student.moneyGroup += 100;
		}
		System.out.println("B1 - Sau khi mỗi người đóng 100k, quỹ còn: " + Student.moneyGroup + "k");

		// B2: Student 1 lấy 50k mua bim bim
		Student.moneyGroup -= 50;
		System.out.println("B2 - Student 1 mua bim bim, quỹ còn: " + Student.moneyGroup + "k");

		// B3: Student 2 lấy 20k mua bánh mì
		Student.moneyGroup -= 20;
		System.out.println("B3 - Student 2 mua bánh mì, quỹ còn: " + Student.moneyGroup + "k");

		// B4: Student 3 lấy 150k mua đồ học tập
		Student.moneyGroup -= 150;
		System.out.println("B4 - Student 3 mua đồ học tập, quỹ còn: " + Student.moneyGroup + "k");

		// B5: Mỗi người đóng thêm 50k
		for (Student student : students) {
			Student.moneyGroup += 50;
		}
		System.out.println("B5 - Mỗi người đóng thêm 50k, quỹ còn: " + Student.moneyGroup + "k");
	}
}
