package com.vvce.ponnanna.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Author")
public class Author implements Serializable{
	@Id
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
}
