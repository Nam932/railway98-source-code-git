package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class Position {

	public int id;
	public String name;

	public Position() {

		System.out.print("Input position id: ");
		id = ScannerUtils.inputInt("Please input position id as int!");

		System.out.print("Input position name: ");
		name = ScannerUtils.inputString();
	}
}
