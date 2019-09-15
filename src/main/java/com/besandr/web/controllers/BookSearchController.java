package com.besandr.web.controllers;

import com.besandr.repository.entities.Author;
import com.besandr.repository.entities.Book;
import com.besandr.repository.entities.Keyword;
import com.besandr.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/bookSearch")
@SessionAttributes({"authors", "keywords", "books"})
public class BookSearchController {

    private BookService bookService;

    @Autowired
    public BookSearchController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showBookSearchPage(Model model) {
        Iterable<Author> authors = bookService.getAllAuthors();
        Iterable<Keyword> keywords = bookService.getAllKeywords();
        model.addAttribute("authors", authors);
        model.addAttribute("keywords", keywords);
        return "bookSearch";
    }

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String showSearchResult(
            @RequestParam(required = false) String bookTitle,
            @RequestParam(required = false) Long keywordId,
            @RequestParam(required = false) Long authorId,
            @RequestParam(defaultValue = "1") Integer page,
            Model model){

        Pageable pageSize = PageRequest.of(page - 1, 2, Sort.by("year").descending());

        Page<Book> booksPage = bookService.findBooks(
                bookTitle,
                authorId,
                keywordId,
                pageSize
        );

        model.addAttribute("books", booksPage.getContent());
        model.addAttribute("pagesQuantity", booksPage.getTotalPages());
        model.addAttribute("currentPage", page);

        return "bookSearch";
    }

}
