package com.example.blog.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TokenRequest {
    private String email;
    private String token;

    public TokenRequest(String email, String token) {
        this.email = email;
        this.token = token;
    }
}
