package com.vti.frontend;

import java.util.ArrayList;
import java.util.Iterator;

public class Program6 {
	public static void main(String[] args) {
		ArrayList<String> nameStrings = new ArrayList<String>();
		nameStrings.add("Sơn");
		nameStrings.add("Hải");
		nameStrings.add("Núi");
		nameStrings.add("Non");
		nameStrings.add("Hùng");
		nameStrings.add("Vĩ");

		Iterator<String> iterator = nameStrings.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
	}
}
