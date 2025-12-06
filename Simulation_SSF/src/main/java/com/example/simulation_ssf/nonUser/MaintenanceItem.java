package com.example.simulation_ssf.nonUser;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class MaintenanceItem {
    private StringProperty equipmentID;
    private StringProperty equipmentName;
    private StringProperty category;
    private StringProperty status;
    private StringProperty technician;
    private ObjectProperty<LocalDate> lastMaintenance;
    private ObjectProperty<LocalDate> nextMaintenance;

    public MaintenanceItem(StringProperty equipmentID, StringProperty equipmentName, StringProperty category, StringProperty status, StringProperty technician, ObjectProperty<LocalDate> lastMaintenance, ObjectProperty<LocalDate> nextMaintenance) {
        this.equipmentID = equipmentID;
        this.equipmentName = equipmentName;
        this.category = category;
        this.status = status;
        this.technician = technician;
        this.lastMaintenance = lastMaintenance;
        this.nextMaintenance = nextMaintenance;
    }

    public String getEquipmentID() {
        return equipmentID.get();
    }

    public StringProperty equipmentIDProperty() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentID) {
        this.equipmentID.set(equipmentID);
    }

    public String getEquipmentName() {
        return equipmentName.get();
    }

    public StringProperty equipmentNameProperty() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName.set(equipmentName);
    }

    public String getCategory() {
        return category.get();
    }

    public StringProperty categoryProperty() {
        return category;
    }

    public void setCategory(String category) {
        this.category.set(category);
    }

    public String getStatus() {
        return status.get();
    }

    public StringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public String getTechnician() {
        return technician.get();
    }

    public StringProperty technicianProperty() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician.set(technician);
    }

    public LocalDate getLastMaintenance() {
        return lastMaintenance.get();
    }

    public ObjectProperty<LocalDate> lastMaintenanceProperty() {
        return lastMaintenance;
    }

    public void setLastMaintenance(LocalDate lastMaintenance) {
        this.lastMaintenance.set(lastMaintenance);
    }

    public LocalDate getNextMaintenance() {
        return nextMaintenance.get();
    }

    public ObjectProperty<LocalDate> nextMaintenanceProperty() {
        return nextMaintenance;
    }

    public void setNextMaintenance(LocalDate nextMaintenance) {
        this.nextMaintenance.set(nextMaintenance);
    }

    @Override
    public String toString() {
        return "MaintenanceItem{" +
                "equipmentID=" + equipmentID +
                ", equipmentName=" + equipmentName +
                ", category=" + category +
                ", status=" + status +
                ", technician=" + technician +
                ", lastMaintenance=" + lastMaintenance +
                ", nextMaintenance=" + nextMaintenance +
                '}';
    }
}
