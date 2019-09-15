package com.besandr.repository;

import com.besandr.repository.entities.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    Book save(Book book);

    List<Book> findAll();

    @Query("SELECT DISTINCT b FROM Book b JOIN b.authors a JOIN b.keywords k " +
            "WHERE (:authorId IS NULL OR a.id = :authorId) " +
            "AND (:keywordId IS NULL OR k.id = :keywordId)" +
            "AND (:titlePart IS NULL OR b.title LIKE %:titlePart%)")
    Page<Book> bla(
            @Param("titlePart") String titlePart,
            @Param("authorId") Long authorId,
            @Param("keywordId") Long keywordId, Pageable pageSize);
}
