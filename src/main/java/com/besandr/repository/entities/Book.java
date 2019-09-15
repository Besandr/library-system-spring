package com.besandr.repository.entities;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude={"authors", "keywords"})
@ToString(exclude={"authors", "keywords"})
//@Builder
@Entity
public class Book implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "book_id")
    private long id;

    private String title;

    private int year;

    @Column(length = 500)
    private String description;

    @ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinTable(
            name = "book_author",
            joinColumns = {@JoinColumn(name = "book_id")},
            inverseJoinColumns = {@JoinColumn(name = "author_id")}

    )
    Set<Author> authors;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "book_keyword",
            joinColumns = {@JoinColumn(name = "book_id")},
            inverseJoinColumns = {@JoinColumn(name = "keyword_id")}
    )
    Set<Keyword> keywords;

}