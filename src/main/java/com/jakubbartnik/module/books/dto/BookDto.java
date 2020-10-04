package com.jakubbartnik.module.books.dto;

public class BookDto {
    private Long id;
    private String author;
    private String title;
    private BookDetailsDto details;

  

    public BookDetailsDto getDetails() {
        return details;
    }

    public BookDto setDetails(BookDetailsDto details) {
        this.details = details;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public BookDto setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public BookDto setTitle(String title) {
        this.title = title;
        return this;
    }
}
