package com.Book.Book.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Book.Book.project.Entity.Book;
import com.Book.Book.project.Service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping
	public ResponseEntity<Book>  AddBook(@RequestBody Book book){
		
		Book addBook = bookService.AddBook(book);
		System.out.println("changed");
		return ResponseEntity.ok(addBook);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Book>  GetBooksById(@RequestParam int id){
		Book getBookById = bookService.GetBookById(id);
		return ResponseEntity.ok(getBookById);
	}

	
	@GetMapping
	public ResponseEntity<List<Book>>  GetAllBook(){
		 List<Book> allBook = bookService.getAllBook();
		return ResponseEntity.ok(allBook);
	}
	
	@DeleteMapping("/{id}")
	public void DeleteBook(@RequestParam int id){
		bookService.DeleteBook(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Book> UpdatBook(@RequestParam int id){
		Book updateBook = bookService.UpdateBook(id);
		return ResponseEntity.ok(updateBook);
	
	}

	

}
