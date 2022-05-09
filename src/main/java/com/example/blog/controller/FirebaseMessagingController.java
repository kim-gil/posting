package com.example.blog.controller;

import com.example.blog.service.FirebaseMessagingService;
import com.google.firebase.messaging.FirebaseMessagingException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirebaseMessagingController {

    private FirebaseMessagingService firebaseMessagingService;

    public FirebaseMessagingController(FirebaseMessagingService firebaseMessagingService) {
        this.firebaseMessagingService = firebaseMessagingService;
    }
    @ResponseBody
    @RequestMapping("/send-notification")
    public String sendFirebaseMessaging(@RequestParam String token,@RequestParam String title,@RequestParam String content) throws FirebaseMessagingException {
        return firebaseMessagingService.sendNotification(title,content,token);
    }
}
