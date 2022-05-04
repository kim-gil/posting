package com.example.blog.repository;

import static com.example.blog.domain.QUser.user;

import com.example.blog.domain.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class UserRepositoryImpl extends QuerydslRepositorySupport implements UserRepositoryCustom {
    private JPAQueryFactory jpaQueryFactory;

    public UserRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        super(User.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<User> findByUserId(String userId) {
        return jpaQueryFactory
                .selectFrom(user)
                .where(user.userId.eq(userId))
                .fetch();
    }
}
