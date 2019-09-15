package com.besandr.repository.entities;

public class TempBook {
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
//@EqualsAndHashCode(exclude={"authors"})
//@ToString(exclude={"authors"})
////@Builder
//@Entity
//public class Book implements Serializable {
//
//
//    private long id;
//    private String title;
//    private int year;
//    private String description;
//    Set<Author> authors = new HashSet<>(0);
////    Set<Keyword> keywords;
//
//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "book_author",
//            joinColumns = {@JoinColumn(name = "book_id", nullable = false, updatable = false)},
//            inverseJoinColumns = {@JoinColumn(name = "author_id", nullable = false, updatable = false)}
//
//    )
//    public Set<Author> getAuthors() {
//        return authors;
//    }
//
//    public void setAuthors(Set<Author> authors) {
//        this.authors = authors;
//    }
//
//    @Id
//    @GeneratedValue(strategy = IDENTITY)
//    @Column(name = "book_id", unique = true, nullable = false)
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    @Column(length = 500)
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
////    @ManyToMany(cascade = { CascadeType.ALL })
////    @JoinTable(
////            name = "book_keyword",
////            joinColumns = {@JoinColumn(name = "book_id", nullable = false, updatable = false)},
////            inverseJoinColumns = {@JoinColumn(name = "keyword_id", nullable = false, updatable = false)}
////    )
////    public Set<Keyword> getKeywords() {
////        return keywords;
////    }
////
////
////    public void setKeywords(Set<Keyword> keywords) {
////        this.keywords = keywords;
////    }
//}
