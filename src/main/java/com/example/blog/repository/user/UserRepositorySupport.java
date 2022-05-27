package com.example.blog.repository.user;
import static com.example.blog.domain.QUser.user;
import com.example.blog.domain.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositorySupport extends QuerydslRepositorySupport {
    private final JPAQueryFactory queryFactory;

    public UserRepositorySupport(JPAQueryFactory queryFactory) {
        super(User.class);
        this.queryFactory = queryFactory;
    }

    public List<User> findByUserId(String userId){
        return queryFactory
                .selectFrom(user)
                .where(user.userId.eq(userId))
                .fetch();
    }


}
