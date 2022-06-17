package com.javaCode.sessionTwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaCode.sessionTwo.model.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {

}
