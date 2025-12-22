package com.vti.frontend;

import java.util.Random;

public class Program11 {
	public static void main(String[] args) {
//		// i++ : sử dụng giá trị ban đầu trước , sau khi sd mới tăng , sẽ khác với ++i
//		int i = 1;
//		System.out.println(++i);
////
////		System.out.println(i);
//
//		System.out.println("daonq");
//		System.out.println("vti");
//		System.out.println("academy");
//// print : in ko xuong dong , muon xuong dong trong phan "" can ghi them \n 
//
//		System.out.print("daonq");
//		System.out.print("vti");
//		System.out.print("academy \n");
//
//		String name = "daonq";
//		int age = 20;
////		System.out.print("Toi la "+ name + "toi " + age + "tuoi"); // phep cong chuoi
//
//		// printf
//		// s: 1 chuoi
//		// d: 1 so nguyen
//		// f : 1 so thuc
//		// n: xuong dong
//		System.out.printf("Toi la %s, toi %d tuoi", name, age);

		String[] nameRailway98 = { "Tiến", "Nam", "Hương", "Bình", "Trinh", "Lâm", "Hùng", "Hoàng" };
// Lấy ra ngẫu nhiên 1 bạn 
		Random random = new Random();
		int index = random.nextInt(nameRailway98.length);

		System.out.println("Bạn được chọn: " + nameRailway98[index]);

	}
}
