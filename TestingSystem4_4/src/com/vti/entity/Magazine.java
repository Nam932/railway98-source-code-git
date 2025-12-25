package com.vti.entity;

public class Magazine extends Document {
	private int issueNumber;
	private int releaseMonth;

	public Magazine(String documentId, String publisher, int releaseNumber, int issueNumber, int releaseMonth) {
		super(documentId, publisher, releaseNumber);
		this.issueNumber = issueNumber;
		this.releaseMonth = releaseMonth;
	}

	@Override
	public void display() {
		System.out.println("MAGAZINE | ID: " + documentId + ", Publisher: " + publisher + ", Copies: " + releaseNumber
				+ ", Issue: " + issueNumber + ", Month: " + releaseMonth);
	}
}
