package com.example.simulation_ssf.nonUser;

import java.time.LocalDate;

public class MissionProposal {
    private final int proposalId;
    private String description;
    private String location;
    private String missionType;
    private String situationStatus;
    private LocalDate proposalDate;
    private LocalDate assignDate;

    public MissionProposal(int proposalId, String description, String location, String missionType, String situationStatus, LocalDate proposalDate, LocalDate assignDate) {
        this.proposalId = proposalId;
        this.description = description;
        this.location = location;
        this.missionType = missionType;
        this.situationStatus = situationStatus;
        this.proposalDate = proposalDate;
        this.assignDate = assignDate;
    }

    public int getProposalId() {
        return proposalId;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getMissionType() {
        return missionType;
    }

    public String getSituationStatus() {
        return situationStatus;
    }

    public LocalDate getProposalDate() {
        return proposalDate;
    }

    public LocalDate getAssignDate() {
        return assignDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSituationStatus(String situationStatus) {
        this.situationStatus = situationStatus;
    }

    public void setAssignDate(LocalDate assignDate) {
        this.assignDate = assignDate;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "MissionProposal{" +
                "proposalId=" + proposalId +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", missionType='" + missionType + '\'' +
                ", situationStatus='" + situationStatus + '\'' +
                ", proposalDate=" + proposalDate +
                ", assignDate=" + assignDate +
                '}';
    }
}
