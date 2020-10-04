package com.jakubbartnik.module.books.entity;

import javax.persistence.*;

@Entity
@Table(name = "books_details")
public class BooksDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String isbn;
    private String lang;
    private String publisher;

    public String getIsbn() {
        return isbn;
    }

    public String getLang() {
        return lang;
    }

    public String getPublisher() {
        return publisher;
    }
}
