package com.javacodesession.jpa_3.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javacodesession.jpa_3.model.Books;
import com.javacodesession.jpa_3.model.Library;
import com.javacodesession.jpa_3.repository.BooksRepository;


@Service
public class BookService {
	Logger log = Logger.getLogger(BookService.class);

	@Autowired
	BooksRepository booksRepository;

	public Map<Integer, List<Books>> getAllBooksInEachLib() {
		List<Books> books = booksRepository.findAll();

		log.info("get all books from db : " + books);

		Map<Integer, List<Books>> booksMap = new HashMap<>();

		books.stream().forEach(book -> {
			Library lib = book.getLibrary();

			if (!booksMap.containsKey(lib.getLibraryId())) {
				List<Books> bookList = new ArrayList<>();
				bookList.add(book);
				booksMap.put(lib.getLibraryId(), bookList);
			} else {
				List<Books> booksFound = booksMap.get(lib.getLibraryId());
				booksFound.add(book);
				booksMap.put(lib.getLibraryId(), booksFound);
			}

		});

		log.info("Books in each Library : " + booksMap);
		return booksMap;
	}


}
