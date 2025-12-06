package com.example.simulation_ssf.nonUser;

import java.io.Serializable;
import java.time.LocalDate;

public class Vehicle implements Serializable {
    private String location;
    private String people;
    private String type;
    private LocalDate Date;

    public Vehicle(String location, String people, String type, LocalDate date) {
        this.location = location;
        this.people = people;
        this.type = type;
        Date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "location='" + location + '\'' +
                ", people='" + people + '\'' +
                ", type='" + type + '\'' +
                ", Date=" + Date +
                '}';
    }
}
