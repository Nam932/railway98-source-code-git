package com.vti.frontend;

import java.util.ArrayList;
import java.util.Iterator;

public class Program1 {
	public static void main(String[] args) {
		// Lan, Thủy, Sơn, Tiến
		ArrayList<String> nameArrayList = new ArrayList<String>();
		nameArrayList.add("Lan");
		nameArrayList.add("Thủy");
		nameArrayList.add("Sơn");
		nameArrayList.add("Tiến");

		// Duyệt theo foreach
		System.out.println("-- foreach--");
		for (String name : nameArrayList) {
			System.out.println(name);
		}

		// Duyệt theo iterator
		System.out.println("-- iterator--");
		Iterator<String> iterator = nameArrayList.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}

		// Lấy phần tử theo index
		System.out.println("-------------");
		System.out.println(nameArrayList.get(0));

		System.out.println(nameArrayList.contains("Thủy_1"));

	}
}