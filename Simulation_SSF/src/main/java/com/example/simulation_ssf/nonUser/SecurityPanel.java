package com.example.simulation_ssf.nonUser;

import java.io.Serializable;
import java.time.LocalDate;

public class SecurityPanel implements Serializable {
    private int missionID;
    private LocalDate date;
    private String status;

    public SecurityPanel(int missionID, LocalDate date, String status) {
        this.missionID = missionID;
        this.date = date;
        this.status = status;
    }

    public int getMissionID() {
        return missionID;
    }

    public void setMissionID(int missionID) {
        this.missionID = missionID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SecurityPanel{" +
                "missionID=" + missionID +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}

