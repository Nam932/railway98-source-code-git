package com.vti.entity;

public class Newspaper extends Document {
	private String releaseDate;

	public Newspaper(String documentId, String publisher, int releaseNumber, String releaseDate) {
		super(documentId, publisher, releaseNumber);
		this.releaseDate = releaseDate;
	}

	@Override
	public void display() {
		System.out.println("NEWSPAPER | ID: " + documentId + ", Publisher: " + publisher + ", Copies: " + releaseNumber
				+ ", Date: " + releaseDate);
	}
}
