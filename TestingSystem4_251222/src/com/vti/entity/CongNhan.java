package com.vti.entity;

public class CongNhan extends CanBo {
	private int bac; // 1 đến 10

	public CongNhan(String name, int age, String gender, String address, int bac) {
		super(name, age, gender, address);
		this.bac = bac;
	}

	// Getter & Setter
	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	// Override printInfo
	@Override
	public void printInfo() {
		super.printInfo(); // in thông tin chung
		System.out.println("Bac: " + bac);
		System.out.println("-----------------------");
	}
}
