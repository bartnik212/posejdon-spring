package com.jakubbartnik.module.books.dto;

public class BookForm {

    private String author;
    private String title;
    private String isbn;
    private String lang;

    public String getIsbn() {
        return isbn;
    }

    public String getLang() {
        return lang;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
