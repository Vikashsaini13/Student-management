package com.example.Student.Management.service;

import com.example.Student.Management.model.Address;
import com.example.Student.Management.model.Book;
import com.example.Student.Management.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    IBookRepo bookRepo;

    public String addBook(Book book) {

        bookRepo.save(book);
        return "Book added";
    }

    public Book getBookById(Long id) {
        Optional<Book> book=bookRepo.findById(id);
        return book.get();
    }

    public String deleteBookById(Long id) {

        bookRepo.deleteById(id);
        return "book deleted successfully";
    }

    public String updateBook(Book book) {
        Book existingBook =bookRepo.findById(book.getBookId()).get();

        existingBook.setBookTitle(book.getBookTitle());
        existingBook.setBookAuthor(book.getBookAuthor());
        existingBook.setBookDescription(book.getBookDescription());
        existingBook.setBookPrice(book.getBookPrice());


        bookRepo.save(existingBook);

        return "book updated successfully!!!!";
    }
}
