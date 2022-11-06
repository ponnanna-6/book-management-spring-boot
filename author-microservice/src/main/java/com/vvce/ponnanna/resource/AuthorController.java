package com.vvce.ponnanna.resource;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vvce.ponnanna.model.Author;
import com.vvce.ponnanna.service.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	AuthorService authorService;
	
	@GetMapping("/author/{id}")
	public Optional<Author> getAuthor(@PathVariable int id){
		return authorService.getAuthorNameById(id);		
	}
	
	@PostMapping("/addAuthor")
	public String addAuthor(@RequestBody Author author) {
		authorService.addAuthor(author);
		return "Author added:"+ author.getBookId();		
	}
	

}
