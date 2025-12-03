package com.example.simulation_ssf.nonUser;

import java.io.Serializable;
import java.time.LocalDate;

public class Mission implements Serializable {
    private final int missionId;
    private final String missionName;
    private String Objective;
    private final String missionType;     // "Rescue", "Surveillance" "Protection"
    private String status;          // "Ongoing", "Completed", "Cancelled", "Postponed"
    private final LocalDate assignDate;
    private int assignTeamId; //when team is assigned team status will change
    private String description;
    private long teamCaptainId;
    private String address;
    private boolean hasBackup = false;
    private LocalDate completionDate;

    public Mission(int missionId, String missionName, String missionType, LocalDate assignDate, String objective, String status, int assignTeamId, String description, long teamCaptainId, String address, boolean hasBackup, LocalDate completionDate) {
        this.missionId = missionId;
        this.missionName = missionName;
        this.missionType = missionType;
        this.assignDate = assignDate;
        Objective = objective;
        this.status = status;
        this.assignTeamId = assignTeamId;
        this.description = description;
        this.teamCaptainId = teamCaptainId;
        this.address = address;
        this.hasBackup = false;
        this.completionDate = completionDate;
    }

    public int getMissionId() {
        return missionId;
    }

    public String getMissionName() {
        return missionName;
    }

    public String getObjective() {
        return Objective;
    }

    public String getMissionType() {
        return missionType;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getAssignDate() {
        return assignDate;
    }

    public int getAssignTeamId() {
        return assignTeamId;
    }

    public String getDescription() {
        return description;
    }

    public long getTeamCaptainId() {
        return teamCaptainId;
    }

    public String getAddress() {
        return address;
    }

    public boolean isHasBackup() {
        return hasBackup;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public void setObjective(String objective) {
        Objective = objective;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAssignTeamId(int assignTeamId) {
        this.assignTeamId = assignTeamId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTeamCaptainId(long teamCaptainId) {
        this.teamCaptainId = teamCaptainId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHasBackup(boolean hasBackup) {
        this.hasBackup = hasBackup;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "missionId=" + missionId +
                ", missionName='" + missionName + '\'' +
                ", Objective='" + Objective + '\'' +
                ", missionType='" + missionType + '\'' +
                ", status='" + status + '\'' +
                ", assignDate=" + assignDate +
                ", assignTeamId=" + assignTeamId +
                ", description='" + description + '\'' +
                ", teamCaptainId=" + teamCaptainId +
                ", address='" + address + '\'' +
                ", hasBackup=" + hasBackup +
                ", completionDate=" + completionDate +
                '}';
    }
}
