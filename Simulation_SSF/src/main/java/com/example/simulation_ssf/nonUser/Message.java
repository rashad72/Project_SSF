package com.example.simulation_ssf.nonUser;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Message implements Serializable {
    private final  int messageId;
    private int senderId;
    private int receiverId;
    private int missionId;
    private String subject;
    private String content;
    private LocalDateTime timestamp;
    private String status = "UNREAD"; // "UNREAD", "READ", "ARCHIVED"
    private  String missionType; // "Rescue", "Surveillance" "Protection"


    public Message(int messageId, int senderId, int receiverId, int missionId, String subject, String content, LocalDateTime timestamp, String status, String missionType) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.missionId = missionId;
        this.subject = subject;
        this.content = content;
        this.timestamp = timestamp;
        this.status = status;
        this.missionType = missionType;
    }

    public int getMessageId() {
        return messageId;
    }

    public int getSenderId() {
        return senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public int getMissionId() {
        return missionId;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getStatus() {
        return status;
    }

    public String getMissionType() {
        return missionType;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", senderId=" + senderId +
                ", receiverId=" + receiverId +
                ", missionId=" + missionId +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                ", status='" + status + '\'' +
                ", missionType='" + missionType + '\'' +
                '}';
    }

}

