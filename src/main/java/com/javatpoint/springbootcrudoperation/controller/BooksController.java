package com.javatpoint.springbootcrudoperation.controller;


import com.javatpoint.springbootcrudoperation.model.Books;
import com.javatpoint.springbootcrudoperation.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController
{

    @Autowired
     private BooksService booksService;


      @GetMapping("/book")
      private List<Books> getAllBooks()
      {
          return booksService.getAllBooks();
      }


      @GetMapping("/book/{bookId}")
     private Books getBooksById(@PathVariable("bookId") int bookId)
     {

         return booksService.getBooksById(bookId);
     }

     @DeleteMapping("/book/{bookId}")
     private void deleteBookById(@PathVariable("bookId") int bookId)
     {

         booksService.deleteBookById(bookId);
     }

     @PostMapping("/books")
     private int saveBook(@RequestBody Books books)
     {

         booksService.save(books);
         return books.getBookId();
     }
    @PutMapping("/books")
    private Books updateBook(@RequestBody Books books)
    {

        booksService.update(books);
        return books;
    }























}
