package com.example.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.book.repository.BookRepository;
import com.example.book.dto.BookDTO;

public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public void save(BookDTO bookDTO) {
		System.out.println("BookService.save()");
		System.out.println("BookDTO = " + bookDTO);
		bookRepository.save(bookDTO);
		
		
	}

	public List<BookDTO> findAll() {
		return bookRepository.findAll();
	}
}
