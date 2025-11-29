package com.example.simulation_ssf.nonUser;

import java.time.LocalDate;
import java.util.List;

public class Team {
    private final String teamId;
    private final String teamName;
    private long captainId;                     //captain's employeeId
    private List<Long> memberIds;               //operative's employeeId list
    private LocalDate validUntil;

    public Team(String teamId, String teamName, long captainId, List<Long> memberIds, LocalDate validUntil) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.captainId = captainId;
        this.memberIds = memberIds;
        this.validUntil = validUntil;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public long getCaptainId() {
        return captainId;
    }

    public List<Long> getMemberIds() {
        return memberIds;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void setCaptainId(long captainId) {
        this.captainId = captainId;
    }

    public void setMemberIds(List<Long> memberIds) {
        this.memberIds = memberIds;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId='" + teamId + '\'' +
                ", teamName='" + teamName + '\'' +
                ", captainId=" + captainId +
                ", memberIds=" + memberIds +
                ", validUntil=" + validUntil +
                '}';
    }
}
