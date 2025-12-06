package com.example.simulation_ssf.nonUser;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class MonitorItem {

    private StringProperty itemID;
    private StringProperty itemName;
    private StringProperty category;
    private StringProperty status;
    private IntegerProperty quantity;
    private IntegerProperty minimumRequired;
    private ObjectProperty<LocalDate> lastUpdated;

    public MonitorItem(StringProperty itemID, StringProperty itemName, StringProperty category, StringProperty status, IntegerProperty quantity, IntegerProperty minimumRequired, ObjectProperty<LocalDate> lastUpdated) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.category = category;
        this.status = status;
        this.quantity = quantity;
        this.minimumRequired = minimumRequired;
        this.lastUpdated = lastUpdated;
    }

    public String getItemID() {
        return itemID.get();
    }

    public StringProperty itemIDProperty() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID.set(itemID);
    }

    public String getItemName() {
        return itemName.get();
    }

    public StringProperty itemNameProperty() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName.set(itemName);
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

    public int getQuantity() {
        return quantity.get();
    }

    public IntegerProperty quantityProperty() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity.set(quantity);
    }

    public int getMinimumRequired() {
        return minimumRequired.get();
    }

    public IntegerProperty minimumRequiredProperty() {
        return minimumRequired;
    }

    public void setMinimumRequired(int minimumRequired) {
        this.minimumRequired.set(minimumRequired);
    }

    public LocalDate getLastUpdated() {
        return lastUpdated.get();
    }

    public ObjectProperty<LocalDate> lastUpdatedProperty() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated.set(lastUpdated);
    }

    @Override
    public String toString() {
        return "MonitorItem{" +
                "itemID=" + itemID +
                ", itemName=" + itemName +
                ", category=" + category +
                ", status=" + status +
                ", quantity=" + quantity +
                ", minimumRequired=" + minimumRequired +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
