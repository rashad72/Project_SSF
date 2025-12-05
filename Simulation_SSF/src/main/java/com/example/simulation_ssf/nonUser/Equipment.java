package com.example.simulation_ssf.nonUser;

import java.time.LocalDate;

public class Equipment {

    private int equipmentID;
    private String equipmentName;
    private String type;
    private int quantity;
    private String status;
    private String assignedTeam;
    private LocalDate lastMaintenanceDate;
    private int usageDuration;
    private int assignedUnit;

    // Alert Center Fields
    private int minimumRequired;
    private LocalDate lastUpdated;

    // Maintenance Schedule Fields
    private LocalDate nextMaintenanceDate;
    private String technician;

    public Equipment(int equipmentID, String equipmentName, String type, int quantity, String status, String assignedTeam, LocalDate lastMaintenanceDate, int usageDuration, int assignedUnit, int minimumRequired, LocalDate lastUpdated, LocalDate nextMaintenanceDate, String technician) {
        this.equipmentID = equipmentID;
        this.equipmentName = equipmentName;
        this.type = type;
        this.quantity = quantity;
        this.status = status;
        this.assignedTeam = assignedTeam;
        this.lastMaintenanceDate = lastMaintenanceDate;
        this.usageDuration = usageDuration;
        this.assignedUnit = assignedUnit;
        this.minimumRequired = minimumRequired;
        this.lastUpdated = lastUpdated;
        this.nextMaintenanceDate = nextMaintenanceDate;
        this.technician = technician;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public LocalDate getNextMaintenanceDate() {
        return nextMaintenanceDate;
    }

    public void setNextMaintenanceDate(LocalDate nextMaintenanceDate) {
        this.nextMaintenanceDate = nextMaintenanceDate;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public int getMinimumRequired() {
        return minimumRequired;
    }

    public void setMinimumRequired(int minimumRequired) {
        this.minimumRequired = minimumRequired;
    }

    public int getAssignedUnit() {
        return assignedUnit;
    }

    public void setAssignedUnit(int assignedUnit) {
        this.assignedUnit = assignedUnit;
    }

    public int getUsageDuration() {
        return usageDuration;
    }

    public void setUsageDuration(int usageDuration) {
        this.usageDuration = usageDuration;
    }

    public LocalDate getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setLastMaintenanceDate(LocalDate lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public String getAssignedTeam() {
        return assignedTeam;
    }

    public void setAssignedTeam(String assignedTeam) {
        this.assignedTeam = assignedTeam;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public int getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(int equipmentID) {
        this.equipmentID = equipmentID;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "equipmentID=" + equipmentID +
                ", equipmentName='" + equipmentName + '\'' +
                ", type='" + type + '\'' +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                ", assignedTeam='" + assignedTeam + '\'' +
                ", lastMaintenanceDate=" + lastMaintenanceDate +
                ", usageDuration=" + usageDuration +
                ", assignedUnit=" + assignedUnit +
                ", minimumRequired=" + minimumRequired +
                ", lastUpdated=" + lastUpdated +
                ", nextMaintenanceDate=" + nextMaintenanceDate +
                ", technician='" + technician + '\'' +
                '}';
    }
}
