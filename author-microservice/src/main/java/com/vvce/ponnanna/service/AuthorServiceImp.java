package com.vvce.ponnanna.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvce.ponnanna.model.Author;
import com.vvce.ponnanna.repo.AuthorRepo;

@Service
public class AuthorServiceImp implements AuthorService {
	
	@Autowired
	private AuthorRepo authorRepo;

	@Override
	public Optional<Author> getAuthorNameById(int id) {
		
		if(authorRepo.findById(id)==null) {
			return authorRepo.findById(id);
		}else{
			Optional<Author> authorOptional= Optional.empty();
			Author author=new Author(id, "Author info not available");
			authorOptional=Optional.of(author);
			return authorOptional;
		}
	}

	@Override
	public void addAuthor(Author author) {
		authorRepo.save(author);		
	}

}
