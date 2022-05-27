package com.example.blog.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PhoneServiceTestWithH2 {

    @Autowired
    private PhoneService phoneService;

    @Test
    public void addPhoneInfo(){
        phoneService.addPhone("갤럭시","삼송","sk");
    }
}