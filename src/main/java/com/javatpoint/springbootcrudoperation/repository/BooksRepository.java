package com.javatpoint.springbootcrudoperation.repository;

import com.javatpoint.springbootcrudoperation.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books,Integer> {
}
