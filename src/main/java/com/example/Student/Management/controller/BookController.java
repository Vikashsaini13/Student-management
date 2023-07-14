package com.example.Student.Management.controller;

import com.example.Student.Management.model.Address;
import com.example.Student.Management.model.Book;
import com.example.Student.Management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    //add book
    @PostMapping("book")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    //get book by
    @GetMapping("book/id/{id}")
    public Book getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }


    //delete book by id
    @DeleteMapping ("book/id/{id}")
    public String deleteBookById(@PathVariable Long id){
        return bookService.deleteBookById(id);
    }


    //update book
    @PutMapping("book")
    public String updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }
}
