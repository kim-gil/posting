package com.example.blog.firebaseInterface;

import com.example.blog.request.TokenRequest;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class FCMTokenService {
    private static final String COL_NAME = "token";


    public String save(TokenRequest tokenRequest) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> apiFuture = db.collection(COL_NAME).document(tokenRequest.getEmail()).set(tokenRequest);
        return apiFuture.get().getUpdateTime().toString();
    }
}
