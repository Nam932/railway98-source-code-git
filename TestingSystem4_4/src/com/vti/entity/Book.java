package com.vti.entity;

public class Book extends Document {
	private String author;
	private int pageNumber;

	public Book(String documentId, String publisher, int releaseNumber, String author, int pageNumber) {
		super(documentId, publisher, releaseNumber);
		this.author = author;
		this.pageNumber = pageNumber;
	}

	@Override
	public void display() {
		System.out.println("BOOK | ID: " + documentId + ", Publisher: " + publisher + ", Copies: " + releaseNumber
				+ ", Author: " + author + ", Pages: " + pageNumber);
	}
}
