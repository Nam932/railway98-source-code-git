package com.vti.frontend;

public class Program10 {
	public static void main(String[] args) {
////		// Đếm từ 1 ~ 100 
////		System.out.println("Số 1"); // Số + 1 
////		System.out.println("Số 2"); // Số +2 
////		System.out.println("Số 3");
////		System.out.println("Số 4");
////		System.out.println("Số 5");
//// Tạo bộ chỉ số tự động : 1 2 3 4 5 => For
//
//		for (int i = 1; i <= 10000; i = i + 1) {
//			System.out.println(i);
//		}
//		
//		
//		System.out.println("Tất cả các học viên trên lớp");
//		String[] nameRailway98 = {"Tiến", "Nam" , "Hương" , "Bình", "Trinh", "Lâm"};
//// Dùng vòng lặp for để in thông tin cac học viên trên lớp
//		

		System.out.println("Tất cả các học viên trên lớp");

		String[] nameRailway98 = { "Tiến", "Nam", "Hương", "Bình", "Trinh", "Lâm" };

//		// Dùng vòng lặp for để in thông tin các học viên
//		for (int i = 0; i < nameRailway98.length; i++) {
//			System.out.println("Học viên " + (i + 1) + ": " + nameRailway98[i]);
//		}

//		// Cách làm: Thêm index , sau đó với vòng lặp sẽ để index++
//		int index = 1;
//		for (String name : nameRailway98) {
//			System.out.println("Học viên " + index + ": " + name);
//			index++; // Toán tử tăng 1 trong Java
//
//		}

// ============================================================================================
// WHILE (luôn phải có điều kiện dừng) 
		int k = 1;
		while (k <= 10) {
			System.out.println(k); // Không có điều kiện dừng, nếu chạy n sẽ chạy mãi
			k++;

		}
	}
}

//		while (true) {
//			System.out.println("VTI");
//		}
//	}
//}

//	Scanner scanner = new Scanner(System.in);
//	while(true);
//		System.out.println("Input name");
//		int age = scanner.nextInt();
//		
//		if (age > 0); 
//			System.out.println("Age is " + age );
//			return;
//			
//	============================================================================================
//		DO WHILE + Continue + break 

//		int j = 1;
//		
//        do {
//            System.out.println(j);
//            j++;
//        } while (j <= 5);
//    }

//			
//			for (int i = 1; i <= 10; i++) {
//	            if (i == 5) {
//	                break; ; // Thoát khỏi vòng lặp khi i == 5
//	            }
//	            System.out.println(i);
//	        }
//	    }
//	}
