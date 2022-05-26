package com.elsoprojekt.webProjekt.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "users")

@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String username;

    public User(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public User() {
    }
    @Override
    public String toString() {
        return "User [id=" + id + "+password=" + password + "]";
    }
}
