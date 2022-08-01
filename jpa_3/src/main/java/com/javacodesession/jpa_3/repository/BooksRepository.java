package com.javacodesession.jpa_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javacodesession.jpa_3.model.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, String> {
	

}
