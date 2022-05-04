package com.example.blog.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private long id;
    @Column(columnDefinition = "VARCHAR(16)")
    private String userId;
    @Column(columnDefinition = "VARCHAR(16)")
    private String username;

    public User(String userId, String username) {
        this.userId = userId;
        this.username = username;
    }
}
