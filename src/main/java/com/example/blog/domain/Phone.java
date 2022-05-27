package com.example.blog.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "phone")
public class Phone {
    @GeneratedValue
    @Id
    private int id;
    @Column(columnDefinition = "VARCHAR(32)", nullable = false)
    private String phoneName;
    @Column(columnDefinition = "VARCHAR(32)", nullable = false)
    private String company;
    @Column(columnDefinition = "VARCHAR(32)")
    private String telecom;

    @Builder
    public Phone(String phoneName, String company, String telecom) {
        this.phoneName = phoneName;
        this.company = company;
        this.telecom = telecom;
    }
}
