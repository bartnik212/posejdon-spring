package com.jakubbartnik.module.books.mapper;

import com.jakubbartnik.module.books.dto.BookForm;
import com.jakubbartnik.module.books.entity.BooksDetailsEntity;
import com.jakubbartnik.module.books.entity.BooksEntity;

public class BookFormMapper {

    public static BooksEntity map(BookForm form) {
        return new BooksEntity()
                .setTitle(form.getTitle())
                .setAuthor(form.getAuthor())
                .setDetails(getDetails(form));
    }

    private static BooksDetailsEntity getDetails(BookForm form) {

        return new BooksDetailsEntity()
                .setIsbn(form.getIsbn())
                .setLang(form.getLang());
    }
}
