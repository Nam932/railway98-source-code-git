package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Book;
import com.vti.entity.Document;
import com.vti.entity.Magazine;
import com.vti.entity.Newspaper;

public class DocumentManager {
	private ArrayList<Document> documents = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);

	// a) Add new document
	public void addDocument() {
		System.out.println("1. Book");
		System.out.println("2. Magazine");
		System.out.println("3. Newspaper");
		int choice = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Document ID: ");
		String id = scanner.nextLine();
		System.out.print("Publisher: ");
		String publisher = scanner.nextLine();
		System.out.print("Release number: ");
		int releaseNumber = scanner.nextInt();
		scanner.nextLine();

		if (choice == 1) {
			System.out.print("Author: ");
			String author = scanner.nextLine();
			System.out.print("Page number: ");
			int pages = scanner.nextInt();
			documents.add(new Book(id, publisher, releaseNumber, author, pages));
		} else if (choice == 2) {
			System.out.print("Issue number: ");
			int issue = scanner.nextInt();
			System.out.print("Release month: ");
			int month = scanner.nextInt();
			documents.add(new Magazine(id, publisher, releaseNumber, issue, month));
		} else if (choice == 3) {
			System.out.print("Release date: ");
			String date = scanner.nextLine();
			documents.add(new Newspaper(id, publisher, releaseNumber, date));
		}
	}

	// b) Delete by ID
	public void deleteDocument() {
		System.out.print("Enter document ID to delete: ");
		String id = scanner.nextLine();

		documents.removeIf(d -> d.getDocumentId().equals(id)); //
	}

	// c) Display all
	public void displayAll() {
		for (Document d : documents) {
			d.display();
		}
	}

	// d) Search by type
	public void searchByType() {
		System.out.println("1. Book | 2. Magazine | 3. Newspaper");
		int choice = scanner.nextInt();

		for (Document d : documents) {
			if (choice == 1 && d instanceof Book || choice == 2 && d instanceof Magazine // instanceof : Lấy ra chủng
																							// loại trong cac tài liệu
					|| choice == 3 && d instanceof Newspaper) {
				d.display();
			}
		}
	}
}
