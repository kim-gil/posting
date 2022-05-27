package com.example.blog.repository.phone;

import com.example.blog.domain.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneJpaRepository extends JpaRepository<Phone,Integer> {

    Phone findById(int id);

}
