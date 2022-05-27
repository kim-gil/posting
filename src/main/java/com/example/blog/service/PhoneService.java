package com.example.blog.service;

import com.example.blog.domain.Phone;
import com.example.blog.repository.phone.PhoneJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PhoneService {
    private PhoneJpaRepository repository;

    public PhoneService(PhoneJpaRepository repository) {
        this.repository = repository;
    }

    public void addPhone(String phoneName, String company, String telecom) {
        Phone phone = new Phone(phoneName, company, telecom);
        long start = System.currentTimeMillis();
        repository.save(phone);
        long end = System.currentTimeMillis();
        System.out.println((end - start)/1000.0);
    }
}
