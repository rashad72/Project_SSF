package com.example.simulation_ssf.User;

import java.io.Serializable;
import java.time.LocalDate;

public class FieldOperative extends Employee implements Serializable {
    private boolean isCaptain = false;
    private boolean inMission = false;
    private int currentMissionId = 0;
    private String availabilityStatus = "Available"; // "Available", "Busy", "Offline"

    public FieldOperative(long nID, long phoneNo, String name, String mailAddress, long employeeId, LocalDate joinDate, String presentAddress, boolean isCaptain, boolean inMission, int currentMissionId, String availabilityStatus) {
        super(nID, phoneNo, name, mailAddress, employeeId, joinDate, presentAddress);
        this.isCaptain = isCaptain;
        this.inMission = inMission;
        this.currentMissionId = currentMissionId;
        this.availabilityStatus = availabilityStatus;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public boolean isInMission() {
        return inMission;
    }

    public int getCurrentMissionId() {
        return currentMissionId;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

    public void setInMission(boolean inMission) {
        this.inMission = inMission;
    }

    public void setCurrentMissionId(int currentMissionId) {
        this.currentMissionId = currentMissionId;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "FieldOperative{" +
                "isCaptain=" + isCaptain +
                ", inMission=" + inMission +
                ", currentMissionId=" + currentMissionId +
                ", availabilityStatus='" + availabilityStatus + '\'' +
                ", employeeId=" + employeeId +
                ", joinDate=" + joinDate +
                ", presentAddress='" + presentAddress + '\'' +
                ", nID=" + nID +
                ", phoneNo=" + phoneNo +
                ", name='" + name + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }
}
