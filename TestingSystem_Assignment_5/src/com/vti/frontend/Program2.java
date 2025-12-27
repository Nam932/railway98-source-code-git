package com.vti.frontend;

import com.vti.backend.HinhChuNhat;
import com.vti.backend.HinhVuong;

//Question 3: This & Super, Overriding
//Tạo 1 class HinhChuNhat có 2 method: tính chu vi và tính diện tích.
//Hãy implement 2 method này.
//Tiếp theo hãy tạo 1 class HinhVuong extends HinhChuNhat, có 2
//method tính chu vi và tính diện tích
//Chú ý:
//Không implement method trong class HinhVuong theo công
//thức tính diện tích, chu vi hình vuông mà sẽ gọi theo
//HinhChuNhat.tinhChuVi(), HinhChuNhat.tinhDienTich() )
//Và trong mỗi method print thêm dòng "Tính diện tích/ chu vi
//theo Hình Vuông/ Hình Chữ Nhật"
public class Program2 {

	public static void main(String[] args) {

		HinhChuNhat hcn = new HinhChuNhat(5, 3);
		System.out.println("Chu vi HCN: " + hcn.tinhChuVi());
		System.out.println("Diện tích HCN: " + hcn.tinhDienTich());

		System.out.println("------------------");

		HinhVuong hv = new HinhVuong(4);
		System.out.println("Chu vi HV: " + hv.tinhChuVi());
		System.out.println("Diện tích HV: " + hv.tinhDienTich());
	}
}
