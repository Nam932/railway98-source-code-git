package com.vti.backend;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Excercise2 {

	// a) In thứ tự tới từ sớm nhất → muộn nhất (dùng Stack)
	public void printOrderByStack() {

		// Stack: vào sau ra trước (LIFO)
		Stack<String> students = new Stack<>();

		// Push theo thứ tự tới
		students.push("Nguyễn Văn Nam");
		students.push("Nguyễn Văn Huyên");
		students.push("Trần Văn Nam");
		students.push("Nguyễn Văn A");

		System.out.println("Thứ tự tới từ sớm nhất đến muộn nhất:");

		// Muốn in từ sớm → muộn
		// => đảo Stack bằng Stack phụ
		Stack<String> tempStack = new Stack<>();
		while (!students.isEmpty()) {
			tempStack.push(students.pop());
		}

		while (!tempStack.isEmpty()) {
			System.out.println(tempStack.pop());
		}
	}

	// b) In thứ tự tới từ muộn nhất → sớm nhất (dùng Queue)
	public void printOrderByQueue() {

		// Queue: vào trước ra trước (FIFO)
		Queue<String> students = new LinkedList<>();

		// Add theo thứ tự tới
		students.add("Nguyễn Văn Nam");
		students.add("Nguyễn Văn Huyên");
		students.add("Trần Văn Nam");
		students.add("Nguyễn Văn A");

		System.out.println("Thứ tự tới từ muộn nhất đến sớm nhất:");

		// Muốn in từ muộn → sớm
		// => đưa Queue vào Stack để đảo
		Stack<String> stack = new Stack<>();
		while (!students.isEmpty()) {
			stack.push(students.poll());
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
