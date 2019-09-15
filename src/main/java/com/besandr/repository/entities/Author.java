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
@EqualsAndHashCode(exclude="books")
@ToString(exclude = "books")
@Entity
//@Builder
public class Author implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "author_id")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;
}
