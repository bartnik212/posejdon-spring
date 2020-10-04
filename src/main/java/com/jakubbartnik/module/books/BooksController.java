package com.jakubbartnik.module.books;

import com.jakubbartnik.module.books.dto.BookDto;
import com.jakubbartnik.module.books.dto.BookForm;
import com.jakubbartnik.module.books.entity.BooksEntity;
import com.jakubbartnik.module.books.mapper.BookFormMapper;
import com.jakubbartnik.module.books.mapper.BookMapper;
import com.jakubbartnik.module.books.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BooksRepository booksRepository;

    @GetMapping("/rest/books/{id}")
    public BookDto getBook(@PathVariable Long id) {
        BooksEntity booksEntity = booksRepository.findById(id).orElse(null);
        return BookMapper.map(booksEntity);
    }

    @GetMapping("/rest/books")
    public List<BookDto> getBooks() {
        List<BooksEntity> books = booksRepository.findAll();
        return BookMapper.map(books);
    }

    @PostMapping("/rest/books")
    public BookDto newBooks(@Valid @RequestBody BookForm bookForm) {
        BooksEntity book = BookFormMapper.map(bookForm);
        book = booksRepository.saveAndFlush(book);
        return BookMapper.map(book);
    }

    @PutMapping("/rest/books/{id}")
    public BookDto updateBooks(@PathVariable Long id,
                               @RequestBody BooksEntity booksEntity) {
        BooksEntity book = booksRepository.saveAndFlush(booksEntity.setId(id));
        return BookMapper.map(book);
    }

    @DeleteMapping("/rest/books/{id}")
    public void delete(@PathVariable Long id) {
        booksRepository.deleteById(id);
    }

}
