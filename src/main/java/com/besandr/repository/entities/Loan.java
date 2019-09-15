package com.besandr.repository.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
//@Builder
@Entity
public class Loan {

    @Id
    @GeneratedValue
    @Column(name = "loan_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "apply_date")
    private LocalDate applyDate;

    @Column(name = "loan_date")
    private LocalDate loanDate;

    @Column(name = "expired_date")
    private LocalDate expiredDate;

    @Column(name = "return_date")
    private LocalDate returnDate;

}
