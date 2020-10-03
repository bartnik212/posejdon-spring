package com.jakubbartnik.module.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {



    @Autowired
    private BooksRepository booksRepository;

    @GetMapping("/rest/books/{id}")
    public BooksEntity getBook(@PathVariable Long id){
       return booksRepository.findById(id).orElse(null);
    }
    @GetMapping("/rest/books")
    public List<BooksEntity> getBooks() {
        return booksRepository.findAll();
    }

}
