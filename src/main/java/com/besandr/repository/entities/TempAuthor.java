package com.besandr.repository.entities;

public class TempAuthor {
}
//
//package com.besandr.repository.entities;
//
//        import lombok.Builder;
//        import lombok.Data;
//        import lombok.EqualsAndHashCode;
//        import lombok.ToString;
//        import org.springframework.transaction.annotation.Transactional;
//
//        import javax.persistence.*;
//        import java.io.Serializable;
//        import java.util.HashSet;
//        import java.util.Set;
//
//        import static javax.persistence.GenerationType.IDENTITY;
//
//@Data
//@EqualsAndHashCode(exclude="books")
//@ToString(exclude = "books")
//@Entity
////@Builder
//public class Author implements Serializable {
//
//
//    private long id;
//
//    private String firstName;
//
//    private String lastName;
//
//    private Set<Book> books = new HashSet<>(0);
//
//    @ManyToMany(mappedBy = "authors", fetch = FetchType.EAGER)
//    public Set<Book> getBooks() {
//        return books;
//    }
//
//    public void setBooks(Set<Book> books) {
//        this.books = books;
//    }
//
//    @Id
//    @GeneratedValue(strategy = IDENTITY)
//    @Column(name = "author_id", unique = true, nullable = false)
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    @Column(name = "first_name")
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    @Column(name = "last_name")
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//}

