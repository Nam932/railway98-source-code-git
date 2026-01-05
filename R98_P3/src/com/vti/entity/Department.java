package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class Department {

	public int id;
	public String name;

	public Department() {

		System.out.print("Input department id: ");
		id = ScannerUtils.inputInt("Please input department id as int!");

		System.out.print("Input department name: ");
		name = ScannerUtils.inputString();
	}
}
