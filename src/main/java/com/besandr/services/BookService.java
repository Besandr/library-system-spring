package com.besandr.services;

import com.besandr.repository.AuthorRepository;
import com.besandr.repository.BookRepository;
import com.besandr.repository.KeywordRepository;
import com.besandr.repository.entities.Author;
import com.besandr.repository.entities.Book;
import com.besandr.repository.entities.Keyword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
    private KeywordRepository keywordRepository;

    @Autowired
    public BookService(BookRepository bookRepository, AuthorRepository authorRepository, KeywordRepository keywordRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.keywordRepository = keywordRepository;
    }

    public Iterable<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

    public Iterable<Keyword> getAllKeywords() {
        return keywordRepository.findAll();
    }

    public Page<Book> findBooks(String partOfTitle, Long authorId, Long keywordId, Pageable pageSize){
        return bookRepository.bla(partOfTitle, authorId, keywordId, pageSize);
    }
}
