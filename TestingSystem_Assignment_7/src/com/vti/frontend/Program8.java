package com.vti.frontend;

import com.vti.entity.HinhChuNhat;
import com.vti.entity.HinhTron;
import com.vti.exception.HinhHocException;

public class Program8 {
	public static void main(String[] args) {

		try {
			new HinhTron(1);
			new HinhTron(2);
			new HinhChuNhat(2, 3);
			new HinhChuNhat(3, 4);
			new HinhTron(5);

			// Hình thứ 6 → lỗi
			new HinhTron(6);

		} catch (HinhHocException e) {
			System.out.println(e.getMessage());
		}
	}
}
