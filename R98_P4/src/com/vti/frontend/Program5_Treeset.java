package com.vti.frontend;

import java.util.SortedSet;
import java.util.TreeSet;
// Tree set : thu tu theo abc 

public class Program5_Treeset {
	public static void main(String[] args) {
		SortedSet<String> nameTreeSet = new TreeSet<String>();
		nameTreeSet.add("Bao");
		nameTreeSet.add("Nam");
		nameTreeSet.add("Huy");
		nameTreeSet.add("Chien");
		nameTreeSet.add("An");
		nameTreeSet.add("Thuc");
		nameTreeSet.add("Lan");

		for (String name : nameTreeSet) {
			System.out.println(name);
		}
	}
}
