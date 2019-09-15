package com.besandr.repository.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
//@Builder
@Entity
public class Location {

    @Id
    @GeneratedValue
    @Column(name = "location_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "bookcase_id", nullable = false)
    private Bookcase bookcase;

    @Column(name="shelf_number")
    private int shelfNumber;

    @Column(name="cell_number")
    private int cellNumber;

    @Column(name = "is_occupied")
    private boolean isOccupied;


}
