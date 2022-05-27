package com.example.blog.service;

import com.example.blog.domain.Phone;
import com.example.blog.firebaseInterface.PhoneService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ExecutionException;

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

    @Test
    public void getPhoneInfo() throws ExecutionException, InterruptedException {
        Phone result = phoneService.getPhoneInfo("123123");
        System.out.println(result.getPhoneName());
        System.out.println(result.getCompany());
        System.out.println(result.getTelecom());
    }
    @Test
    public void updatePhoneInfo() throws ExecutionException, InterruptedException {
        Phone phone = new Phone("123123","LG","kt");
        String result = phoneService.updatePhoneInfo(phone);
        System.out.println(result);
    }
    @Test
    public void deletePhoneInfo(){
        String result = phoneService.deletePhoneInfo("123123");
        System.out.println(result);
    }

}