package com.services.databaseservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.databaseservice.entity.Book;
import com.services.databaseservice.exception.ResourceNotFoundException;
import com.services.databaseservice.repository.BookRepository;

@RestController
@RequestMapping("/v1/api/book")
public class BooksController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@PostMapping("/")
	public ResponseEntity<Book> createBook(@RequestBody Book book){
		Book savedBook = bookRepository.save(book);
		return ResponseEntity.ok(savedBook);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable Long id) throws ResourceNotFoundException{
		Book savedBook = bookRepository.findById(id).orElseThrow(() ->  new ResourceNotFoundException("book doesnot exist :"+id));
		return ResponseEntity.ok(savedBook);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Book>> getBooks() throws ResourceNotFoundException{
		List<Book> books = bookRepository.findAll();
		return ResponseEntity.ok(books);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Book> deleteBookById(@PathVariable Long id) throws ResourceNotFoundException{
		Book savedBook = bookRepository.findById(id).orElseThrow(() ->  new ResourceNotFoundException("book doesnot exist :"+id));
		bookRepository.delete(savedBook);
		return ResponseEntity.ok(savedBook);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable Long id) throws ResourceNotFoundException{
		Book savedBook = bookRepository.findById(id).orElseThrow(() ->  new ResourceNotFoundException("book doesnot exist :"+id));
		
		savedBook.setAuthor(book.getAuthor());
		savedBook.setTitle(book.getTitle());
		savedBook.setYear(book.getYear());
		savedBook = bookRepository.save(book);
		return ResponseEntity.ok(savedBook);
	}

}
