package com.example.simulation_ssf.nonUser;

import java.time.LocalDate;

public class Mission {
    private final int missionId;
    private String missionName;
    private String missionType;
    private LocalDate assignDate;
    private int teamCaptainId;
    private String address;
    private String status;
    private Team backupTeam;

    public Mission(int missionId, String missionName, String missionType, LocalDate assignDate, int teamCaptainId, String address, String status, Team backupTeam) {
        this.missionId = missionId;
        this.missionName = missionName;
        this.missionType = missionType;
        this.assignDate = assignDate;
        this.teamCaptainId = teamCaptainId;
        this.address = address;
        this.status = status;
        this.backupTeam = backupTeam;

    }

    public int getMissionId() {
        return missionId;
    }

    public String getMissionName() {
        return missionName;
    }

    public String getMissionType() {
        return missionType;
    }

    public LocalDate getAssignDate() {
        return assignDate;
    }

    public int getTeamCaptainId() {
        return teamCaptainId;
    }

    public String getAddress() {
        return address;
    }

    public String getStatus() {
        return status;
    }

    public Team getBackupTeam() {
        return backupTeam;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public void setMissionType(String missionType) {
        this.missionType = missionType;
    }

    public void setTeamCaptainId(int teamCaptainId) {
        this.teamCaptainId = teamCaptainId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBackupTeam(Team backupTeam) {this.backupTeam = backupTeam;}

    @Override
    public String toString() {
        return "Mission{" +
                "missionId=" + missionId +
                ", missionName='" + missionName + '\'' +
                ", missionType='" + missionType + '\'' +
                ", assignDate=" + assignDate +
                ", teamCaptainId=" + teamCaptainId +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", backupTeam=" + backupTeam +
                '}';
    }
}
