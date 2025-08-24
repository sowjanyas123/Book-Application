package com.Book.Book.project.Service;

import java.util.List;

import com.Book.Book.project.Entity.Book;

public interface BookService {
	Book AddBook(Book book);
	List<Book> getAllBook();
	Book GetBookById(int id);
	Book UpdateBook(int id);
	void DeleteBook(int id);
	

}
