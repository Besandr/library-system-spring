package com.besandr.repository.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
//@Builder
@Entity
public class Bookcase {

    @Id
    @GeneratedValue
    @Column(name = "bookcase_id")
    private long id;

    @Column(name="shelf_quantity")
    private int shelfQuantity;

    @Column(name = "cell_quantity")
    private int cellQuantity;

//    @OneToMany(mappedBy = "bookcase")
//    private Set<Location> locations;

}
