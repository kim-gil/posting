package com.example.blog.repository.user;

import com.example.blog.domain.User;

import java.util.List;

public interface UserRepositoryCustom {

    List<User> findByUserId(String userName);
}
