package com.vvce.ponnanna.resource;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vvce.ponnanna.model.Book;
import com.vvce.ponnanna.service.BookService;

@RestController
public class BookController {
	 Logger logger = LoggerFactory.getLogger(BookController.class);
	 
	@Autowired
	private BookService bookService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@PostMapping("/addBook")
	public String save(@RequestBody Book book) {
		bookService.addBook(book);
		return "Book Added!!: "+book.getBookId();	
	}
	
	@GetMapping("/findAllBooks")
	public List<Book> findAllBooks(){
		return bookService.findAllBook();		
	}
	
	@GetMapping("/findAllBooks/{id}")
	public Book findAllBooks(@PathVariable int id){
		//Author author=restTemplate.getForObject("http://localhost:8082/author/"+ id, Author.class);
		
		return new Book(id, bookService.findBookById(id).get().getBookName(),
				bookService.findBookById(id).get().getPrice(), "Author nam");	
		//return new Book(author.getBookId(), bookService.findBookById(id).get().getBookName(),
				//bookService.findBookById(id).get().getPrice(), author.getAuthorName());		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		bookService.deleteBook(id);
		return "Book Deleted!!: "+id;
	}
}
