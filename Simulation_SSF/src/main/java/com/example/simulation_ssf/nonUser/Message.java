package com.example.simulation_ssf.nonUser;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Message implements Serializable {
    private final  int messageId;
    private int senderId;
    private int receiverId;
    private int missionId;
    private String subject;
    private String content;
    private LocalDate timestamp;
    private String status = "UNREAD"; // "UNREAD", "READ", "ARCHIVED"
    private  String missionType; // "Rescue", "Surveillance" "Protection"


    public Message(int messageId, int senderId, int receiverId, int missionId, String subject, String content, LocalDate timestamp, String status, String missionType) {
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

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public int getMissionId() {
        return missionId;
    }

    public void setMissionId(int missionId) {
        this.missionId = missionId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMissionType() {
        return missionType;
    }

    public void setMissionType(String missionType) {
        this.missionType = missionType;
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

