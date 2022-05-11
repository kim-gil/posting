package com.example.blog.service;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import org.springframework.stereotype.Service;

@Service
public class FirebaseMessagingService {
   private FirebaseMessaging firebaseMessaging;

    public FirebaseMessagingService(FirebaseMessaging firebaseMessaging) {
        this.firebaseMessaging = firebaseMessaging;
    }

    public String sendMessage(String targetToken, String title, String body) throws FirebaseMessagingException {
        Message message = makeMessage(targetToken, title, body);
       return firebaseMessaging.send(message);
    }

    public Message makeMessage(String targetToken, String title, String body) {
        Notification notification = Notification
                .builder()
                .setTitle(title)
                .setBody(body)
                .build();
        Message message = Message
                .builder()
                .setNotification(notification)
                .setToken(targetToken)
                .build();
        return message;
    }

}
