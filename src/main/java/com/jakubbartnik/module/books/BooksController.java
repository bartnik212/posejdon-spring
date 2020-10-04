package com.jakubbartnik.module.books;

import com.jakubbartnik.module.books.dto.BookDto;
import com.jakubbartnik.module.books.dto.BookForm;
import com.jakubbartnik.module.books.entity.BooksEntity;
import com.jakubbartnik.module.books.mapper.BookFormMapper;
import com.jakubbartnik.module.books.mapper.BookMapper;
import com.jakubbartnik.module.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/rest/books/{id}", produces = {
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE
    })
    public BookDto getBook(@PathVariable Long id) {
        BooksEntity booksEntity = bookService.getOne(id);
        return BookMapper.map(booksEntity);
    }

    @GetMapping("/rest/books")
    public List<BookDto> getBooks() {
        List<BooksEntity> books = bookService.getAll();
        return BookMapper.map(books);
    }

    @PostMapping("/rest/books")
    public BookDto newBooks(@Valid @RequestBody BookForm bookForm) {
        BooksEntity book = BookFormMapper.map(bookForm);
        book = bookService.create(book);
        return BookMapper.map(book);
    }

    @PutMapping("/rest/books/{id}")
    public BookDto updateBooks(@PathVariable Long id,
                               @RequestBody BooksEntity booksEntity) {
        BooksEntity book = bookService.update(id, booksEntity);
        return BookMapper.map(book);
    }

    @DeleteMapping("/rest/books/{id}")
    public void delete(@PathVariable Long id) {
        bookService.delete(id);
    }

}
