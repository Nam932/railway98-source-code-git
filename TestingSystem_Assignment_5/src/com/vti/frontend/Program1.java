package com.vti.frontend;
//  Excercise 2 Question 1 

//Exercise 2: Polymorphism
//Question 1: Interface Management
//Tạo 1 class Student gồm các property id, name, group(int)
//Tạo 1 interface IStudent bao gồm các method : điểmDanh(), họcBài(),
//đi dọn vệ sinh()
//Class Student sẽ implement interface như sau:
//Method điểm danh() sẽ in ra nội dung như sau:
//"Nguyễn Văn A điểm danh"
//"Nguyễn Văn B điểm danh"
//"Nguyễn Văn C điểm danh"
//....
//Method học Bài () sẽ in ra nội dung như sau:
//"Nguyễn Văn A đang học bài"
//"Nguyễn Văn B đang học bài "
//"Nguyễn Văn C đang học bài "
//...
//Tương tự với các method còn lại
//Hãy viết chương trình thực hiện các lệnh sau:
//a) Tạo 10 học sinh, chia thành 3 nhóm
//b) Kêu gọi cả lớp điểm danh.
//c) Gọi nhóm 1 đi học bài
//d) Gọi nhóm 2 đi dọn vệ sinh

import com.vti.backend.IStudent;
import com.vti.backend.Student;

public class Program1 {

	public static void main(String[] args) {

		IStudent[] students = new IStudent[10];

		// a) Tạo 10 học sinh, chia 3 nhóm
		students[0] = new Student(1, "Nguyễn Văn A", 1);
		students[1] = new Student(2, "Nguyễn Văn B", 1);
		students[2] = new Student(3, "Nguyễn Văn C", 1);

		students[3] = new Student(4, "Nguyễn Văn D", 2);
		students[4] = new Student(5, "Nguyễn Văn E", 2);
		students[5] = new Student(6, "Nguyễn Văn F", 2);

		students[6] = new Student(7, "Nguyễn Văn G", 3);
		students[7] = new Student(8, "Nguyễn Văn H", 3);
		students[8] = new Student(9, "Nguyễn Văn I", 3);
		students[9] = new Student(10, "Nguyễn Văn K", 3);

		// b) Cả lớp điểm danh
		System.out.println("=== Cả lớp điểm danh ===");
		for (IStudent student : students) {
			student.diemDanh();
		}

		// c) Nhóm 1 học bài
		System.out.println("\n=== Nhóm 1 học bài ===");
		for (IStudent student : students) {
			Student s = (Student) student;
			if (s.getGroup() == 1) {
				s.hocBai();
			}
		}

		// d) Nhóm 2 đi dọn vệ sinh
		System.out.println("\n=== Nhóm 2 đi dọn vệ sinh ===");
		for (IStudent student : students) {
			Student s = (Student) student;
			if (s.getGroup() == 2) {
				s.donVeSinh();
			}
		}
	}
}
