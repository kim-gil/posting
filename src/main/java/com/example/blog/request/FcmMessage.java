package com.example.blog.request;

import com.google.firebase.messaging.Message;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
public class FcmMessage {
    private boolean validateOnly;
    private Message message;

    public FcmMessage(boolean validateOnly, Message message) {
        this.validateOnly = validateOnly;
        this.message = message;
    }
}
