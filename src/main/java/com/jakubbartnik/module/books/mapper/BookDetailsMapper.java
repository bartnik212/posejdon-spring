package com.jakubbartnik.module.books.mapper;

import com.jakubbartnik.module.books.dto.BookDetailsDto;
import com.jakubbartnik.module.books.entity.BooksDetailsEntity;

public class BookDetailsMapper {

    public static BookDetailsDto map(BooksDetailsEntity details) {
//        if (details == null) {
//            return new BookDetailsDto();
//        }
        return new BookDetailsDto()
                .setIsbn(details.getIsbn())
                .setLang(details.getLang());
    }
}
