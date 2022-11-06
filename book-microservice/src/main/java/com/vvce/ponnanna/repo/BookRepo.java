package com.vvce.ponnanna.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vvce.ponnanna.model.Book;


public interface BookRepo extends MongoRepository<Book, Integer> {
	
}
