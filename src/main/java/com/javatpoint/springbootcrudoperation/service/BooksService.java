package com.javatpoint.springbootcrudoperation.service;

import com.javatpoint.springbootcrudoperation.model.Books;
import com.javatpoint.springbootcrudoperation.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BooksService {


    @Autowired
    private BooksRepository booksRepository;


   public List<Books> getAllBooks()
   {
       List<Books> books  = new ArrayList<Books>();
       booksRepository.findAll().forEach(books1 -> books.add(books1));
       return books;
   }

   public Books getBooksById(int id)
   {
        return booksRepository.findById(id).get();
   }

   public void deleteBookById(int id)
   {
       booksRepository.deleteById(id);
   }

   public void save(Books books)
   {

       booksRepository.save(books);
   }

    public void update(Books books)
    {
        booksRepository.save(books);
    }








}
