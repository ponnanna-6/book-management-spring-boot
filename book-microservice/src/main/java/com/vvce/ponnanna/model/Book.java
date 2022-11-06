package com.vvce.ponnanna.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Book")
public class Book implements Serializable{
		@Id
		private int bookId;
		private String bookName;
		private int price;
		private String authorName;
		
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public Book(int bookId, String bookName, int price,String authorName) {
			super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.price = price;
			this.authorName=authorName;
		}
}
