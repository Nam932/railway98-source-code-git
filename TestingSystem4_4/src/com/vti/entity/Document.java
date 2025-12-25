package com.vti.entity;

public class Document {
	protected String documentId;
	protected String publisher;
	protected int releaseNumber;

	public Document(String documentId, String publisher, int releaseNumber) {
		this.documentId = documentId;
		this.publisher = publisher;
		this.releaseNumber = releaseNumber;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void display() {
		// overridden in child classes
	}
}
