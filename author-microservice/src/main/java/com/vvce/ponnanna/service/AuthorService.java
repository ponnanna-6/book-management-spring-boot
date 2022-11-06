package com.vvce.ponnanna.service;

import java.util.Optional;

import com.vvce.ponnanna.model.Author;

public interface AuthorService {
	public Optional<Author> getAuthorNameById(int id);
	public void addAuthor(Author author);
}
