package com.vvce.ponnanna.model;

public class Author{
	
	private int bookId;
	private String authorName;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Author(int bookId, String authorName) {
		super();
		this.bookId = bookId;
		this.authorName = authorName;
	}
	public Author() {
	}
}
