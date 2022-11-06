package com.vvce.ponnanna.service;

import java.util.List;
import java.util.Optional;

import com.vvce.ponnanna.model.Book;

public interface BookService {
	public List<Book> findAllBook();
	public Optional<Book> findBookById(int id);
	public void addBook(Book book);
	public void deleteBook(int id);
}
