package com.example.blog.service;

import com.example.blog.domain.Phone;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PhoneServiceTest {

    @Autowired
    private PhoneService phoneService;

    @Test
    public void saveAndGetPhoneInfo() throws ExecutionException, InterruptedException {
        Phone phone = new Phone("123123", "samsung", "sk");
        String result = phoneService.savePhoneInfo(phone);
        System.out.println(result);
    }

}