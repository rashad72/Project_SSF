package com.example.simulation_ssf.nonUser;

import java.time.LocalDateTime;

public class Message {
    private final int messageId;
    private int senderId;
    private int receiverId;
    private int missionId;
    private String subject;
    private String content;
    private LocalDateTime timestamp;
    private String status;

    public Message(int messageId, int senderId, int receiverId, int missionId, String subject, String content, LocalDateTime timestamp, String status) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.missionId = missionId;
        this.subject = subject;
        this.content = content;
        this.timestamp = timestamp;
        this.status = status;
    }
}
