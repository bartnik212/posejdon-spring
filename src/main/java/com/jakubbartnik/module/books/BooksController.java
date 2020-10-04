package com.jakubbartnik.module.books;

import com.jakubbartnik.module.books.entity.BooksEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BooksController {



    @Autowired
    private BooksRepository booksRepository;

    @GetMapping("/rest/books/{id}")
    public BooksEntity getBook(@PathVariable Long id){
       return booksRepository.findById(id).orElse(null);
    }
    @GetMapping("/rest/books")
    public List<BooksEntity> getBooks() {
        return booksRepository.findAll();
    }

    @PostMapping("/rest/books")
    public BooksEntity newBooks(@Valid @RequestBody BooksEntity booksEntity){
        return booksRepository.saveAndFlush(booksEntity);
    }

    @DeleteMapping("/rest/books/{id}")
    public void delete(@PathVariable Long id) {
        booksRepository.deleteById(id);
    }

    @PutMapping("/rest/books/{id}")
    public BooksEntity updateBooks (@PathVariable Long id,
                                    @RequestBody BooksEntity booksEntity){
        return booksRepository.saveAndFlush(booksEntity.setId(id));
    }

}
