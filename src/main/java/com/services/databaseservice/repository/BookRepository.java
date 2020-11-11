package com.services.databaseservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.databaseservice.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
