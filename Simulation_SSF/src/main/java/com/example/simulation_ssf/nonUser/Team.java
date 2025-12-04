package com.example.simulation_ssf.nonUser;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Team implements Serializable {
    private final int teamId;
    private  String teamName;
    private long captainId;                     //captain's employeeId
    private ArrayList<Long> memberIds;               //operative's employeeId list and employee status will change
    private LocalDate validUntil;
    private boolean inMission = false;
    private String teamStatus;

    public Team(int teamId, String teamName, long captainId, ArrayList<Long> memberIds, LocalDate validUntil, boolean inMission, String teamStatus) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.captainId = captainId;
        this.memberIds = memberIds;
        this.validUntil = validUntil;
        this.inMission = inMission;
        this.teamStatus = teamStatus;
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public long getCaptainId() {
        return captainId;
    }

    public ArrayList<Long> getMemberIds() {
        return memberIds;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public boolean isInMission() {
        return inMission;
    }

    public String getTeamStatus() {
        return teamStatus;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setCaptainId(long captainId) {
        this.captainId = captainId;
    }

    public void setMemberIds(ArrayList<Long> memberIds) {
        this.memberIds = memberIds;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
    }

    public void setInMission(boolean inMission) {
        this.inMission = inMission;
    }

    public void setTeamStatus(String teamStatus) {
        this.teamStatus = teamStatus;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                ", captainId=" + captainId +
                ", memberIds=" + memberIds +
                ", validUntil=" + validUntil +
                ", inMission=" + inMission +
                ", teamStatus='" + teamStatus + '\'' +
                '}';
    }
}
