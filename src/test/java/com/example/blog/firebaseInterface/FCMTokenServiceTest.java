package com.example.blog.firebaseInterface;

import com.example.blog.request.TokenRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ExecutionException;

@SpringBootTest
class FCMTokenServiceTest {
    @Autowired
    FCMTokenService fcmTokenService;
    @Test
    public void saveTest() throws ExecutionException, InterruptedException {
        TokenRequest tokenRequest = new TokenRequest("scubarsh@naver.com","testToken");
        String result = fcmTokenService.save(tokenRequest);
    }


}