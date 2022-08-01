package com.javacodesession.jpa_3.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.javacodesession.jpa_3.model.Books;
import com.javacodesession.jpa_3.model.Library;
import com.javacodesession.jpa_3.repository.BooksRepository;
import com.javacodesession.jpa_3.repository.LibraryRepository;

@Component
public class PopulatedData implements CommandLineRunner {

	@Autowired
	BooksRepository booksRepository;
	
	@Autowired 
	LibraryRepository libraryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		// Enter data
		Library libraryOne = new Library();
		libraryOne.setLibraryId(101);
		libraryOne.setLibraryName("Reston Library");
		libraryRepository.save(libraryOne);
		
		Books bookOne = new Books();
		bookOne.setLibrary(libraryOne);
		bookOne.setBooksId("85u9dd");
		bookOne.setBooksName("The Lord of the Rings by J. R. R. Tolkien");
		booksRepository.save(bookOne);
		
		Books bookThree = new Books();
		bookThree.setLibrary(libraryOne);
		bookThree.setBooksId("1948uk");
		bookThree.setBooksName("The 7 Habits of Highly Effective People");
		booksRepository.save(bookThree);
		
		Books bookFour = new Books();
		bookFour.setLibrary(libraryOne);
		bookFour.setBooksId("Ijhu786");
		bookFour.setBooksName("The Power of Positive Thinking");
		booksRepository.save(bookFour);
		
		Library libraryTwo = new Library();
		libraryTwo.setLibraryId(102);
		libraryTwo.setLibraryName("Gum Spring library");
		libraryRepository.save(libraryTwo);
		
		Books bookTwo = new Books();
		bookTwo.setLibrary(libraryTwo);
		bookTwo.setBooksId("98jkuiy");
		bookTwo.setBooksName("How to Win Friends & Influence People");
		booksRepository.save(bookTwo);
	}

}
