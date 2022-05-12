package com.example.blog.controller;

import com.example.blog.firebaseInterface.FirebaseMessagingService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirebaseMessagingController {

    private FirebaseMessagingService firebaseMessagingService;

    public FirebaseMessagingController(FirebaseMessagingService firebaseMessagingService) {
        this.firebaseMessagingService = firebaseMessagingService;
    }

}
