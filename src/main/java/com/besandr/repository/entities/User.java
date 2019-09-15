package com.besandr.repository.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
//@Builder
@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private long id;

    private String email;

    private String password;

    private String phone;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private Role role;

    private int karma;
}
