package com.javacodesession.jpa_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javacodesession.jpa_3.model.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer>{

}
