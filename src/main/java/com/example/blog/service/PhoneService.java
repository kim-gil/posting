package com.example.blog.service;

import com.example.blog.domain.Phone;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class PhoneService {
    public static final String COL_NAME = "phone";

    public String savePhoneInfo(Phone phone) throws ExecutionException, InterruptedException {
        Firestore dbFireStore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture =
                dbFireStore.collection(COL_NAME).document(phone.getPhoneName()).set(phone);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }
}
