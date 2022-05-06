package com.example.blog.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Phone {
    private String phoneName;
    private String company;
    private String telecom;

    public Phone(String phoneName, String company, String telecom) {
        this.phoneName = phoneName;
        this.company = company;
        this.telecom = telecom;
    }
}
