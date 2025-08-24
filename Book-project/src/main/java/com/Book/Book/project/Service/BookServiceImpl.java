package com.Book.Book.project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.Book.Book.project.Entity.Book;
import com.Book.Book.project.Repositary.BookRepositary;
@Service
public class BookServiceImpl implements BookService {
@Autowired
private BookRepositary bookRepo;

	@Override
	public Book AddBook(Book book) {
		Book created = bookRepo.save(book);
		return created;
	}

	@Override
	public List<Book> getAllBook() {
		List<Book> AllBook = bookRepo.findAll();
		return AllBook;
	}

	@Override
	public Book GetBookById(int id) {
		 Book getBook = bookRepo.findById(id).orElseThrow();
		return getBook;
		
		
	}

	@Override
	public Book UpdateBook(int id) {
		Book b=new Book();
		b.setAuthor(b.getAuthor());
		b.setGenre(b.getGenre());
		b.setPublishedYear(b.getPublishedYear());
		b.setTitle(b.getTitle());
		
		Book updated = bookRepo.save(b);
		return updated;
	}

	@Override
	public void DeleteBook(int id) {
		 bookRepo.deleteById(id);

	}

}
