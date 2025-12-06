package com.example.simulation_ssf.nonUser;

import java.io.Serializable;
import java.time.LocalDate;

public class Notification implements Serializable {
    private final String alertId;
    private String category; // e.g., "Security", "System", "Mission"
    private String message;
    private LocalDate date;
    private String priority; // "High", "Medium", "Low"
    private String status ;   // "READ", "UNREAD"

    public Notification(String alertId, String category, String message, LocalDate date, String priority, String status) {
        this.alertId = alertId;
        this.category = category;
        this.message = message;
        this.date = date;
        this.priority = priority;
        this.status = status;
    }

    public String getAlertId() {
        return alertId;
    }

    public String getCategory() {
        return category;
    }

    public String getMessage() {
        return message;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "alertId='" + alertId + '\'' +
                ", category='" + category + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
