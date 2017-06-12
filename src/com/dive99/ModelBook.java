package com.dive99;

import java.time.LocalDate;

public class ModelBook {
	private String  title;
	private String  author;
	private String content;
	private String status;
	private int price;
	private int isbn;
	private LocalDate publisherDate;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public LocalDate getPublisherDate() {
		return publisherDate;
	}
	public void setPublisherDate(LocalDate publisherDate) {
		this.publisherDate = publisherDate;
	}
}

