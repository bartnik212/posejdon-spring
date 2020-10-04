package com.jakubbartnik.module.books.mapper;

import com.jakubbartnik.module.books.dto.BookForm;
import com.jakubbartnik.module.books.entity.BooksEntity;

public class BookFormMapper {

    public static BooksEntity map(BookForm form) {
        return new BooksEntity()
                .setTitle(form.getTitle())
                .setAuthor(form.getAuthor());
    }
}
