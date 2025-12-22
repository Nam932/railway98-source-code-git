package com.vti.entity;

public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien(String name, int age, String gender, String address, String congViec) {
		super(name, age, gender, address);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Cong Viec: " + congViec);
		System.out.println("-----------------------");
	}
}
