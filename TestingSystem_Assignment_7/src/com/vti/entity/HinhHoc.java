package com.vti.entity;

import com.vti.exception.HinhHocException;
import com.vti.utils.Configs;

/**
 * Class HinhHoc - Class cha cho các hình học
 */
public abstract class HinhHoc {

	/**
	 * Đếm số hình được tạo
	 */
	public static int count = 0;

	public HinhHoc() throws HinhHocException {

		if (count >= Configs.SO_LUONG_HINH_TOI_DA) {
			throw new HinhHocException("Số lượng hình tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA);
		}
		count++;
	}

	public abstract double tinhChuVi();

	public abstract double tinhDienTich();
}
