package com.jakubbartnik.module.books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {

    private static final List<BooksEntity> BOOKS_ENTITIES = List.of(
            new BooksEntity()
            .setId(1L).setTitle("The Lord of The Rings").setAuthor("J.R.R Tolkien"),
            new BooksEntity()
            .setId(2L).setTitle("1984").setAuthor("George Orwell"),
            new BooksEntity()
            .setId(3L).setTitle("Galaxy").setAuthor("Douglas Adams")
    );

    @GetMapping("/rest/books/{id}")
    public BooksEntity getBook(@PathVariable Long id){
        return BOOKS_ENTITIES
                .stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .get();
    }
    @GetMapping("/rest/books")
    public List<BooksEntity> getBooks(){
        return BOOKS_ENTITIES;
    }

}
