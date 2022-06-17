package com.javaCode.sessionTwo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.javaCode.sessionTwo.model.Books;
import com.javaCode.sessionTwo.service.BookService;

@RestController
public class BooksController {

	Logger log = Logger.getLogger(BooksController.class);

	@Autowired
	BookService bookService;

	@GetMapping("/all-books-in-each-lib")
	public String getAllBooksInEachLibrary() throws JsonProcessingException {
		Map<Integer, List<Books>> bookMaps = bookService.getAllBooksInEachLib();
		log.info("bookMaps ---->> : " + bookMaps);
		return bookMaps.toString();
	}

	@GetMapping("/count-all-books-in-each-lib")
	public String countAllBooksInEachLibrary() throws JsonProcessingException {
		Map<Integer, List<Books>> bookMaps = bookService.getAllBooksInEachLib();
		Map<Integer, Integer> bookCount = new HashMap<>();

		bookMaps.entrySet().stream().forEach(key -> {
			List<Books> bookList = bookMaps.get(key.getKey());
			bookCount.put(key.getKey(), bookList.size());
		});

		log.info("bookMaps ---->> : " + bookCount);
		return bookCount.toString();
	}

}
