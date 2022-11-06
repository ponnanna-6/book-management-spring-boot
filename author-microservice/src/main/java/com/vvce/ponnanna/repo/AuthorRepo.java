package com.vvce.ponnanna.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vvce.ponnanna.model.Author;

public interface AuthorRepo extends MongoRepository<Author, Integer>{

}
