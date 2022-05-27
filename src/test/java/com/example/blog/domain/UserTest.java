package com.example.blog.domain;

import com.example.blog.repository.user.UserRepository;
import com.example.blog.repository.user.UserRepositorySupport;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserTest {
    @Autowired
    UserRepository userJpaRepository;

    @Autowired
    UserRepositorySupport userRepositorySupport;

    @Test
    public void queryDslTest() {
        userJpaRepository.deleteAll();
        User user = new User("testId", "testName");
        userJpaRepository.save(user);

        List<User> result = userRepositorySupport.findByUserId(user.getUserId());

        System.out.println(result.size());
        System.out.println(result.get(0).getUserId());

        User user1 = new User("testId1", "testName1");
        userJpaRepository.save(user1);
        List<User> result1 = userJpaRepository.findByUserId(user1.getUserId());
        System.out.println(result1.get(0).getUserId());
    }
}