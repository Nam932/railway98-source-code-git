package com.vti.frontend;

public class Program1 {
	public static void main(String[] args) {

		int a1 = 1; // Interger cũng được
//		Integer a2 = 1;
		float f1 = 2.5f; // Float viêt in hoa cũng được\
		Float f2 = 2.5f; // Float f = 2.5f ;

		System.out.println("a:" + a1);
		System.out.println("a:" + f1);

// Có thể chuyển đổi giữa data type primitive và wrapper class

		Integer a1_w = Integer.valueOf(a1); // => boxing
		// a1_w = a1 nhung thuoc kieu Interger
// Chuyển đổi từ primitive sang wrapper class : Boxing 

// 		Nguoc lai chuyen doi tu wrapper class sang primitive : UNBOXING 
		float f2_p = f2.floatValue(); // 2.5f => unboxing

// DATA TYPE CASTING

		byte number1 = 10; // 256 gia tri

// Ep kieu du lieu (tu nho hon len lon hon hoac nguoc lai) => UP CASTING 

		float number1_f = number1;
		double number2 = 30.5;

		int number2_i = (int) number2;
		// Chuyen kieu lon thanh kieu nho phai ghi tuong minh ra
		// DOWN CASTING CO THE GAY MAT MAT DU LIEU => LUU Y

		System.out.printf("number1_f: %f ", number1_f);
		System.out.printf("number2_i: %d ", number2_i);

	}
}
