package com.vti.entity;

import com.vti.exception.HinhHocException;

public class HinhTron extends HinhHoc {

	private double r;

	public HinhTron(double r) throws HinhHocException {
		super();
		this.r = r;
	}

	@Override
	public double tinhChuVi() {
		return 2 * Math.PI * r;
	}

	@Override
	public double tinhDienTich() {
		return Math.PI * r * r;
	}
}
