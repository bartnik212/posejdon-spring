package com.jakubbartnik.module.books.service;

import com.jakubbartnik.module.books.entity.BooksEntity;
import com.jakubbartnik.module.books.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BooksRepository booksRepository;

    public BooksEntity getOne(Long id) {
        return booksRepository.getOne(id);
    }

    public List<BooksEntity> getAll() {
        return booksRepository.findAll();
    }

    public BooksEntity create(BooksEntity entity) {
        return booksRepository.saveAndFlush(entity);
    }

    public void delete(Long id) {
        booksRepository.deleteById(id);
    }

    public BooksEntity update(Long id, BooksEntity entity) {
        return booksRepository.saveAndFlush(entity.setId(id));
    }
}
