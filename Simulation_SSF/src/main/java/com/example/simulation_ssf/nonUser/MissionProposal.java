package com.example.simulation_ssf.nonUser;

import java.io.Serializable;
import java.time.LocalDate;

public class MissionProposal implements Serializable {
    private final int proposalId;
    private String description;
    private String address  ;
    private String missionType;        // "Rescue", "Surveillance" "Protection"
    private String situationStatus;
    private String decisionStatus ="Pending" ; // "Pending", "Approved", "Rejected"
    private LocalDate proposalDate;
    private String comment;
    private LocalDate assignDate;

    public MissionProposal(int proposalId, String description, String address, String missionType, String situationStatus, String decisionStatus, LocalDate proposalDate, String comment, LocalDate assignDate) {
        this.proposalId = proposalId;
        this.description = description;
        this.address = address;
        this.missionType = missionType;
        this.situationStatus = situationStatus;
        this.decisionStatus = decisionStatus;
        this.proposalDate = proposalDate;
        this.comment = comment;
        this.assignDate = assignDate;
    }

    public int getProposalId() {
        return proposalId;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getMissionType() {
        return missionType;
    }

    public String getSituationStatus() {
        return situationStatus;
    }

    public String getDecisionStatus() {
        return decisionStatus;
    }

    public LocalDate getProposalDate() {
        return proposalDate;
    }

    public String getComment() {
        return comment;
    }

    public LocalDate getAssignDate() {
        return assignDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSituationStatus(String situationStatus) {
        this.situationStatus = situationStatus;
    }

    public void setDecisionStatus(String decisionStatus) {
        this.decisionStatus = decisionStatus;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setAssignDate(LocalDate assignDate) {
        this.assignDate = assignDate;
    }

    public void setProposalDate(LocalDate proposalDate) {
        this.proposalDate = proposalDate;
    }
}
