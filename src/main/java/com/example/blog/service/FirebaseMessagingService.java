package com.example.blog.service;

import com.example.blog.request.FcmMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

@Service
public class FirebaseMessagingService {
    private static final String API_URL = "https://fcm.googleapis.com/v1/projects/example-ac805/messages:send";
    private final ObjectMapper objectMapper;

    public FirebaseMessagingService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }


    public String getAccessToken() throws IOException {
        FileInputStream serviceAccountFile = new FileInputStream("src/main/resources/serviceAccount-File.json");
        GoogleCredentials googleCredentials = GoogleCredentials
                .fromStream(serviceAccountFile)
                .createScoped(List.of("https://www.googleapis.com/auth/cloud-platform"));
        googleCredentials.refreshIfExpired();
        return googleCredentials.getAccessToken().getTokenValue();
    }

    public void sendMessage(String token, String title, String content) throws JsonProcessingException {
        String message = makeMessage(token, title, content);

        OkHttpClient httpClient = new OkHttpClient();
        RequestBody requestBody = RequestBody.create(message, MediaType.get);


    }

    private String makeMessage(String token, String title, String content) throws JsonProcessingException {
         FcmMessage fcmMessage = FcmMessage
                .builder()
                .validateOnly(true)
                .message(Message
                        .builder()
                        .setToken(token)
                        .setNotification(Notification
                                .builder()
                                .setTitle(title)
                                .setBody(content)
                                .setImage(null)
                                .build())
                        .build())
                .build();
         return objectMapper.writeValueAsString(fcmMessage);
    }


}
