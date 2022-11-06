package com.vvce.ponnanna.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.vvce.ponnanna.model.Book;
import com.vvce.ponnanna.repo.BookRepo;

@Service
@CacheConfig(cacheNames = "BookStore")
public class BookServiceImp implements BookService{
	
	@Autowired
	BookRepo bookRepo;

	@Override
	public List<Book> findAllBook() {
		return bookRepo.findAll();
	}

	@Override
	@Cacheable(value="books",key = "#id")
	public Optional<Book> findBookById(int id) {
		if(bookRepo.findById(id)!=null) {
			return bookRepo.findById(id);
		}else {
			Optional<Book> bookOptional= Optional.empty();
			Book book=new Book(id, "Book info not available",0,"null");
			bookOptional=Optional.of(book);
			return bookOptional;
		}
	}

	@Override
	public void addBook(Book book) {
		bookRepo.save(book);
	}

	@Override
	public void deleteBook(int id) {
		bookRepo.deleteById(id);
	}


}
