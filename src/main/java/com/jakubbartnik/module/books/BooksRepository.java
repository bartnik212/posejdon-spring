package com.jakubbartnik.module.books;

import com.jakubbartnik.module.books.entity.BooksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BooksRepository extends JpaRepository<BooksEntity, Long>, JpaSpecificationExecutor<BooksEntity> {
}
