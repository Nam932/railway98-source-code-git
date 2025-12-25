package com.vti.frontend;

import com.vti.entity.CongNhan;
import com.vti.entity.KySu;
import com.vti.entity.NhanVien;

// Demo question 1 Excecise 5 
public class Program2 {
	public static void main(String[] args) {
		CongNhan cn = new CongNhan("Nguyen Van A", 30, "Nam", "Ha Noi", 5);
		KySu ks = new KySu("Tran Thi B", 28, "Nu", "Hai Phong", "CNTT");
		NhanVien nv = new NhanVien("Le Van C", 25, "Nam", "Da Nang", "Van phong");

		cn.printInfo();
		ks.printInfo();
		nv.printInfo();

	}
}