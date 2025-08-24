package com.Book.Book.project.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Book.Book.project.Entity.Book;

public interface BookRepositary extends JpaRepository<Book, Integer> {

}
