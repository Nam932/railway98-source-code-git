package com.vti.entity;

import com.vti.exception.HinhHocException;

public class HinhChuNhat extends HinhHoc {

	private double a;
	private double b;

	public HinhChuNhat(double a, double b) throws HinhHocException {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double tinhChuVi() {
		return 2 * (a + b);
	}

	@Override
	public double tinhDienTich() {
		return a * b;
	}
}
