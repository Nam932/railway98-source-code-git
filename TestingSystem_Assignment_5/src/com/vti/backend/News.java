package com.vti.backend;

public class News implements INews {

	private int ID;
	private String Title;
	private String PublishDate;
	private String Author;
	private String Content;
	private float AverageRate;

	private int[] Rates = new int[3];

	// Getter & Setter
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getPublishDate() {
		return PublishDate;
	}

	public void setPublishDate(String publishDate) {
		PublishDate = publishDate;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public float getAverageRate() {
		return AverageRate;
	}

	public void setRates(int index, int value) {
		Rates[index] = value;
	}

	// Implement interface methods
	@Override
	public void Display() {
		System.out.println("Title: " + Title);
		System.out.println("Publish Date: " + PublishDate);
		System.out.println("Author: " + Author);
		System.out.println("Content: " + Content);
		System.out.println("Average Rate: " + AverageRate);
	}

	@Override
	public float Calculate() {
		int sum = 0;
		for (int rate : Rates) {
			sum += rate;
		}
		AverageRate = sum / 3f;
		return AverageRate;
	}
}
