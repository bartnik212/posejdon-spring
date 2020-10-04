package com.jakubbartnik.module.books.mapper;

import com.jakubbartnik.module.books.entity.BooksTagsEntity;

import java.util.Set;
import java.util.stream.Collectors;

public class BooksTagsMapper {

    public static String map(BooksTagsEntity tag) {
        return tag.getValue();
    }

    public static Set<String> map(Set<BooksTagsEntity> tags) {
        if (tags == null) {
            return Set.of();
        }

        return tags
                .stream()
                .map(BooksTagsMapper::map)
                .collect(Collectors.toSet());
    }
}
