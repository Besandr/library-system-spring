package com.besandr.repository.entities;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
//@EqualsAndHashCode(exclude="books")
//@ToString(exclude = "books")
//@Builder
@Entity
public class Keyword implements Serializable {


    private long id;

    private String word;


    @Id
    @GeneratedValue
    @Column(name = "keyword_id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

//    @ManyToMany(mappedBy = "keywords")
//    public Set<Book> getBooks() {
//        return books;
//    }
//
//    public void setBooks(Set<Book> books) {
//        this.books = books;
//    }
}
